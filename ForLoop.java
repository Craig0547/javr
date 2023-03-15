import java.util.Scanner;

public class help {
    static void sout(Object line){
        System.out.println(line);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma=0;
        for(int i=1;i<=12;i++){
            sout("Podaj "+i+" wplate: ");
            suma = suma + scanner.nextDouble();
        }
        sout("Suma wplat wynosi: "+suma);
    }
}
