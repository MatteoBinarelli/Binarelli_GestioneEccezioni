import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci primo numero: ");
        int a = scanner.nextInt();
        System.out.println("inserisci secondo numero: ");
        int b = scanner.nextInt();

        try{
            int c = a / b;
            System.out.println("Il valore di c è: " + c);
        } catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("Divisione per zero: " + e.getMessage());
        }
    }
}