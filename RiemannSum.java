import java.util.Scanner;

class Calculululussy {
    static void sout(Object line){
        System.out.println(line);
    }
    public static void main(String[] args) {
       float a,b,x,y,h,suma=0,p,n;
       Scanner scanner = new Scanner(System.in);
       sout("Podaj poczatek oblicznego przedzialu: ");
       a = scanner.nextFloat();
       sout("Podaj koniec oblicznego przedzialu: ");
       b = scanner.nextFloat();
       sout("Podaj ilosc obliczanych fragmentow przedzialu: ");
       n = scanner.nextFloat();
       for(int i=0;i<n;i++){
           x=(b-a)/n;
           h=a+(x/2);
           h+=x*i;
           y=h*h+h+2;
           p=y*x;
           suma+=p;
       }
       sout("suma wynosi: "+suma);
    }
}
