package com.boot.template.design_mode.Singleton;

/**
 * @author: shangshanshan
 * @date: 2019-7-31 20:54
 * @Description: 单例模式
 */
public class SingletonClass {

    private SingletonClass() {
    }

    //单例模式特点: 首先要保证构造方法的私有化, 其次类的内部要提供static方法获取实例化对象,
    //这样不管外部如何操作永远都只有一个实例化对象提供
    //1、单例类只能有一个实例。
    //2、单例类必须自己创建自己的唯一实例。
    //3、单例类必须给所有其他对象提供这一实例。

    //饿汉式单例
    //是否 Lazy 初始化：否
    //是否多线程安全：是
    //实现难度：易
    //描述：这种方式比较常用，但容易产生垃圾对象。
    //优点：没有加锁，执行效率会提高。
    //缺点：类加载时就初始化，浪费内存。
    //它基于 classloader 机制避免了多线程的同步问题，不过，singletonClass 在类装载时就实例化，
    // 虽然导致类装载的原因有很多种，在单例模式中大多数都是调用 getSingletonClass 方法，
    // 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化 instance 显然没有达到 lazy loading 的效果。

    //饿汉式单例类:在类初始化时，已经自行实例化。
    private static final SingletonClass singletonClass = new SingletonClass();

    public static SingletonClass getSingletonClass() {
        return singletonClass;
    }

    //懒汉式单例 线程不安全
    //是否 Lazy 初始化：是
    //是否多线程安全：否
    //实现难度：易
    //描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
    //这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作。

    //此方式在单线程的时候工作正常，但在多线程的情况下就有问题了。
    // 如果两个线程同时运行到判断instance是否为null的if语句，并且instance的确没有被创建时，
    // 那么两个线程都会创建一个实例，此时类型Singleton1就不再满足单例模式的要求了。
    private static SingletonClass singletonClass1;

    public static SingletonClass getSingletonClass1(){

        if (singletonClass1 == null) {
            return new SingletonClass();
        }
        return singletonClass1;
    }

    //懒汉式单例 线程安全
    //是否 Lazy 初始化：是
    //是否多线程安全：是
    //实现难度：易
    //描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
    //优点：第一次调用才初始化，避免内存浪费。
    //缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
    //getSingletonClass2() 的性能对应用程序不是很关键（该方法使用不太频繁）。

    //为了保证在多线程环境下我们还是只能得到该类的一个实例，只需要在getInstanceB()方法加上同步关键字sychronized，就可以了。
    // 但每次调用getInstanceB()方法时都被synchronized关键字锁住了，会引起线程阻塞，影响程序的性能。
    private static SingletonClass singletonClass2;

    public static synchronized SingletonClass getSingletonClass2(){

        if (singletonClass2 == null){
            return new SingletonClass();
        }
        return singletonClass2;
    }

    //双检锁/双重校验锁（DCL，即 double-checked locking）
    //JDK 版本：JDK1.5 起
    //是否 Lazy 初始化：是
    //是否多线程安全：是
    //实现难度：较复杂
    //描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
    //getSingletonClass3() 的性能对应用程序很关键

    //为了在多线程环境下，不影响程序的性能，不让线程每次调用getInstanceC()方法时都加锁，
    // 而只是在实例未被创建时再加锁，在加锁处理里面还需要判断一次实例是否已存在。
    private volatile static SingletonClass singletonClass3;

    public static SingletonClass getSingletonClass3(){
        if (singletonClass3 == null){
            synchronized (SingletonClass.class) {
                if (singletonClass3 == null) {
                    singletonClass3 = new SingletonClass();
                }
            }
        }
        return singletonClass3;
    }

    //登记式/静态内部类
    //是否 Lazy 初始化：是
    //是否多线程安全：是
    //实现难度：一般
    //描述：这种方式能达到双检锁方式一样的功效，但实现更简单。
    // 对静态域使用延迟初始化，应使用这种方式而不是双检锁方式。
    // 这种方式只适用于静态域的情况，双检锁方式可在实例域需要延迟初始化时使用。
    //这种方式同样利用了 classloader 机制来保证初始化 SINGLETON 时只有一个线程，
    // 它跟第 3 种方式不同的是：第 3 种方式只要 SingletonClass 类被装载了，那么 SINGLETON 就会被实例化（没有达到 lazy loading 效果），
    // 而这种方式是 SingletonClass 类被装载了，SINGLETON 不一定被初始化。
    // 因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getSingletonClass4 方法时，才会显式装载 SingletonHolder 类，从而实例化 SINGLETON。
    // 想象一下，如果实例化 SingletonClass 很消耗资源，所以想让它延迟加载，另外一方面，又不希望在 SingletonClass 类加载时就实例化，
    // 因为不能确保 SingletonClass 类还可能在其他的地方被主动使用从而被加载，那么这个时候实例化 instance 显然是不合适的。
    // 这个时候，这种方式相比第 3 种方式就显得很合理。

    //加载一个类时，其内部类不会同时被加载。一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生。
    // 由于在调用 SingletonClass.getSingletonClass4() 的时候，才会对单例进行初始化，而且通过反射，是不能从外部类获取内部类的属性的；
    // 由于静态内部类的特性，只有在其被第一次引用的时候才会被加载，所以可以保证其线程安全性。
    //总结：
    //优势：兼顾了懒汉模式的内存优化（使用时才初始化）以及饿汉模式的安全性（不会被反射入侵）。
    //劣势：需要两个类去做到这一点，虽然不会创建静态内部类的对象，但是其 Class 对象还是会被创建，而且是属于永久带的对象。

    private static class SingletonHolder {
        private static final SingletonClass SINGLETON = new SingletonClass();
    }

    public static SingletonClass getSingletonClass4(){
        return SingletonHolder.SINGLETON;
    }


    //枚举
    //JDK 版本：JDK1.5 起
    //是否 Lazy 初始化：否
    //是否多线程安全：是
    //实现难度：易
    //描述：这种实现方式还没有被广泛采用，但这是实现单例模式的最佳方法。它更简洁，自动支持序列化机制，绝对防止多次实例化。
    //这种方式是 Effective Java 作者 Josh Bloch 提倡的方式，
    // 它不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
    // 不过，由于 JDK1.5 之后才加入 enum 特性，用这种方式写不免让人感觉生疏，在实际工作中，也很少用。
    //不能通过 reflection attack 来调用私有构造方法。

    //创建枚举默认就是线程安全的，所以不需要担心double checked locking，
    // 而且还能防止反序列化导致重新创建新的对象。保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）。
    public enum Singleton {
        INSTANCE;
        public void doSomeThing() {
        }
    }

















}
