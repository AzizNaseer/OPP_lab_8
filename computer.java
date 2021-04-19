package Lab8;

public class computer {
    protected String wordSize;
    protected String memorySize;
    protected String storageSize;
    protected String speed;
    public computer(){
        this.memorySize="100 megabytes";
        this.wordSize="100 bits";
        this.speed="100 megahertz";
        this.storageSize="100 megabytes";
    }
    public computer(String wordSize,String memorySize, String storageSize, String speed){
        this.memorySize=memorySize;
        this.speed=speed;
        this.wordSize=wordSize;
        this.storageSize=storageSize;
    }
    public void display(){
        System.out.println(" *Word Size is "+wordSize);
        System.out.println(" *Memory Size is "+wordSize);
        System.out.println(" *Storage Size is "+wordSize);
        System.out.println(" *Speed is "+wordSize);
    }
}
