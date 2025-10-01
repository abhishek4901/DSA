import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        
        int i = 0;
        int j = str.length() - 1;
        int c =0;

        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                c= 1;
                break;
            }
            i++;
            j--;
        }

        if (c==0) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is NOT a palindrome");
        }
    }
}
