public class Transaction {
    // An enum to define available transaction types
    // for accurate assignment and comparison of values
    public enum TransactionType {
        EndSession_00, // 00-end of session
        CreateUser_01, // 01-create
        DeleteUser_02, // 02-delete
        SellTickets_03, // 03-sell
        BuyTickets_04, // 04-buy
        RefundCredit_05, // 05-refund
        AddCredit_06, // 06-addcredit
    }
    // An instance variable of type enum TransactionType to hold the transaction's
    // type
    private TransactionType Type;

    public TransactionType GetType() {
        return this.Type;
    }

    public Transaction(TransactionType TheType){
        this.Type = TheType;
    }
    // An instance variable to hold the username of the primary user in the
    // transaction.
    // Username (EndSession, CreateUser, DeleteUser, AddCredit)
    // Buyer's username (RefundCredit)
    private String PrimaryUsername;

    public String GetPrimaryUsername() {
        if (this.Type == TransactionType.BuyTickets_04 || this.Type == TransactionType.SellTickets_03) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is of type SellTickets/BuyTickets and therefore does not support the GetPrimaryUsername method call!");
        }
        return this.PrimaryUsername;
    }

    // An instance variable to hold the username of the secondary user in the
    // transaction.
    // Seller's username (RefundCredit, SellTickets, BuyTickets)
    private String SellerUsername;

    public String GetSellerUsername() {
        if (this.Type != TransactionType.RefundCredit_05 && this.Type != TransactionType.SellTickets_03
                && this.Type != TransactionType.BuyTickets_04) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is not of type RefundCredit/SellTickets/BuyTickets and therefore does not support the GetSellerUsername method call!");
        }
        return this.SellerUsername;
    }

    // An instance variable of type double to hold the transaction's credit amount
    // Available credit (CreateUser), added credit (AddCredit), or refunded credit
    // (RefundCredit)
    private Double CreditAmount;

    public Double GetCreditAmount() {
        if (this.Type != TransactionType.CreateUser_01 && this.Type != TransactionType.AddCredit_06
                && this.Type != TransactionType.RefundCredit_05) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is not of type CreateUser/AddCredit/RefundCredit and therefore does not support the GetCreditAmount method call!");
        }
        return this.CreditAmount;
    }

    // An instance variable of type string to hold the transaction's events's title
    // EventTitle (SellTickets, BuyTickets)
    private String EventTitle;

    public String GetEventTitle() {
        if (this.Type != TransactionType.SellTickets_03 && this.Type != TransactionType.BuyTickets_04) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is not of type SellTickets/BuyTickets and therefore does not support the GetEventTitle method call!");
        }
        return this.EventTitle;
    }

    // An instance variable of type Integer to hold the transaction's events's
    // number of available
    // tickets
    // EventTitle (SellTickets, BuyTickets)
    private Integer EventAvailableTickets;

    public Integer GetEventAvailableTickets() {
        if (this.Type != TransactionType.SellTickets_03 && this.Type != TransactionType.BuyTickets_04) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is not of type SellTickets/BuyTickets and therefore does not support the GetEventAvailableTickets method call!");
        }
        return this.EventAvailableTickets;
    }

    // An instance variable of type double to hold the transaction's events's
    // per-ticket price
    // EventTitle (SellTickets, BuyTickets)
    private Double EventPerTicketPrice;

    public Double GetEventPerTicketPrice() {
        if (this.Type != TransactionType.SellTickets_03 && this.Type != TransactionType.BuyTickets_04) {
            throw new IllegalArgumentException(
                    "Invalid Method: The transaction is not of type SellTickets/BuyTickets and therefore does not support the GetEventPerTicketPrice method call!");
        }
        return this.EventPerTicketPrice;
    }
}
