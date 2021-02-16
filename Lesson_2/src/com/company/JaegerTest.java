package com.company;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Striker Eurek", "Mark-5", "Australia",
                76.2f, 1850f, 10, 10, 9);
        Jaeger jaegerTwo = new Jaeger("Gipsy Danger", "Mark-3", "USA");
        Jaeger jaegerThree = new Jaeger(85.34f, 2312f, 5, 7, 4);

        System.out.println("Название: " + jaegerOne.getModelName());
        System.out.println("Модель: " + jaegerOne.getMark());
        System.out.println("Производитель: " + jaegerOne.getOrigin());
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.setStrength(15);
        jaegerOne.useVortexCannon();


    }
}
