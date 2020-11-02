import java.util.Scanner;
public class Main
{
    static void swap(int[] arr,int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    static void bubbleSort(int[] arr,int N)
    {
        for(int k=0;k<N-1;k++)
        {
            int flag=0;
            for(int index=0;index<N-k-1;index++)
            {
                if(arr[index]>arr[index+1])
                {
                    swap(arr,index,index+1);
                    flag=1;
                }
            }
            if(flag==0)
            break;
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
        bubbleSort(arr,N);
        for(Integer num:arr)
        System.out.print(num+" ");
    }
}