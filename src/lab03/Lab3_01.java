package lab03;

public class Lab3_01 {

    public static void main(String[] args) {
        int[] myArray = new int[]{2, 4, 9, 35, 25, 39};
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < myArray.length; ++i) {
            if (myArray[i] % 2 == 0) {
                ++evenCount;
            } else {
                ++oddCount;
            }
        }

        System.out.println("Even numbers:" + evenCount);
        System.out.println("Odd numbers:" + oddCount);
    }
}
