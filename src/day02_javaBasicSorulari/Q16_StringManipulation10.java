package day02_javaBasicSorulari;

public class Q16_StringManipulation10 {

    //  \\ soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
  String str="   Java ogrenmek123 Cok guzel@      ";
  str=str.trim().replaceAll("\\d","").replace(" ","x").replaceAll("\\W","").replace("x"," ").replace("C","c");
        System.out.println(str);









    }
}


