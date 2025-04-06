public class Radio {

    public int currentVolume;
    public int currentStation;


    public void increaseVolume(int newCurrentVolume) {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void totalNumberStation(int newCurrentStation) {
        if (currentStation >= 0 && currentStation <= 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation > 9) {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation < 0) {
            currentStation = 9;
        }
    }


}