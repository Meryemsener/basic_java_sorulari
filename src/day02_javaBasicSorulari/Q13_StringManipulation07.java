package day02_javaBasicSorulari;

public class Q13_StringManipulation07 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */

        public static void main(String[] args) {
            String str = "abcdxyzm";
            boolean xyzIceriyorMu=false;
            if (str.contains("xyz")) {
                xyzIceriyorMu=true;
                System.out.println(xyzIceriyorMu);
            } else {
                xyzIceriyorMu=false;
                System.out.println(xyzIceriyorMu);
            }

    }
}
