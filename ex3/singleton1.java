// Ленивая
class Singleton {
    private static Singleton instance = null;
    private Singleton() {
        System.out.println("creatigng object");
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
		} else{
            System.out.println("object alreay exists");
        }
        return instance;
    }
    public void setUp() {
        System.out.println("setUp");
    }
}

public class singleton1 {
    public static void main(String[] args){
        Singleton singelton = Singleton.getInstance();
        singelton.setUp();
        Singleton singelton2 = Singleton.getInstance();
        singelton2.setUp();
    }
}
