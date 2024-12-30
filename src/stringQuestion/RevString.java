
//reverse the string
package stringQuestion;

public class RevString {
    public static void main(String[] args) {
        String st="Vinay Rajpoot";
        String st1="";
        for(int i=st.length()-1;i>=0;i--){
            st1=st1+st.charAt(i);
        }

        System.out.println(st1);

    }
}
