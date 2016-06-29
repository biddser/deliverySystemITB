import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by briandunne on 22/06/2016.
 */
public class InputHelper {

    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.println(prompt + "");

        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0)
                return null;
        } catch (IOException ex){
            System.out.println("IO Exception " + ex);
        }

        return inputLine;
    }
}
