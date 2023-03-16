import java.util.Scanner;

class HelloWorld {
    static void sout(Object line){
        System.out.println(line);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ilosc=0, a, b;
        sout("Podaj a");
            a= scanner.nextInt();
        do{
            sout("Podaj b");
            b= scanner.nextInt();
            if(b==0){
                sout("nie mozna dzielic przez 0");
                break;
            }
            ilosc++;
            
        }
        while(true);
        ilosc--;
        System.out.println("liczba dzialan dodatnich: "+ilosc);
    }
}
