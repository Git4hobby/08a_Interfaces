package com.cc.java.bees;

public class Worker extends HoneyBee{

    @Override
    public String doYourJob() {
        return "I'm a Worker bee, I work all Day!";
    }

    @Override
    public String fly() {
        return "I can fly at 30mph!";
    }

}
