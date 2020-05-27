import java.util.Scanner;

public class BandMaker {

    public static void main(String[] args) {

        InstrumentFactory creator = new InstrumentFactory();

        Scanner scan = new Scanner(System.in);

        // get instrument 1,2,3,4
        Instrument i1 =  creator.GetInstrument(scan.next(),"Do");
        Instrument i2 =  creator.GetInstrument(scan.next(),"Re");
        Instrument i3 =  creator.GetInstrument(scan.next(),"Mi");
        Instrument i4 =  creator.GetInstrument(scan.next(),"Fa");

        i1.play();
        i2.play();
        i3.play();
        i4.play();
    }
}
