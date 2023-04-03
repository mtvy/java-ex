
// Ленивая
enum Singleton {
    SINGLETON;
    
    public void setUp() {
        System.out.println("setUp");
    }
}

public class singleton3 {
    public static void main(String[] args){
        Singleton singelton = Singleton.SINGLETON;
        singelton.setUp();
        Singleton singelton2 = Singleton.SINGLETON;
        singelton2.setUp();
    }
}
