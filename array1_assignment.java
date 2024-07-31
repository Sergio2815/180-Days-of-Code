

public class array1_assignment {
    void printpositiveValue()
    {
        int arr[]={2,6,-5,-1,0,4,-9};
        // for(int i=0;i<arr.length;i++)
        // {
        //   if(arr[i]>=0)
        //   {
        //     System.out.println(arr[i]+" ");
        //   }
        // }
        for(int value:arr)
        {
            if(value>=0)
            {
                System.out.println(value);
            }
        }
        //in this question as we are searching for only positive values 
        //in the given array so we are traversing the whole therefore we can use
        //for each loop 

    }
        void convert()
        {
            String []arr={"ab","bc","cd","de","ef","fg","gh"};
            for(int i=0;i<arr.length;i++)
            {
                if(i%2!=0)//for this type of question u need to pay attention that it is not needed to check with only teh corresponding element but with i
                
                {
                    System.out.println(arr[i]+" ");
                }
    
                
            }

        }
        void transverse()
        {
            int[] arr={1,2,3,4,5,6,7,8};
            for (int element  : arr) {
                if(element%2==0)//in for each loop the type valuename can be distinct can be diiferent the elelment name 
                //used here can have any name it is not needed to have only certain name

                {
                    System.out.println(element+" ");
                }
                
            }
        }
        void minimumeElement()
        {
            int arr[]={2, -3, 5, 8, 1, 0, -4};
            int min=arr[0];
            for (int i=0;i<arr.length;i++) {
                if(arr[i]<arr[0])
                {
                    min=arr[i];

                // for(int i=1;i<arr.length-1;i++)
                // {
                //     if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                //         System.out.println(arr[i]);
                //         break;
                //     }
                // }in this approach loop is traversing from 2nd array element 
                //and till n-1 as if it will be till n then there will be index 
                // out of bound error.here n is the array length
                }
                
            }
            System.out.println("Minimum element in array"+min);

        }
         void peakElement()//if u use static function then we dont need to create the object of a function


        {
            int arr[]={1, 1, 3, 4, 2, 3, 5, 7, 0};
            int peak=0;
            for(int i=1;i<arr.length;i++)
            {
if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
{
    peak=arr[i];
    break;
}

            }
            System.out.println("The peak element is found="+peak);

        }
    public static void main(String[] args) {
        array1_assignment ob=new array1_assignment();
        ob.printpositiveValue();
        ob.convert();
        ob.transverse();
        ob.minimumeElement();
       ob. peakElement();
    }
    
    
}
