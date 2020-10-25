package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Doggy", 5);
        Ball ball1 = new Ball("yellow", 7);
        Book book1 = new Book("Idiot", "Dostoevsky", 320);
        dog1.setAge(12);
        ball1.setRadius(5);
        book1.setPages(250);
        System.out.println(dog1);
        System.out.println(ball1);
        System.out.println(book1);
    }
}
