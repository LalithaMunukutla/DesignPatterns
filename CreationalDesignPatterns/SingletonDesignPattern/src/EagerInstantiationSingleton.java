public class EagerInstantiationSingleton {
    //Thread-safe
    public static EagerInstantiationSingleton instance = new EagerInstantiationSingleton();
    private EagerInstantiationSingleton(){}
    public static EagerInstantiationSingleton getinstance(){
        return instance;
    }
}
