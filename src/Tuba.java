public class Tuba implements Instrument {

    private String tone;

    public Tuba(String tone){
        this.tone = tone;
    }

    public void play(){
        System.out.println("Play tuba at tone "+ tone);
    }

    public void setTone(String tone){
        this.tone = tone;
    }

}
