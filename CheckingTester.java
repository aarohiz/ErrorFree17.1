import chn.util.*;
import apcslib.*;
class CheckingTester
{
  public static void main( String[] args )
  {
    ConsoleIO console = new ConsoleIO();
    CheckingAccount account = new CheckingAccount( "A123", 1000 );
    boolean check = false;
    final double INTEREST_RATE = 2.5;
    double interest;
    
    while(check = false)
    {
        try
        {
            System.out.println("Please enter the starting balance --->");
            double startingBalance = console.readDouble();
            if(startingBalance < 0)
            {
                throw new IllegalArgumentException("negative starting balance");
            }
            else 
            {
                check = true;
                account = new CheckingAccount("A123", startingBalance);
            }
        }
        catch(IllegalArgumentException e)
        {}
    }
    interest = account.getBalance() * INTEREST_RATE / 100;
    account.deposit(interest);

    System.out.println("Balance after year 1 is $"
        + account.getBalance());

    interest = account.getBalance() * INTEREST_RATE / 100;
    account.deposit(interest);

    System.out.println("Balance after year 2 is $"
        + account.getBalance());
  }
}

