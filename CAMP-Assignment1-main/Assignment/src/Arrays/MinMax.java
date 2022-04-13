package Arrays;

import java.util.Scanner;

public class MinMax {
    public static void findMinMax(int[] arr) {
        int min=100000;
        int max=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) max=arr[i];
            if(arr[i]<min) min=arr[i];
        }
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        findMinMax(arr);
    }
}
