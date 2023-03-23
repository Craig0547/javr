import java.util.Scanner;

class calc {
    public static void main(String[] args) {
        //define variables
        Scanner scanner = new Scanner(System.in);
        double n,x1,x2,x,y,sum=0,a,b,c,delta,i,h,area;
        //assign values to f(x)=ax^2+bx+c parameters
        a=1;
        b=-2;
        c=-8;
        //calculate intersections with X0
        delta = b*b-4*a*c;
        x1=(b*-1-Math.sqrt(delta))/(2*a);
        x2=(b*-1+Math.sqrt(delta))/(2*a);
        //define the boundaries of the calculated area, check if delta=0
        if(x1<x2){
            a=x1;
            b=x2;
        }  
        if(x2<x1){
            a=x2;
            b=x1;
        }
        if(delta==0){
            System.out.println("f(x) has only one intersection with X0, the area is equal to 0");
            return;
        } 
        System.out.println("input the amount of divisions (high for more accuracy, low for faster calculations): ");
        n = scanner.nextFloat();
        //calculate the area
        x=(b-a)/n;
        h=a+(x/2);
        for(i=0;i<n;i++){
            y=a*h*h+h*b+c;
            area=y*x;
            sum+=area;
            h+=x;
        }
        //if the area is less than zero, return abs value
        sum=Math.abs(sum/2);
        System.out.println("The area under the graph is equal to:"+ sum);
    }
}
