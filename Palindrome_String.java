public class Palindrome_String {
    public static void main(String [] ars){
        String name="sukhjeet";
        String rev="";
        for(int i =name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equals(rev)){
            System.out.println("the string is palidrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }
    }
}
