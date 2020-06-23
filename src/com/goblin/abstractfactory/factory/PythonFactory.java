package com.goblin.abstractfactory.factory;

import com.goblin.abstractfactory.product.Document;
import com.goblin.abstractfactory.product.PythonDocument;
import com.goblin.abstractfactory.product.PythonVideo;
import com.goblin.abstractfactory.product.Video;

/**
 * @program: design-pattern
 * @description: python产品工厂
 * @author: Guojs
 * @create: 2020-06-23 19:19
 **/
public class PythonFactory extends AbstractFactory{

    /**
     * 创建文本课
     *
     * @return
     */
    @Override
    public Document prodDocument() {
        return new PythonDocument();
    }

    /**
     * 创建视频课
     *
     * @return
     */
    @Override
    public Video prodVideo() {
        return new PythonVideo();
    }

}
