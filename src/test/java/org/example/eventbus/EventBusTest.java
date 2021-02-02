package org.example.eventbus;

import org.greenrobot.eventbus.EventBus;
import org.junit.Test;

public class EventBusTest {

    @Test
    public void name() throws InterruptedException {
        EventBus eventBus = new EventBus();
        new Boy(eventBus);

        new Girl(eventBus);

        Thread.sleep(15_000L);
    }
}
