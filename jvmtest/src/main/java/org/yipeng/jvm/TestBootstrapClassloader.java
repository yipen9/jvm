package org.yipeng.jvm;

import sun.misc.Launcher;

import java.net.URL;

public class TestBootstrapClassloader {
    public static void main(String[] args) {
        //打印bootstrapClassloader的加载路径
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (int i = 0; i < urls.length; i++) {
            System.out.println(urls[i].toExternalForm());
        }
    }
}
