package org.yipeng.jvm;

// AppClassloader称为系统类加载器，又称应用加载器
public class TestAppClassloader {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.class.path"));
        System.out.println("sys: " + ClassLoader.getSystemClassLoader());
        System.out.println("parent : " +ClassLoader.getSystemClassLoader().getParent());
    }
}
