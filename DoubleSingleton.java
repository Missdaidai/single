package singleton;

public class DoubleSingleton {
    private DoubleSingleton() {
    }

    private static volatile DoubleSingleton doubleSingleton;
    public static DoubleSingleton getDoubleSingleton(){
        if (doubleSingleton==null){
            synchronized(DoubleSingleton.class){
                if (doubleSingleton==null){
                    doubleSingleton = new DoubleSingleton();
                }
            }
        }
        return doubleSingleton;
    }
}
/**
 * 有两次对instance是否为null的判断：如果第一次判断不为空，则直接返回实例就可以了；
 * 如果instance为空，则进入同步代码块再进行null值判断，
 * 再选择是否实例化。第一个null判断可以减少系统的开销。
 * 在实际项目中做过多线程开发的都应该知道DCL。
 */
