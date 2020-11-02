import java.util.Scanner;
public class Main
{
    static void insertionSort(int[] arr,int N)
    {
        for (int index = 1; index < N; index++) 
        { 
            int key = arr[index]; 
            int pos = index-1; 
            while(pos >= 0 && arr[pos] > key) 
            { 
                arr[pos+1] = arr[pos]; 
                pos--; 
            } 
            arr[pos+1] = key; 
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
        insertionSort(arr,N);
        for(Integer num:arr)
        System.out.print(num+" ");
    }
}