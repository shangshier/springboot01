package com.boot.template.design_mode.ProxyMode.cglib_proxy;

/**
 * @author: shangshanshan
 * @date: 2019-9-18 21:10
 * @Description: cglib代理对象
 * Cglib代理，也叫做子类代理，它是在内存中构件一个子类对象，从而实现对目标对象的功能拓展。
 *
 * 1.JDK的动态代理有个限制，就是使用动态代理的目标对象必须实现至少一个接口，由此，没有实现接口但是想要使用代理的目标对象，就可以使用Cglib代理。
 * 2.Cglib是强大的高性能的代码生成包，它可以在运行期间拓展Java类与实现Java接口。
 * 它广泛的被许多AOP的框架使用，例如Spring AOP和synaop，为他们提供方法的interception(拦截)。
 * 3.Cglib包的底层是通过使用一个小而快的字节码处理框架ASM来转换字节码并生成新的类，不鼓励直接只使用ASM，因为它要求你必须对JVM内部结构，
 * 包括class文件的格式和指令集都很熟悉。
 */
public class CglibProxyClass {

    public void save(){
        System.out.println("cglib代理1");
    }

    public void fun(){
        System.out.println("方法2");
    }
}
