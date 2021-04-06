public class GopMang {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int item : arr1){
            arr[index] = item;
            index++;
        }
        for (int item : arr2){
            arr[index] = item;
            index++;
        }
        for (int item : arr){
            System.out.println(item);;
        }



    }
}
