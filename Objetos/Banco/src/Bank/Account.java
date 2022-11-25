package Bank;

public class Account{
    private int number;
    private String name;
    private double money;

    public Account(){
    }

    public Account(int number, String name, double initialDeposit){
        this.name = name;
        this.number = number;
        deposit(initialDeposit);
    }

    public Account(int number, String name){
        this.name = name;
        this.number = number;
    }

    public String toString(){
        return String.format("Account %d",number)
        + ", Holder: "
        + name
        +String.format(", Balance: $ %.2f",money);
    }

    public void deposit(double money){
        this.money =  this.money + money;
    }

    public void withdaw(double money){
        this.money = this.money - money -  5;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

}