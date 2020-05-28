public class InstrumentFactory {

    public Instrument GetInstrument(String type,String tone){
        // Instrument logic
        switch(type)
        {
            case "Flute":
                return new Flute(tone);
            case "Piano":
                return new Piano(tone);
            case "Guitar":
                return new Guitar(tone);
            case "Violin":
                return new Violin(tone);
        }
        //Error case
        return new Flute(tone);
    }
}
