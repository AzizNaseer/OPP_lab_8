package Lab8;

public class lab8A2R {
    public static void main(String[] args) {
        computer c=new computer();
        c.display();
        System.out.println("--------------------------------------");
        computer c1 = new computer("256","500","5000","2.8");
        laptop l1 = new laptop("256","500","5000","2.8",30,30,50,50);
        c1.display();
        System.out.println("---------------------------------------");
        l1.display();
    }
}
