public class SecLargeEle {
    public static void main(String[] args) {

        int arr[] = { 12, 34, 56, 8, 55 };
        int n = arr.length;
        int max = -1;
        int secmax = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            if (arr[i] != max && secmax < arr[i]) {
                secmax = arr[i];
            }
        }
        System.out.println("Second leargest element is :" + secmax);
    }
}
