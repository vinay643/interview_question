package arrayQues;

public class SumElement {
    public static void main(String[] args) {
        int arr[] ={20,50,54,21,65};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array element: " + sum);
    }
}
