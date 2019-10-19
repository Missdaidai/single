package singleton;

public class SingleTon2 {
    private static SingleTon2 singleTon2 =null;
    private SingleTon2() {
    }
    public synchronized SingleTon2 getInstance(){
        if (singleTon2==null){
            singleTon2= new SingleTon2();
        }
        return singleTon2;
    }
}
