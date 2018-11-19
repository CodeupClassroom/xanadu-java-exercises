package interfacesAndAbstractClassesLecture.extra;

public class Piano extends MusicInstrument implements Tuneable, VolumeAdjustable {

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }

    public void pianoMethod() {
        System.out.println("Play Moonlight Sonata");
    }

    @Override
    public void prepareForPerformance() {
        tuneInstrument();
        startMusic();
    }

    @Override
    public void startMusic() {
        System.out.println("Pushing the right keys down");
    }

    @Override
    public void stopMusic() {
        System.out.println("No longer pushing keys");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tuning strings...");
        System.out.println("Tuning complete!");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Detuning...");
        System.out.println("Out of tune!");
    }

    @Override
    public void volumeUp() {
        System.out.println("Pushing keys down faster");
    }

    @Override
    public void volumeDown() {
        System.out.println("Pushing keys down slower");
    }
}
