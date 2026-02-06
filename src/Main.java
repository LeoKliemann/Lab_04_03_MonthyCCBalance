public class Main{
    public static void main(String[] args)
    {
        //Declarations
        double creditCardBalance = 5000;
        double interestRate = .17;
        double balanceTotal;
        double firstMonth;
        double secondMonth;

        //Statements
        balanceTotal = interestRate * creditCardBalance;
        firstMonth = balanceTotal + creditCardBalance;
        secondMonth = firstMonth + balanceTotal;
        System.out.println("Your balance for the first month is: $" + firstMonth + ", and your balance for the second month is, $" + secondMonth);

    }
}