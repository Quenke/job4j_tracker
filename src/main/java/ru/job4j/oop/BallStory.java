package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare.dontEat(ball);
        Ball.goAway(hare);
        Wolf.dontEat(ball);
        Ball.goAway(wolf);
        Fox.eat(ball);
        Ball.dontGoAway(fox);
    }
}
