package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainerTest {

    @Test
    public void addAfterAndDeleteAfterAndFindElem() {
        Container Test=new Container();
        Test.addAfter(1);
        Test.addAfter(2);
        Test.addAfter(3);
        Test.addAfter(4);
        Test.addAfter(5);
        Test.deleteAfter();
        Test.deleteAfter();
        assertTrue(Test.findElem(3));
        assertTrue(Test.findElem(2));
        assertTrue(Test.findElem(1));
        assertFalse(Test.findElem(5));
    }

    @Test
    public void addBackAndDeleteEndAndFindIndex() {
        Container Test=new Container();
        Test.addBack(1);
        Test.addBack(2);
        Test.addBack(3);
        Test.addBack(4);
        Test.addBack(5);
        Test.print();
        Test.deleteEnd();
        Test.deleteEnd();
        assertTrue(Test.findIndex(0));
        assertTrue(Test.findIndex(1));
        assertTrue(Test.findIndex(2));
        assertFalse(Test.findIndex(3));
        assertFalse(Test.findIndex(4));
    }

    @Test
    public void addIndexAndDeleteIndexAndDeleteElemAndFindIndex() {
        Container Test=new Container();
        Test.addIndex(1,0);
        Test.addIndex(2,1);
        Test.addIndex(3,2);
        Test.addIndex(4,3);
        Test.addIndex(5,4);
        Test.addIndex(10,2);
        Test.deleteIndex(0);
        Test.deleteElem(4);
        assertTrue(Test.findIndex(0));
        assertTrue(Test.findIndex(1));
        assertTrue(Test.findIndex(2));
        assertTrue(Test.findIndex(3));
        assertFalse(Test.findIndex(4));
    }


    @Test
    public void deleteElemAndFindElement() {
        Container Test=new Container();
        Test.addBack(2);
        Test.addBack(2);
        Test.addBack(2);
        Test.addBack(3);
        Test.addBack(2);
        Test.deleteElem(2);
        assertTrue(Test.findElem(3));
        assertFalse(Test.findElem(2));

    }
}