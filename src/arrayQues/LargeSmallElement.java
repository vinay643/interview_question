package arrayQues;

public class LargeSmallElement {
    public static void main(String[] args) {
       int arr[] ={25,89,40,75,50,15};
       int max=arr[0];
       int min=arr[0];
       int j=0;
       for(int i=0;i<arr.length;i++){
           if(max<arr[i]){

               max=arr[i];
           }
           if(min>arr[i]){
               min=arr[i];

           }


       }


        System.out.println(max+"  "+min);


    }
}
