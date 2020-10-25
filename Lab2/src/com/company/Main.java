package com.company;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("George", "examplemail@gmail.com",'M');
        System.out.println(author);
        author.setEmail("newmail@gmail.com");
        System.out.println(author);
        System.out.println(author.getGender());


        Ball ball = new Ball(0, 0);
        System.out.println(ball);
        ball.setXY(1, 5);
        System.out.println(ball);
        ball.move(3, 2);
        System.out.println(ball.getX() + " " + ball.getY());

    }
}
