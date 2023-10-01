import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println("Give a temperature in Celsius: ");
            if (in.hasNextInt()){
                int temp = in.nextInt();
                int far = (temp * (9/5)) + 32;
                System.out.println(temp + " degrees Celsius in Fahrenheit is " + far + " degrees.");
                done = true;
            }
            else {
                String trash = in.nextLine();
                System.out.println("You said " + trash);
                System.out.println("That's not quite right. Try another input.");
            }

        }while (!done);
    }
}