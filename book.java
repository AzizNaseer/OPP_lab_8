package Lab8;

public class book extends publication{
    protected int pageCount;
    public book(String title, int price, int pageCount){
        super(title,price);
        this.pageCount=pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
    public void display(){
        System.out.println("*Number of pages are "+pageCount);
        System.out.println("*Title of book is "+getTitle());
        System.out.println("*Price of book is  "+getPrice());
    }

}