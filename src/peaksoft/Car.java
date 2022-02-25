package peaksoft;

public class Car implements AutoCloseable {



    public void drive() {
        System.out.println("driving");
    }

    @Override
    public void close() throws Exception {
        System.out.println("car closes");

    }
}
