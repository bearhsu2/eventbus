package org.example.callback;

import org.junit.Test;

public class CallbackTest {

    @Test
    public void name() throws InterruptedException {
        Boy boy = new Boy();

        new Girl(boy);

        Thread.sleep(15_000l);
    }
}
