public class LinearSearch {

    public static void linearSearch(int arr[], int n) {

        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                flag = true;
                break;
            }
        }
        if (flag == true)
            System.out.println("Element found");
        else
            System.out.println("Element not found");
    }

    public static void main(String[] args) {

        int arr[] = { 23, 45, 21, 3, 5 };
        int target = 5;
        linearSearch(arr, target);
    }
}
