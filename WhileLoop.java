import java.util.Scanner;

public class help {
    static void sout(Object line){
        System.out.println(line);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma=0, cena=0;
        int i=0;
        sout("podaj cene komputera: ");
        cena=scanner.nextDouble();
        while(suma<cena){
            i++;
            sout("Podaj "+i+" wplate: ");
            suma = suma + scanner.nextDouble();
        }
        sout("Suma wplat wynosi: "+suma);
    }
}
