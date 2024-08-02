/**
 * Array4
 */
public class Array4 {
//Approach 1 
    static int[] reverse_array(int arr[])//yha par int me array esliye liya 
   //  kyuki yha array return kr rha hai
    {
        //using for loop
        int n=arr.length;
        int a[]=new int[n];
        // int i=0;
    //     for(int j=n-1;j>=0;j--)
    //     {
    //         a[i++]=arr[j];
    //     }
    
    //     return a;//yha par array traverse ho rha hai ulta aur phir value check ho rha hai
    // jb bhi value usse less hai toh print kar rha hai
    // }
    //using while loop 
int i=0;
int j=n-1;
while(j>=0)
{
    a[i++]=arr[j--];
}
return a;
    }
    static void swapInArray(int []arr,int i,int j)
    {
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp;
    }
static void swapUsingInspace(int arr[],int i,int j)
{
     i=0;j=arr.length-1;
    while(i<j)
    {
        swapInArray(arr, i, j);
        i++;
        j--; 
    }        
}   // approach 2 --in space in which no new array is created 
    // and we are reversing the same array
   static void rotatearraybyksteps(int arr[],int k)
    {
        int n=arr.length;
        k=k%n;// It calculates the effective rotation 
        //steps by taking the modulus of K with the length of the array (to handle cases where K is greater than the array length).
        swapUsingInspace(arr,0,n-k-1);
        swapUsingInspace(arr,n-k,n-1);
        swapUsingInspace(arr, 0, n-1);

    }
    //frequecy arrays and queries
    // toh basically ye question me hme kuch queries diya hoga number ke form me hme check krna hai agr wo query present hai toh
    //print karna hai yes nhi toh no aur elements in array hoga oh 10^5 tak hoga
    static int[] frequencyArray(int arr[], int q,) {
        int n=arr.length;
        int[] freq = new int[100005];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]=freq[arr[i]]+1;
            }
            return freq;

        }
         
public static void main(String args[])
{
    int arr[]={55,2,1,7,-8};
// //  using in space calling 
array
// swapUsingInspace(arr,0,n-1);//yha par print karne ke liye phir se traverse krna pda 
// for(int i=0;i<arr.length;i++)
// {
//     System.out.println(arr[i]+" ");
// }

rotatearraybyksteps(arr, 8);
for(int i=0;i<arr.length;i++)
{
    System.out.println(arr[i]+" ");
}
while (q>0)
{
    int value;

}
}
}
