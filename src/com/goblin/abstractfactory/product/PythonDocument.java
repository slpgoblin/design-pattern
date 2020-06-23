package com.goblin.abstractfactory.product;

/**
 * @program: design-pattern
 * @description:
 * @author: Guojs
 * @create: 2020-06-23 11:38
 **/
public class PythonDocument extends Document {
    /**
     * 生产文本课
     */
    @Override
    public void prodDocument() {
        System.out.println("python文本课");
    }
}
