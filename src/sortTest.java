package test;

public class sortTest {
    public static void bubbleSort(int[] arr) {

        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    swap(arr, j, j+1);
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String args[]) {
        int arr[] = {5,3,7,4,1};
        System.out.print("변경 전 : ");
        for(int a : arr) {
            System.out.print(a + " ");
        }

        sortTest.bubbleSort(arr);

        System.out.print("\n변경 후 : ");
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }


}
