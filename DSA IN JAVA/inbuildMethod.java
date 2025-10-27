public class inbuildMethod {
    public static void main(String[] args) {
        String s = "raja";
        String r = "ram"; 
        String a = "hello";
        System.out.println(s.concat(r));//rajaram  
        //or  
        s= s.concat(r);
        System.out.println(s);//rajaram
        //+oprator  
        s=s+a;
        System.out.println(s);//rajaramhello s me pahle se rajaram store h 
        //or 
        s= s+"raghupati";
        System.out.println(s);//rajaramraghupati

    }
}
