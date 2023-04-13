import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double y=0, x=0, lew=0, praw=0.11, epsilon=0.0001;
        System.out.println("Podaj dokladnosc");
        epsilon= scanner.nextDouble();
        
        while((praw-lew)>=epsilon){
            x=(lew+praw)/2;
            y=Math.pow(x,3)-0.165*Math.pow(x,2)+3.993*Math.pow(10,-4);
            if(y>0){
                lew=x;
            }
            else{
               praw=x; 
            }
            
        }
        
        System.out.println("Glebokosc wynosi: "+x);
    }
}
