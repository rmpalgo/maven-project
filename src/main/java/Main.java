import com.google.common.base.Joiner;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Type here: ");
       String input = scanner.nextLine();
        System.out.println(StringUtils.isNumeric(input));

       if(StringUtils.isNumeric(input)) {
           System.out.println("You Entered: " + input);
           System.out.println("This is a number");
       } else {
           System.out.println(input + " " + "is not a number");
       }

        System.out.println("Flipped Case: " + StringUtils.swapCase(input));
        System.out.println("Reverse: " + StringUtils.reverse(input));




    }
}
