import java.lang.Math;
import java.util.Scanner;

class HelloWorld {
    static void sout(Object line){
        System.out.println(line);
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x,y,a1,a2,b1,b2;
        
    sout("Input the sum of x and y");
    x=scanner.nextFloat();
    sout("Input the multiplication of x and y");
    y=scanner.nextFloat();
    
    b1=(-x-Math.sqrt(x*x-4*y))/-2;
    b2=(-x+Math.sqrt(x*x-4*y))/-2;
    
    a1=x-b1;
    a2=x-b2;
    sout("the values of x and y are:"+ x +" and "+ y);
    }
}
