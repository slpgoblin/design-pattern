package com.goblin.abstractfactory.factory;

import com.goblin.abstractfactory.product.Document;
import com.goblin.abstractfactory.product.JavaDocument;
import com.goblin.abstractfactory.product.JavaVideo;
import com.goblin.abstractfactory.product.Video;

/**
 * @program: design-pattern
 * @description: java产品工厂
 * @author: Guojs
 * @create: 2020-06-23 19:16
 **/
public class JavaFactory extends AbstractFactory{

    /**
     * 创建文本课
     *
     * @return
     */
    @Override
    public Document prodDocument() {
        return new JavaDocument();
    }

    /**
     * 创建视频课
     *
     * @return
     */
    @Override
    public Video prodVideo() {
        return new JavaVideo();
    }

}
