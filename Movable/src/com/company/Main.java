package com.company;

public class Main {

    public static void main(String[] args) {
        Movable m = new MovablePoint(4, 2, 1, 2);
        System.out.println("Point:\n");
        System.out.println(m);
        m.moveUp();
        m.moveRight();
        System.out.println("Up+Right -> " + m);

        System.out.println("\nCircle:\n");
        m = new MovableCircle(1, 0, 3, 1, 5);
        System.out.println(m);
        m.moveDown();
        m.moveLeft();
        System.out.println("Down+Left -> " + m);

        }
    }

