import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        /*    If (eğer)

        if (koşul) {

        Kosul saglanınca (true) blok calısır.

       }

       else {

       Bu blogun üstündeki herhangi bbir kosul saglanmadıgında bu blok calısır.

       }
         */


        Scanner scanner = new Scanner(System.in);  // Kullanıcıdan input alma
        System.out.print("Please Enter Name!.. : ");
        int age = scanner.nextInt();

        if ( age < 18) {  // age 18 den kücük ise

            System.out.println("Mekana giremezsin :)");


        } else {  // eger age 18den büyük ise

            System.out.println("Mekana kabul edildiniz :)..");


        }



        //birden fazla kosul ile örnek yapalım..   else-if   . hangi koşul uyarsa o blok calısır.  Not: if blokları hangisi uyarsa hepsi calısabilir..


        System.out.println("Bir islem sonucu giriniz :))");
        int islem = scanner.nextInt();

        if ( islem ==1) {

            System.out.println("1.Kosul isleme alındı");
        } else if ( islem == 2) {

            System.out.println("2.Kosul isleme alındı");
        } else if ( islem ==3) {
            System.out.println("3.Kosul isleme alındı");

        } else {  // yukarıdi if ( kosulların hicbiri uymadıgında bu blok calısır )

            System.out.println("Hicbir kosul tutmadıı :))");
        }


    }
}
