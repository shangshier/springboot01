package com.boot.template.design_mode.MultitonMode;

/**
 * @author: shangshanshan
 * @date: 2019-8-1 20:59
 * @Description: 多例模式
 *
 * 为什么用单例多例：
 *   之所以用单例，是因为没必要每个请求都新建一个对象，这样子既浪费CPU又浪费内存；
 *  之所以用多例，是为了防止并发问题；即一个请求改变了对象的状态，此时对象又处理另一个请求，而之前请求对对象状态的改变导致了对象对另一个请求做了错误的处理；
 */
public class MultitonMode {

    //多例模式使用场景
    //多并发请求环境下，系统需要为每个客户端的独立请求提供单独服务的资源，但是系统总的开销是有限的，
    // 系统在并发量很大时也不可能为所有的并发请求同时提供相应的资源，否则不但系统资源消耗量大而且非常耗时。
    // 这时就可以考虑使用池的概念，也即是一种多例模式的实现。具体的应用场景，比如数据库连接池、EJB无状态会话Bean的实例池

    //代码实现上一般是提供一个容器类，也即是容纳资源对象的池，对象池的一些属性可以通过配置文件来配置，
    // 比如数据库连接池中容纳的Connection类型的对象数目的上限和下限、闲置连接超时时间等；
    // 然后每当应用程序请求数据库连接时，先判断池中有无空闲的连接，如有，即返回这个对象，如没有，则新建一个连接对象，并放入连接池中进行管理


    //使用static final定义对象时对象本身不会改变,但对象内部的属性值是可以通过set方法重新设置值的
    private static final MultitonMode MU1 = new MultitonMode();
    private static final MultitonMode MU2 = new MultitonMode();
    private static final MultitonMode MU3 = new MultitonMode();

    //构造方法私有化
    private MultitonMode() {
    }

    public static MultitonMode getMultitonMode(String key){

        if ("1".equals(key)){
            return MU1;
        } else if ("2".equals(key)){
            return MU2;
        } else {
            return MU3;
        }
    }

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
         return this.name + this.age;
    }
}
