import java.util.Scanner;
class HelloWorld {
    static void sout(Object line){
        System.out.println(line);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String napis;
        int ilosc=0;
        do{
            sout("Podaj napis");
            napis= scanner.next();
            ilosc++;
        }
        while(!napis.equals("."));
        System.out.println("liczba napisow: "+ ilosc--);
    }
}
