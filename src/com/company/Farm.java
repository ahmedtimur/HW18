package com.company;

public class Farm {
    private String adress, ownerName;
    private int cows, sheeps, horses;

    public Farm(String adress, String ownerName, int cows, int sheeps, int horses) {
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

    public int getCows() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows = cows;
    }

    public int getSheeps() {
        return sheeps;
    }

    public void setSheeps(int sheeps) {
        this.sheeps = sheeps;
    }

    public int getHorses() {
        return horses;
    }

    public void setHorses(int horses) {
        this.horses = horses;
    }


}
