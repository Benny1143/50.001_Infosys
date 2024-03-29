package Example55;

import Week5.Lecture.Example55.Observer;

public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

class AirPollutionAlert implements Subject{
    private double airPollutionIndex;

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
    }

    @Override
    public void register(Observer o) {

    }

    @Override
    public void unregister(Observer o) {

    }

    @Override
    public void notifyObservers() {

    }
}
