import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("inserisci primo numero: ");
            int a = scanner.nextInt();

            System.out.println("inserisci secondo numero: ");
            int b = scanner.nextInt();

            int c = a / b;
            System.out.println("Il valore di c è: " + c);

        } catch (ArithmeticException e){
            e.printStackTrace();
            System.err.println("Divisione per zero: " + e.getMessage());
        }

        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        String parola;
        try {
            parola = tastiera.readLine();
        } catch (IOException e){
            System.err.println("Errore di comunicazione con la tastiera");
        }

        File file = new File("libri.txt");

        InputStream is = null;

        try{
            is = new FileInputStream(file);
            System.out.println("letto il file");
        } catch (FileNotFoundException ex){
            System.err.println("Non esiste il file: " + file.getAbsolutePath());
        }
        finally {
            if (is != null){
                is.close();
            }
        }
    }
}