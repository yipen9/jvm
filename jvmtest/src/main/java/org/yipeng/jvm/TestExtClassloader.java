package org.yipeng.jvm;

public class TestExtClassloader {
    //ExtClassloader没有父类加载器，在找不到父类加载器时，委托BootStrap加载器去加载
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.ext.dirs"));
    }
}
