import java.util.*;
public class takinginput {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=s.nextInt();
        System.out.println("Enter "+n+"array elements");
        int[] a=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
    }
    
}
