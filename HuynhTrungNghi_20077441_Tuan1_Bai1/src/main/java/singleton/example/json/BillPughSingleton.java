package singleton.example.json;

public class BillPughSingleton {
    private BillPughSingleton(){}

    public void showMessage() {

    }

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new
                BillPughSingleton();

    }
    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}

