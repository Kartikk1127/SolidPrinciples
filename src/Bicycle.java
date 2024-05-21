
//In this example, the Bicycle class violates the LSP because it provides an implementation for the start_engine method, which doesn't make sense for a bicycle.
//
//If we try to substitute a Bicycle instance where a Vehicle instance is expected, it might lead to unexpected behavior or errors.
public class Bicycle extends Vehicle{
    @Override
    public void startEngine() {
        //todo: doesn't make sense for bicycle as it has no engine
        throw new IllegalArgumentException("cycle me engine kahan hota hai bhai");
    }
}
