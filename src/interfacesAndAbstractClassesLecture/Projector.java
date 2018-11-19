package interfacesAndAbstractClassesLecture;

public class Projector implements Controllable, Navigatable {

    @Override
    public void powerOn() {
        System.out.println("picking on remote signal");
        System.out.println("starting projector sequence");
    }

    @Override
    public void powerOff() {
        System.out.println("picking up remote signal");
        System.out.println("starting projector off sequence");
    }

    public void bringUpMenu() {
        System.out.println("Accessing menue view and displaying through projector");
    }

    @Override
    public void scrollUpMenu() {
        System.out.println("scrolling up menu");
    }

    @Override
    public void scrollDownMenu() {
        System.out.println("Scrolling down menu");
    }
}
