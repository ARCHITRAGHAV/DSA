package ArraysAndArrayLists;

public class Questions {

    public static int maxSubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void sort0s1s2s(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        print(arr);
    }

    public static void MergeTwoSortedArrays(int a[], int b[], int c[]) {
        int i = a.length - 1;
        int j = b.length - 1;
        int k = c.length - 1;
        while (i >= 0 && j >= 0) {
            if (a[i] > b[j]) {
                c[k] = a[i];
                i--;
            } else {
                c[k] = b[j];
                j--;
            }
            k--;
        }
        while (i >= 0) {
            c[k] = a[i];
            i--;
            k--;
        }
        while (j >= 0) {
            c[k] = b[j];
            j--;
            k--;
        }
        print(c);
    }

    public static void waveArray(int arr[]) {
        for (int i = 0; i < arr.length - 1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        print(arr);
    }

    public static void segregate0s1sMethod2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] == 0) start++;
            else if (arr[end] == 1) end--;
            else if (arr[start] == 1 && arr[end] == 0) {
                arr[start] = 0;
                arr[end] = 1;
                start++;
                end--;
            }
        }
        print(arr);
    }

    public static void segregate0s1s(int[] arr) {
        int n0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) n0++;
        }
        for (int i = 0; i < n0; i++) {
            arr[i] = 0;
        }
        for (int i = n0; i < arr.length; i++) {
            arr[i] = 1;
        }
        print(arr);
    }

    public static int missing(int[] arr) {
        long n = arr.length + 1;
        long sum = n * (n + 1) / 2;
        long arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        return (int) (sum - arrSum);
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int max2(int[] arr) {
        int max2 = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (max2 < ele && maxElement(arr) != ele) {
                max2 = ele;
            }
        }
        return max2;
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.print(arr[i] + " " + arr[j]);
                    break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void linearSearch(int[] arr, int target) {
        boolean flag = false;
        for (int ele : arr) {
            if (ele == target) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }

    public static void changeArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i] + 10;
            } else {
                arr[i] = arr[i] * 2;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static int minElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele : arr) {
            if (min > ele) {
                min = ele;
            }
        }
        return min;
    }

    public static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (max < ele) {
                max = ele;
            }
        }
        return max;
    }

    public static int productOfArrayElements(int[] arr) {
        int product = 1;
        for (int ele : arr) {
            product *= ele;
        }
        return product;
    }

    public static int sumOfArrayElements(int[] arr) {
        int sum = 0;
        for (int ele : arr) {
            sum += ele;
        }
        return sum;
    }

    public static void printNegative(int[] arr) {
        for (int ele : arr) {
            if (ele < 0) {
                System.out.print(ele + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-8, -9, -5, 7, 4, 2, 3, 45};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] nums = {6, 8, 1, 2, 4, 9, 0};
        int[] nums1 = {0, 1, 0, 1, 0, 1, 0};
        int[] nums2 = {2, 1, 0, 2, 1, 0};
        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8};
        int[] c = new int[a.length + b.length];

//        printNegative(arr);

//        int[] brr = new int[arr.length];
//        for (int ele : brr) {
//            System.out.print(ele + " ");
//        }

//        System.out.println(sumOfArrayElements(arr));
//        System.out.println(productOfArrayElements(arr));
//        System.out.println(maxElement(arr));
//        System.out.println(minElement(arr));
//        changeArray(arr1);
//        linearSearch(arr1, 50);
//        twoSum(arr1, 50);
//        System.out.println(max2(arr));
//        reverse(arr);
//        print(arr);
//        rotate(nums, 45);
//        System.out.println(missing(arr1));
//        segregate0s1sMethod2(nums1);
//        waveArray(arr1);
//        MergeTwoSortedArrays(a, b, c);
//        sort0s1s2s(nums2);
    }
}
