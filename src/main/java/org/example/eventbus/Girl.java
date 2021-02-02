package org.example.eventbus;

import org.greenrobot.eventbus.EventBus;

import java.util.Timer;
import java.util.TimerTask;

public class Girl {

    public final Timer timer;

    public Girl(final EventBus eventBus) {
        timer = new Timer();
        timer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("小美：「我好了。」");
                        eventBus.post(new GirlReadyEvent());
                    }
                },
                5_000L);
    }
}
