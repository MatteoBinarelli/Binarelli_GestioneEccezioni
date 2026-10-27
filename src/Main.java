import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = 10;
        int b = 0;

        try{
            int c = a / b;
            System.out.println("Il valore di c è: " + c);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("Divisione per zero: " + e.getMessage());
        }
    }
}