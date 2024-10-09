package com.atguigu;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TicketBooth implements Runnable {
    private static int tickets = 50;

    @Override
    public void run() {
        while (true) {
            synchronized (TicketBooth.class) {
                if (tickets > 0) {
                    System.out.println(Thread.currentThread().getName() + " 售出第 " + (51 - tickets) + " 张票");
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}

public class Threadpool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);//3 is fixed!!!!!
        //ExecutorService 来创建一个固定 3 的线程池，并通过 execute 方法提交了三个售票员任务。

        for (int i = 0; i < 3; i++) {
            executorService.execute(new TicketBooth());//execute method, start the sale action
        }

        executorService.shutdown();
    }
}
