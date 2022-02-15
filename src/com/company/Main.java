package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cow cow = new Cow(200, 15, "Nori", "female");
        Sheep sheep = new Sheep(15, 6, "Chad", "male");
        Horse horse = new Horse(150, 10, "Spirit", "male", "black");

        Farm farm1 = new Farm("1 Street", "Steven", 5, 3, 2);
        Farm farm2 = new Farm("2 Street", "Robin", 1, 1, 1);
    }
}
