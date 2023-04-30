package ke.co.safaricom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInputObject = new Scanner(System.in);

        do {
            System.out.println("Select process (e-encode/d-decode");
            String process= userInputObject.next();

            System.out.println("enter message:");
            String msg= userInputObject.next();

            System.out.println("enter key:");
            int key= userInputObject.nextInt();

            System.out.println("processing...");
            if (process =="encoding"){
                String output = Encoding.encode(msg,key);
                System.out.println(output);
            } else if (process =="decoding"){
                System.out.println("Decoding");
            } else {
                System.out.println("invalid process");
                continue;
            }

            System.out.println("do you want to quit or continue?");
            String nextStep= userInputObject.next();

            if (nextStep.startsWith("q")){

                break;
            }

        } while (true);
        }

    }