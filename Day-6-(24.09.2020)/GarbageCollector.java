public class GarbageCollector {
    protected void finalize() throws Throwable {
        System.out.println("finalize() is called");
    }

    public static void main(String[] args) {
        // object creation
        GarbageCollector obj1 = new GarbageCollector();
        GarbageCollector obj2 = new GarbageCollector();

        // making object ready for garbage collection
        obj1 = null;
        obj2 = null;

        // explicit call of garbage collector
        System.gc();
    }
}