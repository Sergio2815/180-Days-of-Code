public class array3assignment {
 
        static void differece()
        {
            int  x=6;
            int arr[]={6,12,18,26,28};
            for(int i=0;i<arr.length;i++)
            {
               for(int j=i+1 ;j<arr.length;j++)
               {
              if(arr[j]-arr[i]==x)
              
                System.out.println("yes");
                return;
                
              }
               }
        System.out.println("No");
          
        }
    
    static void cCountnoOfoccurences(int x)
    {
        int []a={77,5,77,5,7,5,7,77};
        int c=0;
        for(int i=0;i<a.length;i++)
        {
        //   for(int j=i+1;j<a.length;j++)
        //   {
            if(a[i]==x)
            {
                c++;
            }
          }
          System.out.println("The total number of occurences of "+x+ " in given array is" +c);
        }
    //- Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
//missing number from the first N integers. There are no duplicates in the list.
           
        public static void main(String[] args) {
            differece();
            System.out.println();
            cCountnoOfoccurences(77);

    }}
