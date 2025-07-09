package Arrays2D;

public class SearchRowSortedArray {

    public static boolean search(int[][] arr, int target) {
        int i = 0;
        int j = arr[0].length - 1;
        while (i < arr.length && j >= 0) {
            if (arr[i][j] == target) {
                return true;
            }
            if (arr[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        int target = 14;
        System.out.println(search(arr,target));;
    }
}
