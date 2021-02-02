package org.example.eventbus;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

public class Boy {

    private EventBus eventBus;

    public Boy(EventBus eventBus) {
        this.eventBus = eventBus;
        this.eventBus.register(this);
    }

    @Subscribe
    public void onGirlReady(GirlReadyEvent event) {
        System.out.println("小明：「我出門了。」");
    }
}
