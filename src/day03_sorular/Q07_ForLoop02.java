package day03_sorular;

public class Q07_ForLoop02 {
    // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

    public static void main(String[] args) {
        //    System.out.println("*************for ile*************");
        //    for (int i = 0; i <=255; i++){
        //        char karakter = (char) i;
        //        System.out.println(i + "-> " + karakter);
        //
        //    }
    //for ile
        System.out.println("************* for ile*************");
        for(int i=0;i<=255;i++){
            char karakter = (char) i;
            System.out.println(i + " -> "+ karakter);
        }

        //while ile
        System.out.println("************* while ile *************");
        int i = 0;
        while(i<=255){
            char c = (char) i;
            System.out.println(i + " - " +c);
            i++;
        }
    }

}
