import java.util.*;
public class Array2 {
    static void countOccurunesofarray(int x,int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
         if(arr[i]==x)
         {
            count++;
         }

        }
        System.out.println(x+" is present "+count+" times in the arraay");
    }
    static void findLastOccurenceOfarray(int x,int arr[])
    {
        int idx=-1; // whn u find last occurence of an array always initializ 
        //idx with -1 as array element is not found then it will give -1
        //annd if we give 0 then it will show index 0 which will be wrong 
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]==x)
        {
            idx=i;
        }
       }
       System.out.println("the last occurence of "+x+" in array is at index "+idx);
    }
    static void strictlygreater(int x,int arr[])
    {
        int count=0;
for(int i=0;i<arr.length;i++)
{
    if(arr[i]>x)
    {
        count++;
    }
}
System.out.println("The Number of elements strictly greater than "+x+" is "+count ); 
    }
    static boolean isSorted(int arr[])
    {
        boolean check=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                check=false;
                break;

    }
}
return check;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=s.nextInt();
        int[] arr=new int[n];    
        System.out.println("enter "+n+" elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }    
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        countOccurunesofarray(5,arr);
        findLastOccurenceOfarray(20,arr);
        strictlygreater(88,arr);
      System.out.println("Is array sorted "+ isSorted(arr));
    }
}

    
