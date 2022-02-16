package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Sheep[] sheepsArrFarm1 = {new Sheep(15, 6, "Bob", "male"),
                            new Sheep(16, 7, "Rob", "male"),
                            new Sheep(17, 8, "Gob", "female")};

        Cow[] cowsArrFarm1 = {new Cow(200, 10, "Chad", "male"),
                        new Cow(201, 11, "Mad", "female"),
                        new Cow(202, 12, "Dad", "male"),
                        new Cow(203, 13, "Rad", "female"),
                        new Cow(204, 14, "Jad", "female"),
                        new Cow(205, 15, "Lad", "male")};

        Horse[] horsesArrFarm1 = {new Horse(150, 5, "Petty","female","pink"),
                            new Horse(151, 6, "Setty","male", "black")};

       Farm farm1 = new Farm("Ahunbayeva street", "Dima", cowsArrFarm1, sheepsArrFarm1, horsesArrFarm1);
        System.out.println(farm1);

       // Second Farm

       Sheep[] sheepsArrFarm2 = {new Sheep(15, 6, "Fob", "male")};
       Cow[] cowsArrFarm2 = {new Cow(203, 13, "Aad", "female")};
       Horse[] horsesArrFarm2 = {new Horse(151, 6, "Yetty","male", "black")};

       Farm farm2 = new Farm("Chapaeva street", "Lesha", cowsArrFarm2,sheepsArrFarm2,horsesArrFarm2);
        System.out.println(farm2);
    }
}
