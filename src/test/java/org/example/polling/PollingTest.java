package org.example.polling;

import org.junit.Test;

public class PollingTest {
    @Test
    public void name() throws InterruptedException {
        Boy boy = new Boy(new Girl());

        Thread.sleep(15_000L);
    }
}
