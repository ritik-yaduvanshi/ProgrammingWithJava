public class InstanceCounter {
    private static int instances = 0;//class Variables
    protected static int getInstances(){//return method
        return instances;
    }
    private static void setInstances(){//value set method
        instances++;
    }
    InstanceCounter(){
        InstanceCounter.setInstances();//constructor to add instance
    }

    public static void main(String[] args) {
        System.out.println("Starting with\s"+InstanceCounter.getInstances()+"\sInstances");
        for (int i = 0; i < 10; i++) {
            new InstanceCounter();
        }
        System.out.println("Created\s"+InstanceCounter.getInstances()+"\sInstances");
    }
}
