import java.util.Scanner;
public class Vowel{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to  count the vowel ");
        int count =0;
        String str = sc.nextLine();
         str = str.toLowerCase();//for change the string in lower case
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);//for single word (string ko ek ek word me todne liye )
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    

        
    }  
}