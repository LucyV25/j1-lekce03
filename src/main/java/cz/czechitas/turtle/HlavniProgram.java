package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();
//        ctverec(100, Color.red);
//        trojuhelnik(55);
        rovnoramennyTrojuhelnik(100);
    }
    public void ctverec(double velikostStrany, Color barva){
        zofka.setPenColor(barva);
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(90);
        }
    }

    public void trojuhelnik(double velikostStrany) {
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(120);
        }
    }

    public void rovnoramennyTrojuhelnik(double velikostStrany) {
        var velikostPrepony = Math.sqrt(2*Math.pow(velikostStrany, 2));
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStrany);
            zofka.turnRight(70);
        }
        zofka.turnLeft(290);
        zofka.move(velikostPrepony);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
