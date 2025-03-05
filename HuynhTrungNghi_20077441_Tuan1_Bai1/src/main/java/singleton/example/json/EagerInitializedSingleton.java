package singleton.example.json;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
//private constructor to avoid client applications to useconstructor
    private EagerInitializedSingleton(){

    }
    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

    public void showMessage() {
    }
}

