package day01sorular;

import java.util.Scanner;

public class Q13_Ternary {
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */
    public static void main(String[] args) {

        int fiyat= 58;
        System.out.println(fiyat<10 ? "ucuz": fiyat<20 ? "normal":
     "pahali");

         int x=9;
        System.out.println((x>2?x<4?10:8:7));

        int y=5;
        System.out.println((y>5) ? (y<10 ? 2*y : 3*y) : (y>10 ? 2+y : 3*y));

    }
}
