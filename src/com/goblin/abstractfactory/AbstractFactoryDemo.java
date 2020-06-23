package com.goblin.abstractfactory;

import com.goblin.abstractfactory.factory.AbstractFactory;
import com.goblin.abstractfactory.factory.JavaFactory;
import com.goblin.abstractfactory.product.Document;
import com.goblin.abstractfactory.product.Video;

/**
 * @program: design-pattern
 * @description:
 * @author: Guojs
 * @create: 2020-06-23 19:20
 **/
public class AbstractFactoryDemo {

    public static void main(String[] args) {
        AbstractFactory factory = new JavaFactory();
        Document document = factory.prodDocument();
        document.prodDocument();
        Video video = factory.prodVideo();
        video.prodVideo();
    }

}
