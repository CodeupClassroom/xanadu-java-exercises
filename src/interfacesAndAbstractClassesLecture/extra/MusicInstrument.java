package interfacesAndAbstractClassesLecture.extra;

public abstract class MusicInstrument implements Playable {

    private String instrumentClassification;

    public MusicInstrument(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    public String getInstrumentClassification() {
        return instrumentClassification;
    }

    public void setInstrumentClassification(String instrumentClassification) {
        this.instrumentClassification = instrumentClassification;
    }

    public abstract void prepareForPerformance();

}
