package day01sorular;

import java.util.Scanner;

public class Q10_IfStatement01 {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Y ya da N yaziniz");
        char harf=scan.next().charAt(0);
        if(harf=='Y' || harf=='y'){
            System.out.println("harfinizin acilimi: yes" );
        }else if(harf=='N' || harf=='n'){
            System.out.println("harfinizin acilimi NO");
        }else{
            System.out.println("hatali giris");
        }
    }
}
