public class RevArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int si=0,ei=arr.length-1;
        while(si<ei) {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
