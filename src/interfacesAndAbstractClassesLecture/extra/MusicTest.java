package interfacesAndAbstractClassesLecture.extra;

public class MusicTest {

    public static void main(String[] args) {

        Piano p = new Piano("keyboard", 88);
        detuneRetune(p);
        System.out.println(p.getInstrumentClassification());

        Sax s = new Sax("brass", "Alto");
        detuneRetune(s);

        makeTwoStaccatoSounds(s);

    }

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }

    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }


}
