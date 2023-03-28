import java.util.Scanner;

class LineFunc {
    public static void main(String[] args){
    float Center, Length,
    Root=0,
    a=2,
    b=1,
    LeftMargin=-100,
    RightMargin=100;
    Scanner scanner = new Scanner(System.in);
    
    while((a*Root+b)!=0){
        Length = RightMargin-LeftMargin;
        Center = (Length)/2;
        if((a*Root+b)>0) RightMargin=Center;
        if((a*Root+b)<0) LeftMargin=Center;
    }
    System.out.println(Root);
    }
}
