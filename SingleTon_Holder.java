package singleton;

public class SingleTon_Holder {
    /**
     * 类级的内部类，也就是静态的成员内部类，该内部类的实例与外部类的实例
     * 没有绑定关系，而且只有被调用到才会装载，从而实现了延迟加载
     */
    private static class SingleTonHolder{
        /*
        *静态初始化器，由jvm来保证线程安全
         */
        private static SingleTon_Holder instance = new SingleTon_Holder();
    }
//    私有化构造方法
    public SingleTon_Holder() {
    }
    public static SingleTon_Holder getInstance(){
        return SingleTonHolder.instance;
    }
    /*
     当getInstance方法第一次被调用的时候，
     它第一次读取SingletonHolder.instance，
     导致SingletonHolder类得到初始化；
     而这个类在装载并被初始化的时候，会初始化它的静态域，
     从而创建Singleton的实例，由于是静态的域，
     因此只会被jvm在装载类的时候初始化一次，
     并由jvm来保证它的线程安全性。这个模式的优势在于，getInstance方法并没有被同步，
     并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
     */
}
