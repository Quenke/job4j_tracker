package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Hare.DontEat(ball);
        Ball.GoAway(hare);
        Wolf.DontEat(ball);
        Ball.GoAway(wolf);
        Fox.eat(ball);
        Ball.DontGoAway(fox);
    }
}
