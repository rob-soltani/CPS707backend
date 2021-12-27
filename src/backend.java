import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class backend {
    public static void main(String[] args) {
        File DTF = new File("DTfile.txt");
        File oldUserAccounts = new File("oldUserAccounts.txt");
        File oldAvailableTickets = new File("oldAvailableTickets.txt");
        ArrayList<Transaction> transactionlist = new ArrayList<>(); // to store all transactions
        ArrayList<User> userlist = new ArrayList<>(); // stores all users
        ArrayList<Ticket> ticketlist = new ArrayList<Ticket>();

        try {

            FileProcessing processing = new FileProcessing();
            processing.processDTF(transactionlist, DTF);
            processing.processUserAccounts(userlist, oldUserAccounts);
            processing.processAvailableTickets(ticketlist, oldAvailableTickets);
            processing.updateUsersTickets(transactionlist, userlist, ticketlist);
        } catch (FileNotFoundException E) {
            System.out.println(E.getMessage());
        }

    }
}
