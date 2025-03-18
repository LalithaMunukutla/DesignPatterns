//classes are loaded only once in memory by JDK.
public class InnerClassLoaderSingleton {
    private InnerClassLoaderSingleton(){
        System.out.println("Instance created");
    }
//Inner classes are loaded in memory by JDK when it comes to usage.
//If we are not performing any action with inner class in our codebase,
//JDK will not load that inner class into memory.

    public static class InnerClassLoader{
        public static final InnerClassLoaderSingleton instance = new InnerClassLoaderSingleton();
    }

    public static InnerClassLoaderSingleton getInstance(){
        return InnerClassLoader.instance;
    }
}
