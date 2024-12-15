public class BinarySearch {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int target = 4;

        int si = 0, ei = arr.length - 1;
        int mid = si + ei / 2;
        
        while (si <= ei) {
            if (arr[mid] == target) {
                System.out.println("Element is found at index " + mid);

            } else if (arr[mid] > target) {
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
            mid = si + ei / 2;
        }
    }
}
