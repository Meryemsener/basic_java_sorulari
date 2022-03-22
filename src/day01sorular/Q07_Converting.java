package day01sorular;

import java.util.Scanner;

public class Q07_Converting {
    public static void main(String[] args) {


    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
        // formül
        // c = (f-32)*5/9
     */

        double galon=5;
        double galonToLiter=galon*3.785;
        double litre=7;
        double literToGalon=litre/3.785;

        System.out.println(galon+"galon "+galonToLiter+" litredir");
        System.out.println(litre+"litre "+literToGalon+" galondur");














    }
}
/* int gallon = 45;
        double litre = gallon * 3.785;
        System.out.println(gallon + " gallon degeri " + litre + " litredir");
         int l=60;
         double g=l/3.785;
        System.out.println(l + " litre degeri " + g + " galondur");

        int f=90;
        double c=(f-32)*5/9;
        System.out.println("sicaklik " + c);*/