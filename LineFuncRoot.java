import java.util.Scanner;
import java.util.Locale;

public class LineFunc
{
    public static void main(String[] args)
    {
        double Root = 0,
        RightMargin=-1000,
        LeftMargin=100,
        Precision=0.01;
        
        while(Math.abs(RightMargin-LeftMargin)>=Precision)
        {
            Root=(RightMargin+LeftMargin)/2;
            if((2*Root+1)<=0)
            {
                Root=RightMargin;
            }
            else
            {
                Root=LeftMargin;
            }
        }
        System.out.println(Root);
    }
}
