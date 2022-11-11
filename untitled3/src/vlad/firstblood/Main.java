package vlad.firstblood;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,3,2,9,6,2,5,1,6,9};
        ArrayUtils.createMatrix(4,5);
        arr = ArrayUtils.reverse(arr,4);
        System.out.println(Arrays.toString(arr));
    }
}
