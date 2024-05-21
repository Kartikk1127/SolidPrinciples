//Here, we've replaced the start_engine method with a more general start method in the base class Vehicle. The Car class implements the start method to start the engine, while the Bicycle class implements the start method to indicate that the rider is pedaling.
//
//Now, instances of Car and Bicycle can be safely substituted for instances of Vehicle without any unexpected behavior or errors.
public class Bicycle extends Vehicle{
    @Override
    public void start() {
        super.start();
        System.out.println("pedaling the cycle");
    }
}
