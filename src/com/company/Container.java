package com.company;



public class Container {

    public Container() {
        mas= new int[0];
    }

    private int []mas;


    //Добавление элемента
    //Добавление в начало
    public boolean addAfter(int elem) {
        int []newMas=new int[mas.length+1];
        newMas[0]=elem;
        for (int i=0;i< mas.length;i++){
            newMas[i+1]=mas[i];
        }
        mas=newMas;
        return true;
    }
    //Добавление в конец
    public boolean addBack(int elem) {
        int []newMas=new int[mas.length+1];
        for (int i=0;i< mas.length;i++){
            newMas[i]=mas[i];
        }
        newMas[newMas.length-1]=elem;
        mas=newMas;
        return true;
    }
    //Добавление по индексу
    public boolean addIndex(int elem, int index) {
        if (index < mas.length+1 && index>-1  ) {
            int[] newMas = new int[mas.length + 1];
            for (int i = 0; i < index; i++) {
                newMas[i] = mas[i];
            }
            newMas[index] = elem;
            for (int i = newMas.length - 1; i > index; i--) {
                newMas[i] = mas[i - 1];
            }
            mas = newMas;
            return true;
        }
        return false;
    }


    //Поиск
    //Поиск элемента по индексу и вывод его на экран
    public  boolean findIndex(int index) {
        if(mas!=null && index>-1 && index<mas.length) {
            System.out.println(mas[index]);
            return true;
        }
        return false;
    }


    //Поиск индекса(ов) элемента и вывод на экран строки индексов
    public boolean findElem(int elem) {
        if(mas!=null) {
            String result = "Indexes of element: ";
            String temp; int k=0;
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] == elem) {
                    temp = Integer.toString(i);
                    result = result + temp;
                    k++;
                }
            }
            System.out.println(result);
            if(k>0) return true;
        }
        return false;
    }


    //Удаление
    //Удаление первого элемента
    public  boolean deleteAfter() {
        if(mas!=null) {
            int[] newMas = new int[mas.length - 1];
            for (int i = 0; i < mas.length - 1; i++) {
                newMas[i] = mas[i + 1];
            }
            mas = newMas;
            return true;
        }
        return false;
    }
    //Удаление последнего элемента
    public  boolean deleteEnd() {
        if(mas!=null) {
            int[] newMas = new int[mas.length - 1];
            for (int i = 0; i < mas.length - 1; i++) {
                newMas[i] = mas[i];
            }
            mas = newMas;
            return true;
        }
        return false;
    }
    //Удаление элемента по индексу
    public  boolean deleteIndex(int index) {
       if(mas!=null) {
            if(mas.length==1) {
               mas=null;
               return true;
            }
            else{
                if(index<mas.length && index>-1)
                 {
                     int[] newMas = new int[mas.length - 1];
                     for (int i = 0; i < index; i++) {
                         newMas[i] = mas[i];
                     }
                     for (int i = newMas.length - 1; i > index - 1; i--) {
                         newMas[i] = mas[i + 1];
                     }
                 mas=newMas;
                 }
                 return true;
            }
        }
        return false;
    }
    //Удаление заданного элемента
    public  boolean deleteElem(int elem) {
        if(mas!=null) {
            for(int i=0; i<mas.length; i++) {
              if(mas[i]==elem){
                deleteIndex(i);
                i--;
              }
            }
            return true;
        }
        return false;
    }


    //Печать массива элементов
    public  void print() {
        if(mas!=null) {
            for (int i = 0; i <= mas.length - 1; i++) {
                System.out.println(mas[i]);
            }
        }
    }
}
