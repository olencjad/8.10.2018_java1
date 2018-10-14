package pl.infoshare;

import java.sql.SQLOutput;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /**
        zad1 - program wypisujacy moje imie i nazwisko
        * */
        String firstName = "Ola";
        String name = "Dabrowska";

        System.out.print("1." + ' ' + firstName + name); //dlaczego 19 i 20 linijke wyswietla w jednej linii mimo ponizej dalam println
        System.out.println("2." + ' ' + firstName + name);
        System.out.println("3." + ' ' + firstName + ' ' + name +"\n");


        /**
         zad2 - program wypisujacy moj wiek, a w nowej linii rodzinne miasto
         * */
        byte age = 35;
        String motherTown = "Jurki";

        System.out.println("1." + ' ' + "wiek:" + ' ' + age + "\n" + "rodzinne miasto:" + ' ' + motherTown);

        System.out.println("2." + ' ' + "wiek:" + ' ' + age);
        System.out.println("rodzinne miasto:" + ' ' + motherTown + "\n");


        /**
         Zad3 - Napisz program, ktory doda dwie liczby, odejmie dwie liczby, podzieli dwie liczby i przemnozy dwie liczby.
         kazdy wynik wypisz na ekran.
         **/
        byte a = 8;
        byte b = 2;

        System.out.println("Suma dwoch liczb:" + ' ' + (a + b));
        System.out.println("Roznica dwoch liczb:" + ' ' + (a - b));
        System.out.println("Iloczyn dwoch liczb:" + ' ' + (a / b));
        System.out.println("Iloraz dwoch liczb:" + ' ' + (a * b));
        System.out.println("Kwadrat liczby:" + ' ' +  Math.pow(a , 2 ));        //podniesienie liczby do kwadratu?
        //System.out.println(a / 0 + "\n");
        System.out.println((a + b) + "," + (a - b) + "," + (a / b) + "," + (a * b));


        /**
         Zad4_domowe - Napisz program, ktory uzywa wzoru skroconego mnozenia (a i b zadeklaruj dowolnie), a wynik wypisz na ekran:
         **/

        System.out.println("\n" + "Zadanie domowe - moje:" + "\n" + Math.pow((a + b) , 2));     //alternatywa1
        System.out.println(Math.pow(a , 2) + 2 * a * b + Math.pow(b , 2));                      //alternatywa2

        System.out.println((a + b) * (a + b));                                                  //alternatywa3
        System.out.println(a * a + 2*a*b + b*b);                                                //alternatywa4
    }

}


