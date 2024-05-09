public class FactoryDemo {
    public static ClassZ getClasses(String type){
        if (type.equals("A")){
            return new ClassA();
        }else if(type.equals("B")){
            return new ClassB();
        }
        return null;
    }
}
