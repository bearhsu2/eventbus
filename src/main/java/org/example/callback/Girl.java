package org.example.callback;

import java.util.Timer;
import java.util.TimerTask;

public class Girl {

    public final Timer timer;
    private Boy boy;

    public Girl(final Boy boy) {

        this.boy = boy;

        timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("小美：「我好了。」");
                        boy.callBack();
                    }
                },
                5_000L);
    }
}
