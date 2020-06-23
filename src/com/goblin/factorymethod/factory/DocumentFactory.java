package com.goblin.factorymethod.factory;

import com.goblin.factorymethod.product.Document;
import com.goblin.factorymethod.product.JavaDocument;
import com.goblin.factorymethod.product.PythonDocument;

/**
 * @program: design-pattern
 * @description: 文本课工厂
 * @author: Guojs
 * @create: 2020-06-23 12:08
 **/
public class DocumentFactory {

    public static Document createDocument(String type){
        if ("java".equals(type)) {
            return new JavaDocument();
        } else if ("python".equals(type)) {
            return new PythonDocument();
        }  else {
            return null;
        }
    }

}
