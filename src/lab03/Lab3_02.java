package lab03;

public class Lab3_02 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        int maxNum = intArr[0];
        int minNum = intArr[0];
        int[] var4 = intArr;
        int var5 = intArr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int n = var4[var6];
            if (minNum > n) {
                minNum = n;
            }

            if (maxNum < n) {
                maxNum = n;
            }
        }

        System.out.println("Maximum is " + maxNum);
        System.out.println("Miximum is " + minNum);
    }

}
