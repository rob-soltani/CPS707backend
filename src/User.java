import java.math.BigDecimal;
import java.math.RoundingMode;

public class User {

    // An enum to defne available user types
    // for accurate assignment and comparison of values
    public enum UserType {
        AA, // Admin
        FS, // Full-Standard
        BS, // Buy-Standard
        SS, // Sell-Standard
    }

    // An instance variable of type string to hold the user's username
    private String Username;

    // An instance variable of type enum UserType to hold the user's type
    private UserType Type;

    // An instance variable of type double to hold the user's credit balance
    private Double Credit;

    // Class construtor which requires username, user type, and credit balance
    public User(String TheUsername, UserType TheType, Double TheCredit) {

        // Default to Sell-Standard if user type is null
        if (TheType == null)
        {
            TheType = UserType.SS;
        }

        // Default to 0 if credit is null
        if (TheCredit == null)
        {
            TheCredit = 0.00;
        }

        this.Username = TheUsername;
        this.Type = TheType;
        this.SetCredit(TheCredit);

    }

    private void SetCredit(Double TheCredit)
    {
        BigDecimal RawValue = new BigDecimal(TheCredit.toString());
        BigDecimal RoundedDownValue = RawValue.setScale(2, RoundingMode.DOWN);

        TheCredit = RoundedDownValue.doubleValue();

        this.Credit = TheCredit;
    }
}
