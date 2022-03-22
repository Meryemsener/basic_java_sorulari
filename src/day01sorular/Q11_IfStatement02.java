package day01sorular;

import java.util.Scanner;

public class Q11_IfStatement02 {
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        double not = scan.nextDouble();
        if (not <= 100 && not >= 90) {
            System.out.println("A aldiniz");
        } else if (not <= 80 && not >= 89) {
            System.out.println("B aldiniz");
        }else if (not <= 70 && not >= 79) {
            System.out.println("C aldiniz");
        }else if (not <= 60 && not >= 69) {
            System.out.println("D aldiniz");
        }else if (not <= 0 && not >=59) {
            System.out.println("F aldiniz");
        }else{
            System.out.println("hatali giris");
        }
    }
}
