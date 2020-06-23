package com.goblin.abstractfactory.factory;

import com.goblin.abstractfactory.product.Document;
import com.goblin.abstractfactory.product.Video;

/**
 * @program: design-pattern
 * @description: 抽象工厂，代表一个产品族
 * @author: Guojs
 * @create: 2020-06-23 19:14
 **/
public abstract class AbstractFactory {

    /**
     * 创建文本课
     * @return
     */
    public abstract Document prodDocument();

    /**
     * 创建视频课
     * @return
     */
    public abstract Video prodVideo();

}
