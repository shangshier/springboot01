package com.boot.template.abstractclass;

/**
 * @author: shangshanshan
 * @date: 2019-7-11 21:13
 * @Description: 抽象父类
 */
public abstract class AbstractParent {

    //抽象类只是比普通类增加了抽象方法以及对子类的强制性的覆写要求而已，其他的使用和传统的类继承是完全相同的
    //抽象类也可以有构造方法，但是抽象类是不能使用new进行实例化的必须使用子类实例化实现
    //抽象类也可以和子类一样有普通方法，普通变量，静态方法，静态变量
    //抽象类中不一定有抽象方法，抽象方法一定在抽象类中
    private String name;

    private String age;

    private String className;

    private static final String STR = "1234";

    public AbstractParent() {
    }

    public AbstractParent(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public AbstractParent(String name, String age, String className) {
        this(name,age);
        this.className = className;
    }

    //抽象类的抽象方法必须使用public或protected修饰 因为抽象类中的抽象方法必须要被子类重写 private不能被重写
    public abstract void abstrPubFun();

    protected abstract void abstrProFun();

    public void abstrPtPubFun(){
        System.out.println("抽象类父类public方法");
    }

    protected void abstrPtProFun(){
        System.out.println("抽象类父类protected方法");
    }

    private void abstrPtPriFun(){
        System.out.println("抽象类父类private方法");
    }

    //抽象类的静态方法直接通过类名+方法名进行调用
    public static void abstrStaPubFun(){
        System.out.println("抽象类父类public static方法");
    }

    protected static void abstrStaProFun(){
        System.out.println("抽象类父类protected static方法");
    }

    private static void abstrStaPriFun(){
        System.out.println("抽象类父类private static方法");
    }

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
