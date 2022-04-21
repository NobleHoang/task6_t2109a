public class Account {
    String id;
    String name;
    int balance=0;
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int setBalance(int balance){
        this.balance=balance;
        return balance;
    }
    public void credit(int amount){
        balance=balance+amount;
    }
    public void debit(int amount){
        if(balance<amount){
            System.out.println("subtract amount from balance");
        }else {
            balance=balance-amount;
        }
    }
    public static void main(String[] args) {
        Account account=new Account("Dai","Ngo Quang",6368);
        System.out.println("ID: "+account.id);
        System.out.println("Name: "+account.name);
        System.out.println("Balance: "+account.balance);
        account.setBalance(6868);
        System.out.println("Balance: "+account.getBalance());
        account.credit(10);
        System.out.println("account: "+account.balance);
        account.debit(25);
        System.out.println("account: "+account.balance);
    }
}
