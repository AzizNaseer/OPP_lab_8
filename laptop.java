package Lab8;

public class laptop extends computer {
    protected int length;
    protected int height;
    protected int width;
    protected int weight;
    public laptop(){
        super();
        this.height=10;
        this.length=20;
        this.weight=30;
        this.width=40;
    }
    public laptop(String wordSize,String memorySize, String storageSize, String speed,int length, int height, int weight, int width){
        super(wordSize,storageSize,speed,memorySize);
        this.height=height;
        this.length=length;
        this.weight=weight;
        this.width=width;
    }
    public void display(){
        System.out.println(" *Length is "+length);
        System.out.println(" *Width is "+width);
        System.out.println(" *Height is "+height);
        System.out.println(" *Weight is "+weight);
    }
}
