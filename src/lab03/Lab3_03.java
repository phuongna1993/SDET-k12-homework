package lab03;

import java.util.Arrays;

public class Lab3_03 {
    public static void main(String[] args) {
        int[] myArray = new int[]{12, 34, 1, 16, 28, 9, 29, 40};
        int myArrLen = myArray.length;

        for(int unsortIndex = myArrLen - 1; unsortIndex > 0; --unsortIndex) {
            for(int innerIndex = 0; innerIndex < unsortIndex; ++innerIndex) {
                if (myArray[innerIndex] > myArray[innerIndex + 1]) {
                    int tem = myArray[innerIndex];
                    myArray[innerIndex] = myArray[innerIndex + 1];
                    myArray[innerIndex + 1] = tem;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));
    }

}
