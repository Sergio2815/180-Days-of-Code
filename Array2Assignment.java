import java.util.Arrays;

public class Array2Assignment {
    static void checkPositive() {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] temp = new int[arr.length];//yha par ek new array le liya same length jo ki original array ka hai

        int index = 0;

        // Copy positive elements to temp
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy negative elements to temp
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

    }

    static void findKthlargest()
    {
        int arr[]={7,10,4,3,20,15};
         int k=4;
        Arrays.sort(arr);
        int n=arr.length;
        int findKthlargestk=arr[k-1];
            
                System.out.println("The kth largest element is"+findKthlargestk);
            }
    
    public static void main(String[] args) {
        checkPositive();
        findKthlargest();
    }
    
}
