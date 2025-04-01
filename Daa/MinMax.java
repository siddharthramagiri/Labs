import java.util.*;

class MinMax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of ele:");
        int n = sc.nextInt();
        System.out.print("Enter the ele:");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Max element: " + max);
        System.out.println("Min element: " + min);
        sc.close();
    }
}