public class DoubleCheckedLockingSingleton {
    public static DoubleCheckedLockingSingleton instance = null;
    private DoubleCheckedLockingSingleton(){}
    public static DoubleCheckedLockingSingleton getInstance(){
        if(instance == null){
            synchronized (DoubleCheckedLockingSingleton.class){
                //checking again as multiple threads can reach above step
                if(instance == null){
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
