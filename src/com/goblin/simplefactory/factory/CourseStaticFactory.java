package com.goblin.simplefactory.factory;

import com.goblin.simplefactory.product.Course;
import com.goblin.simplefactory.product.JavaCourse;
import com.goblin.simplefactory.product.PythonCourse;

/**
 * @program: design-pattern
 * @description: 静态工厂
 * @author: Guojs
 * @create: 2020-06-23 10:12
 **/
public class CourseStaticFactory {

	public static Course createJava(){
		return new JavaCourse();
	}
	
	public static Course createPython(){
		return new PythonCourse();
	}
}
