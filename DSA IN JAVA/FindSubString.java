 public class FindSubString {
    public static void main(String[] args) { 
        int count =0;
        String s = "raj"; 
        for (int i = 0; i <s.length(); i++) {   
        for (int j = i+1; j <=s.length(); j++) { 
            System.out.println(s.substring(i,j));  
            count++;  
        }
        
        }
        System.out.println(count);//sum of all possible substring 
    }
}
