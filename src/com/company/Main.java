package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep farm1Sheep1 = new Sheep(25, 2, "Female", "Olin");
        Sheep farm1Sheep2 = new Sheep(20, 1, "Male", "Oliv");
        Sheep farm1Sheep3 = new Sheep(28, 3, "Female", "Onion");

        Cow farm1Cow1 = new Cow(36,3,"female", "Lina");
        Cow farm1Cow2 = new Cow(39,5,"Male", "Vin");
        Cow farm1Cow3 = new Cow(32,2,"female", "Chu");
        Cow farm1Cow4 = new Cow(41,6,"female", "Wu");
        Cow farm1Cow5 = new Cow(38,8,"female", "Li");

        Horse farm1Horse1 = new Horse(85, 8, "Brown", "Male", "Tyson");
        Horse farm1Horse2 = new Horse(91, 10, "Brown", "Male", "Ali");

        Sheep [] farm1HerdSheep = {farm1Sheep1, farm1Sheep2, farm1Sheep3};
        Cow [] farm1HerdCow = {farm1Cow1, farm1Cow2, farm1Cow3, farm1Cow4, farm1Cow5};
        Horse [] farm1HerdHorse = {farm1Horse1, farm1Horse2};

        Farm farm1 = new Farm("Bishkek city, Manas str, 126", farm1HerdCow, farm1HerdSheep, farm1HerdHorse, "Musaev Ibragim");

        farm1.printInfo();

        Sheep farm2Sheep1 = new Sheep(32, 3, "Female", "Nino");
        Cow farm2Cow1 = new Cow(48,9,"female", "Nina");
        Horse farm2Horse1 = new Horse(85, 10, "Black", "Female", "Wan");

        Sheep [] farm2HerdSheep = {farm1Sheep1};
        Cow[] farm2HerdCow = {farm2Cow1};
        Horse[] farm2HerdHorse = {farm2Horse1};

        Farm farm2 = new Farm("Bishkek, Chyi str., 85", farm2HerdCow, farm2HerdSheep, farm2HerdHorse, "Lionel Messi");

        farm2.printInfo();
    }
}
