import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {

    public void processDTF(ArrayList<Transaction> transactionlist, File DTF) throws FileNotFoundException // loads
                                                                                                          // transactions
                                                                                                          // from DTF
                                                                                                          // into
                                                                                                          // arraylist
                                                                                                          // of
                                                                                                          // transactions
    {
        Scanner TheScanner = new Scanner(DTF);

        while (TheScanner.hasNextLine()) {
            String transaction = TheScanner.nextLine(); // grab the next line in the DTF
            String[] parsed = transaction.split("_"); // parse the transaction line into components

            switch (parsed[0]) // create the appropriate transaction type based on the transaction
            {
            case "01": // create

                Create create = new Create(parsed[0], parsed[1], parsed[2], Double.parseDouble(parsed[3]));
                transactionlist.add(create);
                break;
            case "02": // delete
                Delete delete = new Delete(parsed[0], parsed[1], parsed[2], Double.parseDouble(parsed[3]));
                transactionlist.add(delete);
                break;
            case "06": // addcredit
                AddCredit addcredit = new AddCredit(parsed[0], parsed[1], parsed[2], Double.parseDouble(parsed[3]));
                transactionlist.add(addcredit);
                break;
            case "00": // endsession
                EndSession TheEndSession = new EndSession("00");
                transactionlist.add(TheEndSession);
                break;
            case "05": // refund
                Refund refund = new Refund(parsed[0], parsed[1], parsed[2], Double.parseDouble(parsed[3]));
                transactionlist.add(refund);
                break;
            case "03": // sell
                Sell sell = new Sell(parsed[0], parsed[1], parsed[2], Integer.parseInt(parsed[3]),
                        Double.parseDouble(parsed[4]));
                transactionlist.add(sell);
                break;
            case "04": // buy
                Buy buy = new Buy(parsed[0], parsed[1], parsed[2], Integer.parseInt(parsed[3]),
                        Double.parseDouble(parsed[4]));
                transactionlist.add(buy);
                break;
            }

        }

        TheScanner.close();
    }

    public void processUserAccounts(ArrayList<User> users, File olduseraccounts) {
        System.out.println("TODO:iterate over olduseraccounts file and populate ArrayList of users");
    }

    public void processAvailableTickets(ArrayList<Ticket> tickets, File oldAvailableTickets) {
        System.out.println("TODO:iterate over available tickets file and populate ArrayList of tickets");
    }

    public void updateUsersTickets(ArrayList<Transaction> transactionlist, ArrayList<User> users,
            ArrayList<Ticket> tickets) {

        System.out.println(
                "TODO:iterate over arraylist of transactions and update user info and available tickets info accordingly");

    }
}
