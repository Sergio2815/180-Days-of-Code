

public class Array1 {
    void SumOfarray()
 {
    
        int []arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum +=arr[i];
         }
            System.out.println("The given array sum is="+sum);

}
    void findminarray()
    {
         int arr[]={55,-8,81,-66,8,5};
        int min=arr[0];//here this is the optimal approacg to solve any array max/min by checking with the array elements only
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];//this approach is good for solving values of array which are positive
                //but to solve if any value is negative in given set of array 
           
            }    
        }    System.out.println("The min in array is "+min);
    }
     void findMaxarray()
     {
        int arr[]={55,8,-81,66,8,5};
        int max=arr[0];//here this is the optimal approacg to solve any array max/min by checking with the array elements only
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];//this approach is good for solving values of array which are positive
                //but to solve if any value is negative in given set of array 
           
            }    
        }    System.out.println("The max in array is "+max);
    }
    void searchXelement(int x,int ans)
     {
    
        int arr[]={1,5,3,55,8,3,88,7,7,3};//when u search an element in an given array if the answer is not found in the given set of array
        //then it will return -1
        //when a array is given and u perform searching of any element but in the array two elements are same
        //then we should use break statement to stop the iterartion after the first element is found
        // int x=5;
        int n=arr.length;
        int i=0;
        // int ans=-1;
        while(i<n)
        {
            if(arr[i]==x)
            {
                ans=i;
                break;
            }
            i++;
        }
        System.out.println("the given no is found to be at index "+ans);
        }
    public static void main(String[] args) {
        Array1 obj=new Array1();
        obj.findminarray();
        obj.findMaxarray();
        obj.searchXelement(3,-1);//generally when u code u should practice to give search element and and other values as parameter
        obj.SumOfarray();

    }