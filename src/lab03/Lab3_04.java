package lab03;

import java.util.Arrays;

public class Lab3_04 {
    public static void main(String[] args) {
        int[] myArray1 = new int[]{1, 12, 16, 28, 34};
        int arrLen1 = myArray1.length;
        int[] myArray2 = new int[]{1, 13, 16, 27, 99};
        int arrLen2 = myArray2.length;
        int[] mergerArray = new int[arrLen1 + arrLen2];
        int ctr1 = 0;
        int ctr2 = 0;

        int ctrM;
        for(ctrM = 0; ctr1 < arrLen1 && ctr2 < arrLen2; ++ctrM) {
            if (myArray1[ctr1] < myArray2[ctr2]) {
                mergerArray[ctrM] = myArray1[ctr1];
                ++ctr1;
            } else {
                mergerArray[ctrM] = myArray2[ctr2];
                ++ctr2;
            }
        }

        while(ctr1 < arrLen1) {
            mergerArray[ctrM] = myArray1[ctr1];
            ++ctr1;
        }

        while(ctr2 < arrLen2) {
            mergerArray[ctrM] = myArray2[ctr2];
            ++ctr2;
        }

        ++ctrM;
        System.out.println(Arrays.toString(mergerArray));
    }
}
