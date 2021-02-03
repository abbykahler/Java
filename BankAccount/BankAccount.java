import java.util.Random;


public class BankAccount {
    private String accountNumber;
    private double checkingBalance = 0;
    private double savingsBalance= 0;
    private static int number0fAccounts =0;
    private static double totalAmountAccount=0;
    
    

    public BankAccount(){
        accountNumber = createNewAccountNumber();
    }
    private String createNewAccountNumber(){
        String numbers = "0123456789";
        String newAccountNumber = "";
        Random random = new Random();

        for(int i = 0; i < 5; i++){
            int num = numbers.charAt(random.nextInt(10));
            newAccountNumber += num;
        }
        accountNumber = newAccountNumber;
        
        return newAccountNumber;
        
    }


    public String getAccountNumber(){
        return accountNumber;
    }

    public void setCheckingBalance(double checkingBalance){
        this.checkingBalance = checkingBalance;
    }
    public double getCheckingBalance(){
        return this.checkingBalance;
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public void depositChecking(double depositAmount){
        setCheckingBalance(getCheckingBalance() + depositAmount);
        System.out.println("Checking Balance is $" + checkingBalance);
        // checkingBalance += depositAmount;
        // totalAmountAccount += depositAmount;
    }
    
    public void depositSavings(double depositAmount){
        setSavingsBalance(getSavingsBalance() + depositAmount);
        // savingsBalance += depositAmount;
        // totalAmountAccount += depositAmount;
        System.out.println("Savings Balance is $" + savingsBalance);
    }
    
    public void viewBalance(){
        totalAmountAccount = savingsBalance + checkingBalance;
        System.out.println(totalAmountAccount);
    }
    
    public void withdrawChecking(double amount){
        if (getCheckingBalance() < amount){
            System.out.println("No money left.");
        } 
        else{
            setCheckingBalance(getCheckingBalance() - amount);
        }
        System.out.println("Checking Balance is $" + getCheckingBalance());
    }
    
    public void withdrawSavings(double amount){
        if (getSavingsBalance() < amount){
            System.out.println("No money left.");
        } 
        else{
            this.setSavingsBalance(this.getSavingsBalance() - amount);
        }
        System.out.println("Savings Balance is $" + getSavingsBalance());
    
    }



}