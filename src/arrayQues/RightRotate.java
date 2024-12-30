//right rotate array by k

package arrayQues;

import java.util.Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int temp[]=new int[arr.length];
        int k=2;
        int n=arr.length;
        for(int i=0;i<k;i++){
            temp[i]=arr[n-k+i];

        }
        for(int i=0;i<n-k;i++){
            temp[k+i]=arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
        System.out.println(Arrays.toString(arr));


    }
}
