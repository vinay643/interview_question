package arrayQues;

import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[]=new int[n>m?n:m];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=arr3.length-1;
        int c=0;

        while(k>=0){
            int sum=c;
            if(i>=0){
                sum=sum+arr1[i];

            }
            if(j>=0){
                sum=sum+arr2[j];
            }
            arr3[k]=sum%10;
            c=sum/10;
            i--;
            j--;
            k--;
        }
        System.out.println();

        if(c>0){
            System.out.print(c+" ");
        }
        for(int val:arr3){
            System.out.print(val+" ");
        }
    }
}
