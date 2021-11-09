public abstract class Transaction {
    String TransactionCode;
    public Transaction(String Code)
    {
        TransactionCode = Code;
    }

    public String getTransactionCode()
    {
        return this.TransactionCode;
    }

}
class Create extends Transaction{

    String Username;
    String UserType;
    double AvailableCredit;
    public Create(String Code, String Name, String Type, double Credit)
    {
        super(Code);
        Username = Name;
        UserType = Type;
        AvailableCredit = Credit;
    }

}

class Delete extends Transaction{

    String Username;
    String UserType;
    double AvailableCredit;
    public Delete(String Code, String Name, String Type, double Credit)
    {
        super(Code);
        Username = Name;
        UserType = Type;
        AvailableCredit = Credit;
    }

}

class AddCredit extends Transaction{

    String Username;
    String UserType;
    double AvailableCredit;
    public AddCredit(String Code, String Name, String Type, double Credit)
    {
        super(Code);
        Username = Name;
        UserType = Type;
        AvailableCredit = Credit;
    }

}

class Refund extends Transaction{

    String Buyersname;
    String Sellersname;
    double RefundCreditAmount;
    public Refund(String Code, String Name, String Type, double Credit)
    {
        super(Code);
        Buyersname = Name;
        Sellersname = Type;
        RefundCreditAmount = Credit;
    }

}

class Sell extends Transaction{

    String Eventname;
    String Sellersname;
    int NumTickets;
    double PricePerTicket
    public Sell(String Code, String Name, String seller, int tickets, double Credit)
    {
        super(Code);
        Eventname = Name;
        Sellersname = seller;
        NumTickets = tickets;
        PricePerTicket = Credit
    }

}

class Buy extends Transaction{

    String Eventname;
    String Sellersname;
    int NumTickets;
    double PricePerTicket
    public Buy(String Code, String Name, String seller, int tickets, double Credit)
    {
        super(Code);
        Eventname = Name;
        Sellersname = seller;
        NumTickets = tickets;
        PricePerTicket = Credit
    }

}