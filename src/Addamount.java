public class Addamount {
    private int amount=50;
    Addamount(){

    }

    public Addamount(int a) {
        this.amount = a+amount;
    }
    public void display(){
        System.out.println(amount);
    }
}

class main {
    public static void main(String[] args) {


        Addamount a = new Addamount(40);
        Addamount b = new Addamount();
        a.display();
        b.display();
    }


}
