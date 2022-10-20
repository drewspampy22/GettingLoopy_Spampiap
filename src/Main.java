import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            boolean valid = true;
            while(valid)
            {
            double Temp = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("What is your Temp in Celsius");
            if (in.hasNextDouble()) {
                Temp = in.nextDouble();
                System.out.println("Your temp in Fahrenheit is " + (Temp*1.8 + 32));

                valid = false;
            } else {
                System.out.println("invalid input try again");

            }
        }

        }
    }
}












