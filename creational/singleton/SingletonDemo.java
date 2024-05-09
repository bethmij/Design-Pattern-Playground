public class SingletonDemo {

    private static SingletonDemo singletonDemo;

    private SingletonDemo(){
    }

    public static SingletonDemo getSingletonDemo(){
        if (singletonDemo == null) {
            singletonDemo = new SingletonDemo();
        }

        return singletonDemo;
    }
}
