import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        
    System.out.println("Podaj swoj wiek:");
    float Wiek=scanner.nextFloat();
    
    if(Wiek>18){
        System.out.println("Jestes dorosla osoba ");
    }
    else{
        System.out.println("Jestes dzieckiem ");
    }
    }
}
