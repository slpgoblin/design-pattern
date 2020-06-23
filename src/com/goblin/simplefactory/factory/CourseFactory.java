package com.goblin.simplefactory.factory;

import com.goblin.simplefactory.product.Course;
import com.goblin.simplefactory.product.JavaCourse;
import com.goblin.simplefactory.product.PythonCourse;

/**
 * @program: design-pattern
 * @description: 简单工厂，由于责任太重也称上帝工厂
 * @author: Guojs
 * @create: 2020-06-23 10:12
 **/
public class CourseFactory {

	/**
	 * 简单工厂设计模式
 	 */

	public static Course createCourse(String type) {

		if ("java".equals(type)) {
			return new JavaCourse();
		} else if ("python".equals(type)) {
			return new PythonCourse();
		}  else {
			return null;
		}

	}

	/**
	 * 使用反射获取
	 * 相对来说提高了扩展性
	 * @param clazz
	 * @return
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	public static Course createCourse(Class clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

		return (Course) Class.forName(clazz.getName()).newInstance();

	}

}
