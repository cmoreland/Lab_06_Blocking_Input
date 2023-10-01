import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give a temperature in Celsius: ");
        boolean done = false;
        do {
            if (in.hasNextInt()){
                int temp = in.nextInt();
                int far = (temp * (9/5)) + 32;
                System.out.println(temp + " degrees Celsius in Fahrenheit is " + far + " degrees.");
                done = true;
            }
            else {
                System.out.println("That's not quite right. Try another input.");
            }

        }while (!done);
    }
}