package day01sorular;


import java.util.Scanner;

public class Q12_IfStatement03 {
		/*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            System.out.println("Lutfen is unvanini yazinis");
            String jobTitle= scan.next();
            if(jobTitle.equalsIgnoreCase("qa")){
                System.out.println("Quality Analyst");
            }else if (jobTitle.equalsIgnoreCase("dev")){
                System.out.println("Developer");
            }else if (jobTitle.equalsIgnoreCase("ba")){
                System.out.println("Business Analyst");
            }else if (jobTitle.equalsIgnoreCase("pm")){
                System.out.println("Project Manager");
            }else{
                System.out.println("hatali giris");
            }
        }
}
