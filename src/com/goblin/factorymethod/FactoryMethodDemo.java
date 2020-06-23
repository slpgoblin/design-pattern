package com.goblin.factorymethod;

import com.goblin.factorymethod.factory.DocumentFactory;
import com.goblin.factorymethod.factory.VideoFactory;
import com.goblin.factorymethod.product.Document;
import com.goblin.factorymethod.product.Video;

public class FactoryMethodDemo {

	public static void main(String[] args) {

		Document java1 = DocumentFactory.createDocument("java");
		java1.prodDocument();
		Document python1 = DocumentFactory.createDocument("python");
		python1.prodDocument();
		Video java2 = VideoFactory.createDocument("java");
		java2.prodVideo();
		Video python2 = VideoFactory.createDocument("python");
		python2.prodVideo();

	}
}
