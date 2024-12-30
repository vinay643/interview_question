package arrayQues;

public class CheckSorted {
    public static void main(String[] args) {

        int arr[]={10,20,35,30,40};
        int len=arr.length;
        boolean bl=isSorted(arr,len);
        if(bl){
            System.out.println("array is sorted");
        }else{
            System.out.println("array is not sorted");
        }

    }
    static boolean isSorted(int arr[],int len){

        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

}
