package palindrome;

public class palindromeMethods {

    public String palindrome(String str){
        return (new StringBuilder(str).reverse().toString().equals(str) ? "Palindrome" : "Not Palindrome");
    }
}
