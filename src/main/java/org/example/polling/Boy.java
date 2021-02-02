package org.example.polling;

import java.util.Timer;
import java.util.TimerTask;

public class Boy {

    private final Timer timer;
    private Girl girl;

    public Boy(final Girl girl) {
        this.girl = girl;
        timer = new Timer();
        timer.scheduleAtFixedRate(
                new TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("小明：「好了嗎？」");

                        if (girl.isReady()) {
                            timer.cancel();
                            System.out.println("小明：「我出門了。」");
                        }
                    }
                },
                1_000L,
                1_000L);
    }
}
