import java.util.Scanner;

public class MinArray {
    public static void main(String[] agvr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Max column:= ");
        int maxColumn = sc.nextInt();
        int[] All_arr = new int[maxColumn];
        boolean check = true;
        int min = 0;
        for (int i : All_arr) {
            i = (int) (Math.random() * 90 + 10);
            if (check) {
                min = i;
                check = false;
            }
            if (min > i) {
                min = i;
            }
            System.out.print(i + " ");
        }
        System.out.print("\n");
        System.out.println("Min Array = " + min);
    }
}