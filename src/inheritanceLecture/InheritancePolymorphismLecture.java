package inheritanceLecture;

public class InheritancePolymorphismLecture {

    public static void triggerVehicleTurnOn(Vehicle v) {
        v.turnOn();
    }

    public static void main(String[] args) {

        Vehicle vh = new Vehicle(100000000);
        Bus b = new Bus(60);
        Jet j = new Jet(500);
        Yacht y = new Yacht(20);

        Vehicle[] vehicles = {vh, b, j, y};

//        for (Vehicle v: vehicles) {
//            v.turnOn();
//        }


//        vehicles[2].eject();









        // =================== polymorphism example 1 - using methods that return objects

//        Jet j = new Jet(80);
//        Vehicle v = new Jet(80);
//
//        Jet jet = (Jet) v;
//
//        System.out.println(v);
//        System.out.println(jet);
//        j.eject();
//        jet.eject();
//
//        j.turnOn();
//        v.turnOn();


//        Vehicle newVehicle = makeVehicle("jet", 80);
//        newVehicle.turnOn();
//        newVehicle.setNumberOfOccupants(2);
//        System.out.println(newVehicle.getNumberOfOccupants());

//        Bus bus = (Bus) makeVehicle("bus", 55);
//        bus.setNumberOfOccupants(2);
//        System.out.println(bus.getNumberOfOccupants());
        // must cast Vehicle to type Bus and make variable a Bus type
//         otherwise, cannot access subclass specific properties
//        System.out.println(bus.headlightOn);




        // =================== polymorphism example 2 - using methods that take in objects
        Jet jetObject = new Jet(600);
        System.out.println(jetObject.getNumberOfOccupants());
        addOccupant(jetObject);
        addOccupant(jetObject);
        numOfOccupantsMessage(jetObject);

//        Yacht yachtObject = new Yacht(20);
//        addOccupant(yachtObject);
//        numOfOccupantsMessage(yachtObject);




    }

    // method that returns any of the Vehicle subclass objects or the Vehicle class object
    public static Vehicle makeVehicle(String type, int maxSpeed) {
        Vehicle obj = null;
        switch (type) {
            case "vehicle":
                obj = new Vehicle(maxSpeed);
                break;
            case "jet":
                obj = new Jet(maxSpeed);
                break;
            case "yacht":
                obj = new Yacht(maxSpeed);
                break;
            case "bus":
                obj = new Bus(maxSpeed);
                break;
        }
        return obj;
    }



    // methods which take in any of the vehicle subclasses
    public static void numOfOccupantsMessage(Vehicle obj) {
        System.out.println("This vehicle is holding " + obj.getNumberOfOccupants());
    }

    public static void addOccupant(Vehicle obj) {
        obj.setNumberOfOccupants(obj.getNumberOfOccupants() + 1);
    }

}
