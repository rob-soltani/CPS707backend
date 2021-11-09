import java.io.File;
import java.util.*;
public class backend {
    public static void main(String[] args) {
        System.out.println("Hello World");
        File DTF = new File("DTfile.txt")
        Scanner scanner = new Scanner(DTF);

        while (scanner.hasNextLine())
        {
            String transaction = scanner.nextLine(); //grab the next line in the DTF
            String[] parsed = transaction.split("_"); //parse the transaction line into components
            switch (parsed[0])
            {
                case "01": //create
                    CreateTransaction create = new CreateTransaction(parsed[0],parsed[1],parsed[2],parsed[3]);
                    //TODO: write Create transaction to output file
                    break;
                case "02": //delete

                    break;
                case "06": //addcredit

                    break;
                case "00": //endsession

                    break;
                case "05": //refund

                    break;
                case "03": //sell

                    break;
                case "04": //buy

                    break;
            }


        }

    }
}
