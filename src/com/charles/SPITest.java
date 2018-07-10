package com.charles;

import com.charles.spi.Fruit;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SPITest {

    public static void main(String[] args) {
        ServiceLoader<Fruit> loader = ServiceLoader.load(Fruit.class);
        Iterator<Fruit> iterator = loader.iterator();
        while (iterator.hasNext()){
            Fruit fruit = iterator.next();
            System.out.println(fruit.getName());
        }
    }
}
