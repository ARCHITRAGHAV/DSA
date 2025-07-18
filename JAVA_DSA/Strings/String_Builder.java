package Strings;

public class String_Builder {

    public static void reverse(StringBuilder str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Archit");
//        str.setCharAt(0, 'a'); // archit
//        str.append(" raghav"); // archit raghav
//        str.insert(0, 'E');
//        str.deleteCharAt(0);
//        str.reverse();
//        str.delete(0,8);
//        reverse(str); // str.reverse();
//        System.out.println(str.indexOf("r"));
//        System.out.println(str.substring(0,3));
        System.out.println(str);
    }
}
