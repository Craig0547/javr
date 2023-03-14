import java.lang.Math;
import java.util.Scanner;

class HelloWorld {
    static void sout(Object line){
        System.out.println(line);
    }
    
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double x,y,a,b;
        
    sout("Input the sum of x and y");
    x=scanner.nextFloat();
    sout("Input the multiplication of x and y");
    y=scanner.nextFloat();
    
    b=(-x-Math.sqrt(x*x-4*y))/-2;
    a=x-b;
    sout("the values of x and y are:"+ a +" and "+ b);
    }
}
