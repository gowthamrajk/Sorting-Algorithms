import java.util.Scanner;
public class Main
{
    static void merge(int arr[], int beg, int mid, int end)  
    {  
        int L = mid-beg+1;  
        int R = end-mid;  
        int[] LeftArray = new int[L];  
        int[] RightArray = new int[R];  
        for(int index = 0;index < L;index++)  
        {
            LeftArray[index] = arr[beg+index];  
        }
        for(int index = 0;index < R;index++)  
        {
            RightArray[index] = arr[mid+1+index];  
        }
        int leftIndex = 0, rightIndex = 0;  
        int index = beg;  
        while(leftIndex < L && rightIndex < R)  
        {  
            if (LeftArray[leftIndex] <= RightArray[rightIndex])  
            {  
                arr[index] = LeftArray[leftIndex];  
                leftIndex++;  
            }  
            else  
            {  
                arr[index] = RightArray[rightIndex];  
                rightIndex++;  
            }  
            index++;  
        }  
        while(leftIndex < L)  
        {  
            arr[index] = LeftArray[leftIndex];  
            leftIndex++;  
            index++;  
        }  
        while(rightIndex < R)  
        {  
             arr[index] = RightArray[rightIndex ];  
             rightIndex++;  
             index++;  
        }  
    }
    static void sort(int arr[], int beg, int end)  
    {  
        if (beg<end)  
        {  
            int mid = (beg+end)/2;  
            sort(arr, beg, mid);  
            sort(arr , mid+1, end);  
            merge(arr, beg, mid, end);  
        }  
    }  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int index=0;index<N;index++)
        {
            arr[index]=sc.nextInt();
        }
        System.out.println("Before Sorting: ");
        for(Integer num:arr)
        System.out.print(num+" ");
        System.out.println();
        System.out.println("After Sorting: ");
        sort(arr,0,N-1);
        for(Integer num:arr)
        System.out.print(num+" ");
    }
}