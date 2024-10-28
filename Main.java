//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(smallest(8,5,9));
        System.out.println(check(0));
        System.out.println(validPassword("12345abcde"));
    }


//1.Write a Java method to find the smallest number among three numbers
    public static int smallest(int n1,int n2,int n3){
        if(n1<n2 && n2<n3)return n1;
        else if (n2<n1 && n2<n3) return n2;
        else return n3;
    }

//2.Write a Java method that check if the entered number is negative or positive or zero.
    public static String check(int n){
        if(n==0)return "Zero";
        else if (n>0) return "positive";
        else return "negative";
    }

//3.Write a Java method to check whether a string is a valid password.
    public static boolean validPassword(String password) {

    if (password.length() < 10) return false;

    int Count = 0;
    for (int i = 0; i < password.length(); i++) {
        char ch = password.charAt(i);
        if (!Character.isLetterOrDigit(ch)) return false;
        if (Character.isDigit(ch)) Count++;
    }
    return Count >= 2;
    }
}