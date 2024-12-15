import java.util.*;

public class Large_ele {
    public static void main(String[] args) {

        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array element :");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < 10; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest element in the array is : " + max);
    }
}
