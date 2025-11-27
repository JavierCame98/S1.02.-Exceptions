package S202;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enter {

    static Scanner userEnter = new Scanner(System.in);

    public static byte lectorByte(String missatge){
        boolean valid = false;
        byte userValue = 0;

        while(!valid){
            System.out.println(missatge);
            try{
                userValue = userEnter.nextByte();
                valid = true;

            }catch(InputMismatchException e){
                System.out.println("Please introduce a valid input (-128 to 127)");
                userEnter.next();
            }
        }
       return userValue;
    }




}
