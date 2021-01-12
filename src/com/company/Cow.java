package com.company;

public class Cow {
    int weightCow;
    int ageCow;
    String sex;
    String nickname;

    public Cow (){}

    public Cow(int weightCow, int ageCow, String sex, String nickname){
        this.weightCow = weightCow;
        if (ageCow > 0){
            this.ageCow = ageCow;
        }
        this.sex = sex;
        this.nickname = nickname;
    }

    public void printInfo(){
        System.out.println("Cow\nweight - " + weightCow + ", age - " + ageCow + ", sex - " + sex + ", nickname - " + nickname);
    }

    public int getWeightCow() {
        return weightCow;
    }

    public void setWeightCow(int weightCow) {
        this.weightCow = weightCow;
    }

    public int getAgeCow() {
        return ageCow;
    }

    public void setAgeCow(int ageCow) {
        this.ageCow = ageCow;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
