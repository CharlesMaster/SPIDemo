package com.charles.impl;

import com.charles.spi.Fruit;

public class Apple implements Fruit {
    @Override
    public String getName() {
        return "My Name Is Apple";
    }
}
