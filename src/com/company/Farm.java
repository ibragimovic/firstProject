package com.company;

public class Farm {
    String address;
    Cow[] herdCow;
    Sheep[] herdSheep;
    Horse[] herdHorse;
    String nameOwner;

    public Farm (){}

    public Farm (String address, Cow[] herdCow, Sheep[] herdSheep, Horse[] herdHorse, String nameOwner){
        this.address = address;
        this.herdCow = herdCow;
        this.herdSheep = herdSheep;
        this.herdHorse = herdHorse;
        this.nameOwner = nameOwner;
    }

    public void printInfo() {
        System.out.println("FARM\n address - " + address);
        for (int i = 0; i < herdCow.length; i++) {
            herdCow[i].printInfo();
        }
        for (int i = 0; i < herdSheep.length; i++){
            herdSheep[i].printInfo();
        }
        for (int i = 0; i < herdHorse.length; i++){
            herdHorse[i].printInfo();
        }
        System.out.println("name of owner - " + nameOwner);

    }





    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getHerdCow() {
        return herdCow;
    }

    public void setHerdCow(Cow[] herdCow) {
        this.herdCow = herdCow;
    }

    public Sheep[] getHerdSheep() {
        return herdSheep;
    }

    public void setHerdSheep(Sheep[] herdSheep) {
        this.herdSheep = herdSheep;
    }

    public Horse[] getHerdHorse() {
        return herdHorse;
    }

    public void setHerdHorse(Horse[] herdHorse) {
        this.herdHorse = herdHorse;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }
}
