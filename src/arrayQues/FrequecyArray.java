

//calculate frequency of the array
package arrayQues;

public class FrequecyArray {
    public static void main(String[] args) {
        int arr[]={80,32,45,85,60,85};
        int len =arr.length;
        for(int i=0;i<len;i++){
            int count=1;
            for(int j=i+1;j<len;j++){

                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=arr[len-1];
                    len--;
                    j--;
                }

            }
            System.out.println(arr[i]+"-----> "+count);
        }
    }
}
