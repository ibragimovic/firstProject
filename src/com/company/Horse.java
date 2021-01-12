package com.company;

public class Horse {
    int weightHorse;
    int ageHorse;
    String color;
    String sexHorse;
    String nicknameHorse;

    public Horse (){}

    public Horse (int weightHorse, int ageHorse, String color, String sexHorse, String nicknameHorse){
        this.weightHorse = weightHorse;
        if (ageHorse > 0)
            this.ageHorse = ageHorse;
        this.color = color;
        this.sexHorse = sexHorse;
        this.nicknameHorse =nicknameHorse;
    }

    public void printInfo(){
        System.out.println("Horse\nweight - " + weightHorse + ", age - " + ageHorse + ", color - " + color + ", sex - " + sexHorse + ", nickname - " + nicknameHorse);
    }

    public int getWeightHorse() {
        return weightHorse;
    }

    public void setWeightHorse(int weightHorse) {
        this.weightHorse = weightHorse;
    }

    public int getAgeHorse() {
        return ageHorse;
    }

    public void setAgeHorse(int ageHorse) {
        this.ageHorse = ageHorse;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSexHorse() {
        return sexHorse;
    }

    public void setSexHorse(String sexHorse) {
        this.sexHorse = sexHorse;
    }

    public String getNicknameHorse() {
        return nicknameHorse;
    }

    public void setNicknameHorse(String nicknameHorse) {
        this.nicknameHorse = nicknameHorse;
    }
}
