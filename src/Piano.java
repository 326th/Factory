public class Piano implements Instrument {

    private String tone;

    public Piano(String tone){
        this.tone = tone;
    }

    public void play(){
        System.out.println("Play piano at tone "+ tone);
    }

    public void setTone(String tone){
        this.tone = tone;
    }

}
