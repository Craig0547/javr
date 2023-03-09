import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
            
        System.out.println("Podaj liczbe: \n");
        float liczba=scanner.nextFloat();
            
        if(liczba<0){
            liczba= liczba*-1;
        }
        System.out.println("Warosc bezwzgledna zmiennej \"liczba\" ma wartosc "+ liczba);
    }
}
