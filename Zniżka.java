package pl.migra.ir.java;
 
import java.util.Scanner;
 
public class Promocja {
    static void sout(Object line){
        System.out.println(line);
    }
   public static void main(String[] args) {
 
      Scanner scanner = new Scanner(System.in);
 
      sout("Podaj cenę telewizora: ");
      double cena = scanner.nextDouble();
      sout("Podaj rok wprowadzenia do sprzedaży: ");
      int rokWprowadzenia = scanner.nextInt();
      sout("Czy są inne promocje?: ");
      boolean innePromocje = scanner.nextBoolean();  // true albo false
 
      if (rokWprowadzenia == 2021 && !innePromocje) {
         sout("Podaj procent znizki: ");
          int ProcentZnizki = scanner.nextInt();
         cena = cena-(ProcentZnizki/100) * cena;
      }
 
      sout("Cena telewizora: " + cena);
   }
}
