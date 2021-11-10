import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileProcessing {

    public void processDTF(ArrayList<Transaction> transactionlist, File DTF) //loads transactions from DTF into arraylist of transactions
    {
        Scanner scanner = new Scanner(DTF);

        while (scanner.hasNextLine())
        {
            String transaction = scanner.nextLine(); //grab the next line in the DTF
            String[] parsed = transaction.split("_"); //parse the transaction line into components

            switch (parsed[0]) //create the appropriate transaction type based on the transaction
            {
                case "01": //create
                    Create create = new Create(parsed[0],parsed[1],parsed[2],parsed[3]);
                    transactionlist.add(create);
                    break;
                case "02": //delete
                    Delete delete = new Delete(parsed[0],parsed[1],parsed[2],parsed[3]);
                    transactionlist.add(delete);
                    break;
                case "06": //addcredit
                    AddCredit addcredit = new AddCredit(parsed[0],parsed[1],parsed[2],parsed[3]);
                    transactionlist.add(addcredit);
                    break;
                case "00": //endsession
                    //TODO:what to do when EOF
                    break;
                case "05": //refund
                    Refund refund = new Refund(parsed[0],parsed[1],parsed[2],parsed[3]);
                    transactionlist.add(refund);
                    break;
                case "03": //sell
                    Sell sell = new Sell(parsed[0],parsed[1],parsed[2],parsed[3],parsed[4]);
                    transactionlist.add(sell);
                    break;
                case "04": //buy
                    Buy buy = new Buy(parsed[0],parsed[1],parsed[2],parsed[3],parsed[4]);
                    transactionlist.add(buy);
                    break;
            }


        }
    }

    public void processUserAccounts(ArrayList<User> users,File olduseraccounts)
    {
        //TODO:iterate over olduseraccounts file and populate ArrayList of users
    }

    public void processAvailableTickets(ArrayList<Ticket> tickets,File oldAvailableTickets)
    {
        //TODO:iterate over olduseraccounts file and populate ArrayList of users
    }

    public void updateUsersTickets(ArrayList<Transaction> transactionlist,ArrayList<User> users,ArrayList<Ticket> tickets)
    {
        //TODO:iterate over arraylist of transactions and update user info and available tickets info accordingly
    }
}
