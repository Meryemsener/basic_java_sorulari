package day01sorular;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("adinizi yazin");
        String ad= scan.nextLine();

        System.out.println("memleket yazin");
        String memleket=scan.nextLine();

        System.out.println("yasadiginiz yeri yazin");
        String yasadiginYer=scan.nextLine();

        System.out.println("yasinizi yazin");
        int yas= scan.nextInt();

        System.out.println("boyunuzu yazin");
        int boy=scan.nextInt();

        System.out.print("yasadiginiz " + yasadiginYer +" u seviyor musunuz? true/false");
        boolean seviyorMu = scan.hasNextBoolean();

        System.out.println("*****************************");
        System.out.println("isim = " + ad);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + yasadiginYer);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("yasadiginiz yeri seviyor musunuz = " + seviyorMu);




    }



}
