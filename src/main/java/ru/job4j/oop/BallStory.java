package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare.donteat(ball);
        Ball.goaway(hare);
        Wolf.donteat(ball);
        Ball.goaway(wolf);
        Fox.eat(ball);
        Ball.dontgoaway(fox);
    }
}
