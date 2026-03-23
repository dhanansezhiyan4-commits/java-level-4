import java.io.*;

class Armstrong {
    public static void main(String arg[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Armstrong number");
        System.out.println("__________________________");
        System.out.println("Enter the number:");

        String s1 = br.readLine();
        int n = Integer.parseInt(s1);

        int original = n;   // store original number
        int sum = 0;
        int r;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + (r * r * r);
        }

        System.out.println("Report:");

        if (original == sum) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
