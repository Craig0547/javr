import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input length: ");
        int Length = scanner.nextInt();
        int[] Tab;
        Tab = new int[Length];
        
        for(int i=0;i<Length;i++){
            System.out.println("Input number: ");
            Tab[i] = scanner.nextInt();
        }
        System.out.println("Output: ");
        for(int i=0;i<Length;i++){
            System.out.println(Tab[i]+" ");
        }
        
    }
}
