package com.jolly.pattern.delegate;

/**
 * 描述:
 *
 * @author fd
 * @create 2018-08-17 15:02
 **/
public class Leader {

    private IWorker worker;

    public Leader(IWorker worker){
        this.worker = worker;
    }

    public void doDispatch(){
        worker.doSomeThing();
    }

    public static void main(String[] args) {
        new Leader(new WorkerA()).doDispatch();
        new Leader(new WorkerB()).doDispatch();
    }
}
