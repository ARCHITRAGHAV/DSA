package Arrays2D;

import java.util.ArrayList;

public class Array2DListInJava {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(40);
        a2.add(50);
        a2.add(60);
        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(70);
        a3.add(80);
        a3.add(90);
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a1);
        System.out.println(arr);
        System.out.println(arr.get(1).get(1));
        arr.get(0).set(2, 80);
        System.out.println(arr);
    }
}
