package string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ReplaceStringTokenizer {
    public static void main(String[] args) {
        String input = "I am stilling coding";
        StringTokenizer stringTokenizer = new StringTokenizer(input);
        while (stringTokenizer.hasMoreElements()) {
            System.out.println(stringTokenizer.nextToken());
        }
        System.out.println();
        System.out.println(Arrays.toString(input.split(" ")))
        ;
    }
}
