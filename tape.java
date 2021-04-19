package Lab8;

public class tape extends publication{
    protected int playingTime;
    public tape(String title, int price, int playingTime){
        super(title,price);
        this.playingTime=playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    public int getPlayingTime() {
        return playingTime;
    }
    public void Display(){
        System.out.println("*Playing time is "+playingTime);
        System.out.println("*Price of tape is "+getPrice());
        System.out.println("*Title of tape is "+getTitle());
    }
}