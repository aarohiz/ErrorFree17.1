class CheckingAccount
{
  private final double CHECK_CHARGE = 0.15;

  // instance variables
  private String myAccountNumber;
  private double myBalance;

  //constructors
  CheckingAccount()
  {
    myBalance       = 0;
    myAccountNumber = "";
  }

  CheckingAccount( String accountNumber, double initialBalance )
  {
    myBalance       = initialBalance;
    myAccountNumber = accountNumber;
  }

  // methods
  double getBalance()
  {
    return myBalance;
  }

  void  deposit( double amount )
  {
    myBalance = myBalance + amount;
  }

  void withdraw( double amount )
  {
    myBalance =  myBalance - amount - CHECK_CHARGE ;
  }

  void display()
  {
    System.out.println("Account " + myAccountNumber + ": " +  myBalance );
  }
}
