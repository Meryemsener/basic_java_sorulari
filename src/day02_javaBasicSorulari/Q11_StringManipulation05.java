package day02_javaBasicSorulari;
import java.util.Scanner;
public class Q11_StringManipulation05 {

    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        String k1="cesaret";
        String k2="insana";
        String k3="sinirlarini";
        String k4="ogretir";

        System.out.println((k1.toUpperCase().charAt(0)+k1.substring(1))+" " +k2+ " " + k3+ " " + k4);


//2.yol


            Scanner scan = new Scanner(System.in);
            System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
            String kelime1 = scan.next();
            System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
            String kelime2 = scan.next();
            System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
            String kelime3 = scan.next();
            System.out.print("Lutfen cumle olusturmak icin bir kelime giriniz :");
            String kelime4 = scan.next();

            System.out.println(kelime1.substring(0,1).toUpperCase() +
                    kelime1.substring(1) + " "+
                    kelime2+" "+kelime3+" " +
                    kelime4 +"."); //Cesaret insana sinirlarini ogretir.

            scan.close();
    }
}
