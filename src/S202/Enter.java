package S202;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Enter {

    static Scanner userEnter = new Scanner(System.in);

    public static byte llegirByte(String missatge){
        boolean valid = false;
        byte value = 0;
        System.out.println("Enter a single byte value (-128 to 127)");

        while(!valid){
            System.out.println(missatge);
            try{
                byte userValue = userEnter.nextByte();
                if(userValue >= -128 || userValue <= 127){
                    valid = true;
                }
            }catch(InputMismatchException e){
                System.out.println("Please introduce a valid input");
            }

        }
       return value;
    }


}
