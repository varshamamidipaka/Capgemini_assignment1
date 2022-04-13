package Arrays;

import java.util.Scanner;

public class SortArray {
    public static int[] sortArray(int[] arr) {
        int n=arr.length;
        int temp;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
        return arr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int[] sorted=sortArray(arr);
        for(int i=0;i<n;i++)
            System.out.print(sorted[i]+" ");
    }
}
