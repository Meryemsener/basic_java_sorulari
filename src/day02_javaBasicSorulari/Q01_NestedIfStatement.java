package day02_javaBasicSorulari;

import java.util.Scanner;

public class Q01_NestedIfStatement {
    /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi girin: ");
        int age=scan.nextInt();

        if(age>=18){
            if(age>=70){
                System.out.println("yasi oy kullanmaya uygundur\nuc kez oy kullanabilir");

            }else if(age >=50){//70> age>= 50 demenin kisa yoludur, cunku yukaridaki ifte belirttik
                System.out.println("oy kullanmaya uygun\niki kez oy kullanabilir");
            }else{
                System.out.println("bir kez oy kullanabilir");
            }
        }else if(age>0 && age<18){
            System.out.println("yas oy kullanimina uygun degildir");
        }else
            System.out.println("hatali giris yaptiniz");

    }
}


