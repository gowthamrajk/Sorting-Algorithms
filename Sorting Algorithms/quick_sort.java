import java.util.Scanner;
public class Main
{
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int index1 = (low-1);
        for(int index2 = low; index2< high; index2++) 
        { 
            if(arr[index2] < pivot) 
            { 
                index1++; 
                swap(arr,index1,index2);
            } 
        } 
        swap(arr,index1+1,high);
        return index1+1; 
    } 
    static void sort(int arr[], int low, int high) 
    { 
        if(low < high) 
        { 
            int pivot = partition(arr,low,high);
            sort(arr,low,pivot-1); 
            sort(arr,pivot+1,high); 
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