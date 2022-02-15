package com.company;

public class Horse extends AbstractAnimal{
    private String color;

    public Horse(int weight, int age, String nickName, String gender, String color) {
        super(weight, age, nickName, gender);
        this.color = color;
    }

}
