package com.goblin.factorymethod.factory;

import com.goblin.factorymethod.product.*;

/**
 * @program: design-pattern
 * @description: 视频课工厂
 * @author: Guojs
 * @create: 2020-06-23 12:08
 **/
public class VideoFactory {

    public static Video createDocument(String type){
        if ("java".equals(type)) {
            return new JavaVideo();
        } else if ("python".equals(type)) {
            return new PythonVideo();
        }  else {
            return null;
        }
    }

}
