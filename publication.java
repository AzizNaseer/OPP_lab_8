package Lab8;

public class publication {
    protected String title;
    protected int price;
    public publication(String title, int price){
        this.title=title;
        this.price=price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    public void display(){
        System.out.println("Title "+title);
        System.out.println("Price "+price);
    }
}
