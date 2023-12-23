package ru.netelogy.java.dzRadio.dzRadio;


public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxCurrentStation;

    public Radio() {
        this.maxCurrentStation = 9;
    }

    public Radio(int numberOfRadioStation) {
        this.maxCurrentStation = numberOfRadioStation - 1;
    }

    public void next() {
        if (currentRadioStation != maxCurrentStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prev() {
        if (currentRadioStation != 0) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxCurrentStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume != 100) {
            currentVolume++;
        } else {
            currentVolume = 0;
        }
    }

    public void reductionVolume() {
        if (currentVolume != 0) {
            currentVolume--;
        } else {
            currentVolume = 100;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxCurrentStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxCurrentStation() {
        return maxCurrentStation;
    }

    public int getMinCurrentStation() {
        return 0;
    }
}
