package lab06;

public class Lab6_01 {

    public static void main(String[] args) {
        String inputString = "2hour and 5 minutes";
        String replaceString = inputString.replaceAll("[^0-9]+", ",");
        String[] time = replaceString.split(",");
        Integer hours = Integer.parseInt(time[0]);
        Integer minutes = Integer.parseInt(time[1]);
        Integer totalMin = hours*60 + minutes;
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println("Tong so phut la " + totalMin);
    }
}
