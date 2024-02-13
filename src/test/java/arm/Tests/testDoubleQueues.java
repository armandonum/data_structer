package arm.Tests;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import arm.Queues.linkedLits_DobleQueues;

public class testDoubleQueues {
    @Test
 public void sizeIsZero(){
        linkedLits_DobleQueues<Integer> dobleQueues = new linkedLits_DobleQueues<>();
        Assertions.assertEquals(0, dobleQueues.size());
    }

}
