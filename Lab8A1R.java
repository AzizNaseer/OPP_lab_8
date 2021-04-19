package Lab8;

import java.util.Scanner;

public class Lab8A1R {
    public static void main(String[] args) {
        System.out.println("Enter title of book");
        Scanner input= new Scanner(System.in);
        Scanner i= new Scanner(System.in);
        String x=i.nextLine();
        System.out.println("enter price of book");
        int y= input.nextInt();
        System.out.println("enter the page count");
        int z=input.nextInt();
        book B= new book();

        B.setTitle(x) ; B.setPrice(y); B.setPageCount(z);
        System.out.println("Enter title of Tape");
        x=i.nextLine();
        System.out.println("enter price of tape");
        y= input.nextInt();
        System.out.println("enter the Playing time");
        z=input.nextInt();
        tape T= new tape();
        T.setTitle(x); T.setPrice(y); T.setPlayingTime(z);
        B.display();
        T.Display();
    }
}

