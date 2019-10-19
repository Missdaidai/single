package singleton;
/*
    饿汉模式  线程安全
 */
public class Singleton02 {
//    私有化构造方法
    private Singleton02() {
    }
//    指向自己实例的私有静态引用，主动创建
    private static Singleton02 singleton02 = new Singleton02();
//    以自己实例为返回值的静态公有方法
    public static Singleton02 getInstance(){
        return singleton02;
    }

}
