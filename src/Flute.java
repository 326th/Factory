public class Flute implements Instrument {

    private String tone;

    public Flute(String tone){
        this.tone = tone;
    }

    public void play(){
        System.out.println("Play flute at tone "+ tone);
    }

    public void setTone(String tone){
        this.tone = tone;
    }

}
