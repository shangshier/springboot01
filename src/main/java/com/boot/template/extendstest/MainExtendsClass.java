package com.boot.template.extendstest;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: shangshanshan
 * @date: 2019-6-24 10:40
 * @Description: TODO
 */
public class MainExtendsClass {

    @Autowired
    private InterfaceClass interfaceClass;
    @Autowired
    private AbstractClass abstractClass;

    public void test(){
        interfaceClass.get();
        abstractClass.create();
    }

    public static void main(String[] args) {

        //子类重写父类的方法时重写的方法的权限必须比父类大或者相等(如：父类的方法为protected则子类重写时必须为protected或public)
        //对象的私有方法只能够在对象内使用
        //类实例化为对象后不能直接使用引用调用类的静态方法，因为静态方法在编译时就直接分配的内存空间,实例方法只有在对象实例化后才会分配对应的内存
        //静态方法的调用直接使用类名+方法名
        Student st = new Student();
        st.proSonFun();
        st.pubFun();
        st.pubSonFun();
        st.proFun();




        //向上转型
        //向上转型后对象引用只能够调用父类的public、protected方法(若方法被重写则首先调用的是子类重写的方法，这是因为在运行时JVM会进行动态绑定)
        Person ps = new Student();
        ps.proFun();
        ps.pubFun();

        //向下转型(向下转型时必须要先进行向上转型)
        //向下转型后调用子类自身的public、protected方法和父类的public、protected方法(注：必须在同一个包内才可以调用父类的protected方法,否则不能调用)
        //protected方法是有限制的只用在同一个包下才能使用
        Student sts = (Student) ps;
        sts.proFun();
        sts.pubSonFun();
        sts.pubFun();
        sts.proSonFun();

        //静态方法与静态变量
        //子类能够直接调用父类的静态变量与静态方法(注：protected方法与变量)
        //父类只能调用他自身的静态变量与静态方法




//        Student st = new Student();
//        Person pn = st;
//        pn.
//
//        //内存分析：new Student() 实例化子类时首先要先实例化父类 所以此时产生了父类的匿名对象(实例化)
//        // 被子类栈内存指向的堆内存 所以Student的堆内存包含了父类的属性 name和age
//        System.out.println("名字：" + st.getName() + "、年龄：" + st.getAge() + "、学校" + st.getSchool());
//
//        Student.fun();

    }


}
