package Week5.Lecture.Example55;

public interface Observer{
    void update(double airPollutionIndex);
}

class Subscriber implements Observer{
    private Example55.Subject subject;
    private String observerId;
    public static String outputMessage = "";

    public Subscriber(String observerId, Example55.Subject subject){
        this.subject=subject;
        this.observerId = observerId;
        this.subject.register(this);		// register itself
    }

    @Override
    public void update(double airPollutionIndex) {
        String s = this.observerId + " received notification: " + airPollutionIndex;
        System.out.println(s);
        outputMessage += (s + " ");
    }
}

