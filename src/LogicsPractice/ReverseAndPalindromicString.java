package LogicsPractice;

public class ReverseAndPalindromicString {
    public static void main(String[] args) {
        String str = "MadaM";
        String result = "";
        for (int i=str.length()-1;i>=0;i--){
            result=result+str.charAt(i);
    }
        if(str.equalsIgnoreCase(result)){
            System.out.println("It is a Palindrom:   "+ result);
        }
        else{
        System.out.println("Not a Palindrom:   " + result);}
    }
}

// Without using builtin function reverse a string



//public class ReverseAndPalindromicString {
//    public static void main(String[] args) {
//        String str = "Bindu";
//        System.out.println(str);
//        char [] ch = str.toCharArray();
//        int i = 0,j= ch.length-1;
//        while(i<j){
//            char temp = ch[i];
//            ch[i] = ch[j];
//            ch[j] = temp;
//            i++;
//            j--;
//        }
//        System.out.println(ch);
//    }}

// Without using builtin function Palindrome
//public class ReverseAndPalindromicString {
//    public static void main(String[] args) {
//        String str = "Mom";
//        str = str.toLowerCase();
//        System.out.println(str);
//        char [] ch = str.toCharArray();
//        int i =0, j=ch.length-1;
//        while(i<j){
//            if( ch[i] != ch[j]){
//                System.out.println("Not a Palindrom");
//                return;
//            }
//            i++;
//            j--;
//        }
//        System.out.println("Palindrom");
//
//    }}


