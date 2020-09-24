package budget.database;

/**
 *
 * @author BacklTrack
 */
public class DatabaseManager {
    private final static String usersTable = "expense.Users";
    private final static String incomeTable = "expense.Income";
    private final static String expenseTable = "expense.Expenses";
    private String baseConnectionString = "jdbc:mysql://localhost:3306/expense?user=%s&password=%s&useSSL=false&useTimeZone=true&serverTimezone=UTC";
    public DatabaseManager(String userName, String password){
        this.baseConnectionString = String.format(baseConnectionString, userName, password);
    }
    public DatabaseManager(){
        this.baseConnectionString = String.format(baseConnectionString, "nbuser", "nbuser");
    }
}
