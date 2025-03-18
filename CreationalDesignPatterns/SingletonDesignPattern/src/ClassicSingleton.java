public class ClassicSingleton {

    public static ClassicSingleton instance;
    private ClassicSingleton(){}
    //not thread-safe
    public static ClassicSingleton getInstance(){
        //lazy implementation
        if(instance == null){
            instance = new ClassicSingleton();
        }
        return instance;
    }
}
