package org.example.polling;

public class Girl {
    private int target;

    public boolean isReady() {
        target++;

        if (target < 5) {
            System.out.println("小美：「還沒。」");
            return false;
        } else {
            System.out.println("小美：「好了。」");
            return true;
        }
    }
}
