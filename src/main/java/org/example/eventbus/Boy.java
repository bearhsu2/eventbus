package org.example.eventbus;

import org.greenrobot.eventbus.Subscribe;

public class Boy {

    public Boy() {}

    @Subscribe
    public void onGirlReady(GirlReadyEvent event) {
        System.out.println("小明：「我出門了。」");
    }
}
