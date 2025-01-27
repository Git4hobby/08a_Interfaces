package com.cc.java.Birds;

import com.cc.java.Interfaces.Flyable;
import com.cc.java.Interfaces.IFeathers;

public class Bird implements Flyable, IFeathers{

    @Override
    public String fly() {
        return "I can fly at 45mph!";
    }

    @Override
    public String hasFeathers() {
        return "I'm a Bird, I have cleaned nice Feathers!";
    }

}
