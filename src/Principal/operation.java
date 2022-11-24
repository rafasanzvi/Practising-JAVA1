package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class operation {

    public static void main(String[] args) throws IOException {

        /*
        InputStreamReader getInput = new InputStreamReader(System.in);
        BufferedReader readerTheInputs = new BufferedReader(getInput);

        System.out.println("Tell me your name: ");
        String name = readerTheInputs.readLine();
        System.out.println("Welcome " + name);
        */

        // We can use it with the age example

        InputStreamReader getInput = new InputStreamReader(System.in);
        BufferedReader readerTheInputs = new BufferedReader(getInput);

        System.out.println("Tell as your age: ");
        String strAge = readerTheInputs.readLine();
        Integer age = Integer.parseInt(strAge);

        // age = 19;
        Boolean isOlderThan18 = age >= 18;

            if(isOlderThan18) {
                System.out.println("He is old than 18");
            } else {
                System.out.println("He can not pass");
            }
    }
}
