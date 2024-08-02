import java.util.*;
public class Array3 {
    static int uniqueNum(int []arr)
    {
        int n=arr.length;
        int ans=-1;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
            ans=arr[i];
            }
        }
        return ans;

        
    
    }
    static int pairsum(int x,int arr[])
    {
          //Basicaly question asked is to count the number of pairs whose sum is equal to x
          int count=0;
          for(int i=0;i<arr.length;i++)
          {
          for(int j=i+1;j<arr.length;j++)
           {
           if(arr[i]+arr[j]==x)
           {
            count++;
           }

}     //closing j loop
     
          }//closing i loop6
        return count;
    }
    //Using similar approach solving triplets --bacially counting the number of pairs which are triplets
    static int counttriplets(int x,int arr[])
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==x)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
//    in this question the goal is to
//     Find the unique number in a given array where
//  all the elements are repeated twice with one value
// being unique.[5,88,2,88,5]
    static int unique_number(int arr[])
    {
         for(int i=0;i<arr.length;i++)
         {
            for(int j=i+1;j<arr.length;j++)
            {
            if(arr[i]==arr[j])//Relational operator 
            {
                arr[i]=-1;//yha par assignment operator kyuki value assign ho rha hai
                arr[j]=-1;
            }
            
            }
         }
         //in this question i was stucked at thsis point
         //see while revision   
         for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>0)
            {
                 return arr[i];
            }
         }
         return 1;//Indiacate the condition was true
         

          
        
    }
    static int findlargest(int []arr)
    {
        // int max=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;//here it is initialized with min value because we cant take negative value and if we take int.max
        //then we cant find the max elelement in given array

        // int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i]>max)
          {
            max=arr[i];
          }   }
          return max;
    }
    static int findSecondMax(int []arr)
    {
        int mx=findlargest(arr);
        for(int i=0;i<arr.length;i++)
    
        {
            if(arr[i]==mx)//yha par arr[i] print esliye kiya hai kyuki agr mx print krega to agar array me max element 2 bar hoga toh yeh last index wala ko sirf
            //min value krega toh 2nd min me hmesa whi element ayega ese thik krne ke liye yha arr[i]=intminvalue print hua
            {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondMax=findlargest(arr);
    
return secondMax;
    }
    static int  findsmallest(int []arr)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
       if(arr[i]<min)
       {
        min=arr[i];
       }
       }
       return min;
        }
    static int find2ndSmallest(int []arr)
    {
        int min2=findsmallest(arr);
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==min2)
            {
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int ndmin=findsmallest(arr);
        return ndmin;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array size");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.println("enter "+n+" elements");  
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }   
        // System.out.println("unique number "+uniqueNum(arr));
        // System.out.println("Total  pairs are "+pairsum(8, arr));
        // System.out.println("Total  pairs are "+counttriplets(8, arr));
        // System.out.println("The unique number is found to be "+unique_number(arr));
System.out.println("the largest element is "+findlargest(arr));
System.out.println("the 2nd largest element is"+findSecondMax(arr));
System.out.println("the smallest element is "+findsmallest(arr));5

// System.out.println("2nd Smallest element "+find2ndSmallest(arr));
    }
}
