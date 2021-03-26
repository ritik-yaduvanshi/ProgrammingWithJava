public class InstanceCounter {
    private static int instances = 0;
    protected static int getInstances(){
        return instances;
    }
    private static void setInstances(){
        instances++;
    }
    InstanceCounter(){
        InstanceCounter.setInstances();
    }

    public static void main(String[] args) {
        System.out.println("Starting with\s"+InstanceCounter.getInstances()+"\sInstances");
        for (int i = 0; i < 10; i++) {
            new InstanceCounter();
        }
        System.out.println("Created\s"+InstanceCounter.getInstances()+"\sInstances");
    }
}
