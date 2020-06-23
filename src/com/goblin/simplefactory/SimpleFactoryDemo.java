package com.goblin.simplefactory;

import com.goblin.simplefactory.factory.CourseFactory;
import com.goblin.simplefactory.factory.CourseStaticFactory;
import com.goblin.simplefactory.product.Course;
import com.goblin.simplefactory.product.JavaCourse;
import com.goblin.simplefactory.product.PythonCourse;

public class SimpleFactoryDemo {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
		// 获取java课程
		Course java1 = CourseFactory.createCourse("java");
		java1.prod();
		Course java2 = CourseFactory.createCourse(JavaCourse.class);
		java2.prod();
		Course java3 = CourseStaticFactory.createJava();
		java3.prod();

		// 获取python课程
		Course python1 = CourseFactory.createCourse("python");
		python1.prod();
		Course python2 = CourseFactory.createCourse(PythonCourse.class);
		python2.prod();
		Course python3 = CourseStaticFactory.createPython();
		python3.prod();
	}

}
