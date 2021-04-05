public class FindMax {
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,8,9,2,5,56};
        int max = arr[0];
        for(int x : arr){
            if(max < x){
                max = x;
            }
        }
        System.out.println(max);
    }
}
