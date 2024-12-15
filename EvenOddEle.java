public class EvenOddEle {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even numbers in array: " + even);
        System.out.println("Even numbers in array: " + odd);
    }

}
