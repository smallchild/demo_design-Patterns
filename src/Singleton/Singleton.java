package Singleton;

public class Singleton {
    private static Singleton instance = null;

    private Singleton(){};

    //线程不安全
    public static Singleton getInstance(){
        if(instance ==null){
            instance = new Singleton();
        }
        return instance;
    }

    //性能低下
    public static synchronized Singleton getSyncInstance(){
        if(instance ==null){
            instance = new Singleton();
        }
        return instance;
    }

    //比较好的写法
    public static class Holder{
        private static Singleton singleton= new Singleton();
    }
    public static Singleton getInstance1(){
        return Singleton.Holder.singleton;
    }
}
