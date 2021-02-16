package com.company;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor){
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }
    public Jaeger(String modelName, String mark, String origin){
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        height = 100f;
        weight = 2.312f;
        speed = 10;
        strength = 10;
        armor = 10;
    }
    public Jaeger(float height, float weight, int speed, int strength, int armor){
        modelName = "Thunder God";
        mark = "Mark-6";
        origin = "Heavenly palace";
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public String getMark(){
        return mark;
    }
    public void setMark(String mark){
        this.mark = mark;
    }

    public String getOrigin(){
        return origin;
    }
    public void setOrigin(){
        this.origin = origin;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float height){
        if(height >= 0){
            this.height = height;
        }else{
            System.out.println("Рост не может быть отрицательным!");
        }
    }

    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        if(weight >= 0){
            this.weight = weight;
        }else{
            System.out.println("Вес не может быть отрицательным!");
        }
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        if(speed >= 0){
            this.speed = speed;
        }else{
            System.out.println("Скорость не может быть отрицательной!");
        }
    }

    public int getStrength(){
        return strength;
    }
    public void setStrength(int strength){
        if(strength >= 0){
            this.strength = strength;
        }else{
            System.out.println("Сила не может быть отрицательной!");
        }
    }

    public int getArmor(){
        return armor;
    }
    public void setArmor(int armor){
        if(armor >= 0){
            this.armor = armor;
        }else{
            System.out.println("Броня не может быть отрицательной!");
        }
    }

    public boolean drift(){
        System.out.println(modelName + " в состоянии дрифта");
        return true;
    }
    public void move(){
        System.out.println(modelName + " начал движение");
    }
    public void scanKaiju(){
        System.out.println(modelName + " ничего не нашел");
    }
    public void useVortexCannon(){
        System.out.println("Активирована вихревая пушка.... ЗАЛП!");
    }




}
