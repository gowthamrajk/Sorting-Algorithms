import java.util.Scanner;
public class Main
{
    static void selectionSort(int[] arr,int N)
    {
        for(int index1=0;index1<N;index1++)
        {
            int minIndex=index1;
            for(int index2=index1+1;index2<N;index2++)
            {
                if(arr[index2]<arr[minIndex])
                minIndex=index2;
            }
            int temp=arr[index1];
            arr[index1]=arr[minIndex];
            arr[minIndex]=temp;
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
        selectionSort(arr,N);
        for(Integer num:arr)
        System.out.print(num+" ");
    }
}