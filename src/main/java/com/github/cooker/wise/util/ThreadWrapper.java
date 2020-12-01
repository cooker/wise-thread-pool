package com.github.cooker.wise.util;

/**
 * @author kqyu
 * 27/11/2020 3:33 下午
 * 描述：
 */
class ThreadWrapper extends Thread{

    Runnable r;

    private ThreadWrapper(Runnable run) {
        r = run;
    }

    protected static Thread wrap(Runnable run){
        return new ThreadWrapper(run);
    }

    @Override
    public void run() {
        r.run();
    }
}
