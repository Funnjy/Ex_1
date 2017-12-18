package com.antonilchenko;

public class Main {

    public static void main(String[] args) {
        CountDown countDown = new CountDown();

        CountDownThread t1 = new CountDownThread(countDown);
        t1.setName("Thread 1");

        CountDownThread t2 = new CountDownThread(countDown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class CountDown {
    private int i;

    public void doCountdown() {
        String color;

        switch (Thread.currentThread().getName()) {
            case "Thread 1":
                color = ThreadsColors.ANSI_RED;
                break;
            case "Thread 2":
                color = ThreadsColors.ANSI_BLUE;
                break;
            default:
                color = ThreadsColors.ANSI_GREEN;
        }

        synchronized (this) {
            for (/*int*/i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i =" + i);
            }
        }
    }
}

class CountDownThread extends Thread {
    private CountDown threadCountdown;

    public CountDownThread(CountDown countDown) {
        threadCountdown = countDown;
    }

    public void run() {
        threadCountdown.doCountdown();
    }
}
