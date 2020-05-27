public class Guitar implements Instrument {

    private String tone;

    public Guitar(String tone){
        this.tone = tone;
    }

    public void play(){
        System.out.println("Play guitar at tone "+ tone);
    }

    public void setTone(String tone){
        this.tone = tone;
    }

}
