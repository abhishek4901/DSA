public class inbuildMethod {
    public static void main(String[] args) {
        String s = "raja";
        String r = "ram";
        System.out.println(s.concat(r));//rajaram
        //or
        s= s.concat(r);
        System.out.println(s);//rajaram
        //+oprator
        s= s+"raghupati";
        System.out.println(s);//rajaramraghupati
    }
}
