package com.company;

public class Sheep {
    int weightSheep;
    int ageSheep;
    String sexSheep;
    String nicknameSheep;

    public Sheep (){}

    public Sheep (int weightSheep, int ageSheep, String sexSheep, String nicknameSheep){
        this.weightSheep = weightSheep;
        if (ageSheep > 0)
            this.ageSheep = ageSheep;
        this.sexSheep = sexSheep;
        this.nicknameSheep = nicknameSheep;

    }

    public void printInfo(){
        System.out.println("Sheep\nweight - " + weightSheep + ", age - " + ageSheep + ", sex - " + sexSheep + ", nickname - " + nicknameSheep);
    }

    public int getWeightSheep() {
        return weightSheep;
    }

    public void setWeightSheep(int weightSheep) {
        this.weightSheep = weightSheep;
    }

    public int getAgeSheep() {
        return ageSheep;
    }

    public void setAgeSheep(int ageSheep) {
        this.ageSheep = ageSheep;
    }

    public String getSexSheep() {
        return sexSheep;
    }

    public void setSexSheep(String sexSheep) {
        this.sexSheep = sexSheep;
    }

    public String getNicknameSheep() {
        return nicknameSheep;
    }

    public void setNicknameSheep(String nicknameSheep) {
        this.nicknameSheep = nicknameSheep;
    }
}
