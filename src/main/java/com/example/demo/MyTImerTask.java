package com.example.demo;

import java.util.TimerTask;

public class MyTImerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("I am pure java scheduler");
    }
}
