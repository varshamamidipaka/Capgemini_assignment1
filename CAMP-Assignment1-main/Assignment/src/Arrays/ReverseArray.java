package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        int[] reversed=new int[arr.length];
        for(int i=0;i< arr.length;i++)
            reversed[arr.length-i-1]=arr[i];
        return reversed;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int[] reversed=reverse(arr);
        for(int i=0;i<n;i++)
        System.out.print(reversed[i]+" ");
    }
}
