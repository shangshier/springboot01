package com.boot.template;

/**
 * @author: shangshanshan
 * @date: 2019-4-9 20:53
 * @Description: TODO
 */
public class SonClass extends ParentClass {

    public SonClass() {
        System.out.println("子类");
    }

    private String sonName;

    private int sonAge;

    protected void sonMonthed(){
        System.out.println("子类方法");
    }

    //重载：方法名相同而参数列表不同的一组方法就是重载
    //重载式多态，也叫编译时多态。也就是说这种多态在编译时已经确定好了。

    //重写：子类对父类中某些方法进行重新定义，在调用这些方法时就会调用子类的方法
    //重写式多态，也叫运行时多态。这种多态通过动态绑定技术实现，是指在执行期间判断所引用对象的实际类型
    //根据其实际的类型调用其相应的方法。也就是说，只有程序运行起来，你才知道调用的是哪个子类的方法
    //这种多态通过函数的重写以及向上转型来实现
    //当子类继承父类时，可以重写父类中的所有方法（包括不是抽象方法）

    //向上转型时，子类如果没有重写父类中的一些方法，那么调用时调用的是父类的方法；如果子类重写了父类的方法，调用的时候调用的是子类的方法。
    //向上转型既能调用父类的方法，也能调用子类的方法(在向上转型时，子类单独定义的方法会丢失。)
    //向下转型：向下转型之前，你必须得先向上转型
    //当父类对象引用变量引用子类对象时，被引用对象的类型决定了调用谁的成员方法，引用变量类型决定可调用的方法。如果子类没有覆盖该方法，那么会去父类中寻找


    public static void main(String[] args) {

        System.out.println("市一中_高中".substring("市一中_高中".indexOf("_") + 1));

        SonClass son = new SonClass();

        son.parentMonthed();

        //向上转型 可以调用父类和子类所有的方法(不包含私有方法和static方法)
        ParentClass parent = new SonClass();

        //向下转型 可以调用父类和子类所有的方法(不包含私有方法和static方法)
        SonClass sn = (SonClass) parent;

        son.setName("张三");



    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public int getSonAge() {
        return sonAge;
    }

    public void setSonAge(int sonAge) {
        this.sonAge = sonAge;
    }
}
