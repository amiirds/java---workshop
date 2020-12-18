package sepah.bank;

import com.sun.deploy.util.BlackList;

public class Account {
    private int AccountID;
    private String FullName;
    private int Balance;
    private sepah.bank.AccountType Type;

    public Account(String FullName, int InitialBalance, sepah.bank.AccountType Type){
        this.FullName = FullName;
        this.Balance = InitialBalance;
        this.Type = Type;
    }
    public void setAccountID(int newID){
        AccountID = newID;
    }
    public int getAccountID(){
        return AccountID;
    }
    public String getFullName(){
        return FullName;
    }
    public int getBalance(){
        return Balance;
    }
    public sepah.bank.AccountType getType(){
        return Type;
    }
}
