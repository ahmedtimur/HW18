package com.company;

import java.util.Arrays;

public class Farm {
    private String adress, ownerName;
    private Cow[] cows;
    private Sheep[] sheeps;
    private Horse[] horses;

    public Farm(String adress, String ownerName, Cow[] cows, Sheep[] sheeps, Horse[] horses) {
        this.adress = adress;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm {" +
                "adress = '" + adress + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cows=" + cows.length +
                ", sheeps=" + sheeps.length +
                ", horses=" + horses.length +
                '}';
    }
}
