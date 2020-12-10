//package mycollections;

import java.util.ArrayList; //implements a generic dynamic array

public class GenericMethodDemo {
    static <T> T addAndReturn(T e, ArrayList<T> al) {        
        al.add(e);
        return e;
    }
    public static void main(String[] args) {
        int k = 10;
        Integer ob = k; //autoboxing
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 10; i <= 60; i = i + 10) {
            int item = addAndReturn(i, list);
            System.out.println("item : " + item);
            System.out.println("List = " + list);
        }
        //System.out.println("List = " + list);
    }
}
