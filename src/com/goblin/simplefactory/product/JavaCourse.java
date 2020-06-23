package com.goblin.simplefactory.product;

/**
 * @program: design-pattern
 * @description: java
 * @author: Guojs
 * @create: 2020-06-23 10:24
 **/
public class JavaCourse extends Course{
    /**
     * 生产课程
     */
    @Override
    public void prod() {
        System.out.println("这是java课程。");
    }
}
