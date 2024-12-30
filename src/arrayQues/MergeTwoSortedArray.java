package arrayQues;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a1[]={1,3,5};
        int a2[]={2,4,6};
        System.out.println("merge sorted array: "+ Arrays.toString(megeSortedArray(a1,a2)));

    }
    static int[] megeSortedArray(int[] a1,int[] a2){
        int len1=a1.length;
        int len2=a2.length;
        int i=0;
        int j=0;
        int k=0;
        int temp[]=new int[len1+len2];
        while(i<len1 && j<len2){
            if(a1[i]<=a2[j]){
                temp[k]=a1[i];
                i++;
                k++;
            }else{
                temp[k]=a2[j];
                k++;
                j++;
            }

        }

        while(i<len1){
            temp[k]=a1[i];
            i++;
            k++;
        }
        while(j<len2){
            temp[k]=a2[j];
            k++;
            j++;
        }

        return temp;


    }

}
