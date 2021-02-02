package org.example.eventbus;

import org.greenrobot.eventbus.EventBus;
import org.junit.Test;

public class EventBusTest {

    @Test
    public void name() throws InterruptedException {
        EventBus eventBus = new EventBus();
        Boy boy = new Boy();
        eventBus.register(boy);

        new Girl(eventBus);

        Thread.sleep(15_000L);
    }
}
