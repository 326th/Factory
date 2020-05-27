public class Violin implements Instrument {

    private String tone;

    public Violin(String tone){
        this.tone = tone;
    }

    public void play(){
        System.out.println("Play violin at tone "+ tone);
    }

    public void setTone(String tone){
        this.tone = tone;
    }

}
