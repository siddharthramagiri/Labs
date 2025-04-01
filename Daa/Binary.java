import java.util.*;

class Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of ele:");
        int n = sc.nextInt();
        System.out.print("Enter the ele:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the key ele:");
        int k = sc.nextInt();
        int low = 0;
        int high = n;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == k) {
                System.out.println("The " + a[mid] + " Key Found at index of " + mid);
                // System.out.println("Key Found at"+mid);
                break;
            } else if (a[mid] < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (low > high) {
            System.out.println("Element is not found!");
        }
        sc.close();
    }
}