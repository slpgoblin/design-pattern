package com.goblin.factorymethod.product;

/**
 * @program: design-pattern
 * @description:
 * @author: Guojs
 * @create: 2020-06-23 11:37
 **/
public class JavaVideo extends Video{
    /**
     * 生产视频课
     */
    @Override
    public void prodVideo() {
        System.out.println("java视频课");
    }
}
