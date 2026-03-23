import java.io.*;

class Fact {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Factorial program");
        System.out.println("_________________");
        System.out.println("Enter the number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        System.out.println("Report:");

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("* " + i);
            fact = fact * i;
        }

        System.out.println("= " + fact);
    }
}
