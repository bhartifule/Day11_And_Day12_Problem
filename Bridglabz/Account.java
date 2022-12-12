package Com.Bridglabz;

public class Account {
	 int accountBalance;
	    void debit(int debitAmount){
	        if (this.accountBalance < debitAmount){
	            System.out.println("Debit amount exceeds account balance");
	        }
	        else {
	            this.accountBalance = this.accountBalance - debitAmount;
	            System.out.println("remaining balance is " + this.accountBalance);
	        }
	    }

	    public static void main(String[] args) {
	        Account acc = new Account();
	        acc.accountBalance = 10000;
	        acc.debit(5000);
	        acc.debit(10000);
	    }
}
