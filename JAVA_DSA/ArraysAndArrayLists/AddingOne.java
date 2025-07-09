package ArraysAndArrayLists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {7, 9, 8, 9};
        int carry = 1;
        ArrayList<Integer> arrNew = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] + carry <= 9) {
                arrNew.add(arr[i] + carry);
                carry = 0;
            } else {
                arrNew.add(0);
                carry = 1;
            }
        }
        if (carry == 1) {
            arrNew.add(1);
        }
        Collections.reverse(arrNew);
        System.out.println(arrNew);
    }
}
