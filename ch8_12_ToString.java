package ch8;
/*
Add a toString method to the BankAccount class from the previous exercise.
Your method should return a string that contains the account's name and
balance separated by a comma and space. For example, if an account object
named yana has the name "Yana" and a balance of 3.03, the call yana.toString()
should return the string "Yana, $3.03".
 */
public class ch8_12_ToString {
    String name;
    double balance;
    double transactionFee = 0.0;

    public void deposit(double amount){
        balance = balance + amount;
    }

    //sørger for at transactionFee ikke kan få ens balance til at blive negativ ved at bruge et if- statement
    public void withdraw(double amount){
        if (balance-amount-transactionFee < 0){

        } else {
            balance = balance - amount - transactionFee;
        }
    }
    //En af kravene er at clienten skal kunne ændre transactionfee'en.
    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    // Overrider den defaulte toString
    @Override
    public String toString() {
        return name + ", " + balance;
    }
}
