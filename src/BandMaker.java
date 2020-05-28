import java.util.Scanner;

public class BandMaker {

    public static void main(String[] args) {

        InstrumentFactory creator = new InstrumentFactory();

        Scanner scan = new Scanner(System.in);
        // get instrument 1,2,3,4
        System.out.println("Please enter you first instrument");
        Instrument i1 =  creator.GetInstrument(scan.next(),"Do");
        System.out.println("Please enter you second instrument");
        Instrument i2 =  creator.GetInstrument(scan.next(),"Re");
        System.out.println("Please enter you third instrument");
        Instrument i3 =  creator.GetInstrument(scan.next(),"Mi");
        System.out.println("Please enter you fourth instrument");
        Instrument i4 =  creator.GetInstrument(scan.next(),"Fa");
        // use the given instrument
        i1.play();
        i2.play();
        i3.play();
        i4.play();
    }
}
