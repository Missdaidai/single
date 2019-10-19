package singleton;
/*
    懒汉模式  线程不安全
 */

/**
 * 这种实现方式不是thread-safe的，那么可以把上面的方法变成线程安全的吗？
 * 当然可以，在方法getInstance()上加上synchronized修饰符就可以实现方法的同步了。
 * 但是这样系统开销会很大。具体代码SingleTon02：
 */
public class Singleton01 {
//    私有化构造方法
    private Singleton01() {
    }
//    指向自己实例的私有静态引用
    private static Singleton01 s=null;
//    以自己实例为返回值的静态公有方法
    public static Singleton01 getInstance(){
        if (s==null){
            s=new Singleton01();
        }
        return s;
    }
}
