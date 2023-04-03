
// Нетерпиливая
class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return instance;
    }

    public void setUp() {
        System.out.println("setUp");
    }
}

public class singleton2 {
    public static void main(String[] args){
        Singleton singelton = Singleton.getInstance();
        singelton.setUp();
        Singleton singelton2 = Singleton.getInstance();
        singelton2.setUp();
    }
}
