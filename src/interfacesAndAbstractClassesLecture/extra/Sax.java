package interfacesAndAbstractClassesLecture.extra;

public class Sax extends MusicInstrument implements VolumeAdjustable, Tuneable {

    private String saxType;

    public Sax(String instrumentClassification, String saxType) {
        super(instrumentClassification);
        this.saxType = saxType;
    }

    public void makeAmazingSounds() {
        System.out.println("Setting Kenny G to 11");
    }

    @Override
    public void prepareForPerformance() {
        System.out.println("Clean valves");
        tuneInstrument();
        startMusic();
    }

    @Override
    public void startMusic() {
        System.out.println("Applying breath");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping breath");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Adjust mouthpiece");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Adjust mouthpiece");
    }

    public String getSaxType() {
        return saxType;
    }

    public void setSaxType(String saxType) {
        this.saxType = saxType;
    }

    @Override
    public void volumeUp() {
        System.out.println("Blowing harder");
    }

    @Override
    public void volumeDown() {
        System.out.println("Blowing lighter");
    }
}
