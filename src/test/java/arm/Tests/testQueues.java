package arm.Tests;

import arm.Person;
import arm.Queues.IQueues;
import arm.Queues.Queues;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class testQueues {

    @Test
    public void inInitQueuesSizeShouldBeZero(){
        System.out.println("TestQueues");
        IQueues<Person> queues=new Queues<Person>();
        Assertions.assertEquals(0,queues.size());
    }

    @Test
    public void onEnQueuesFirstShouldBeTheSame(){
        IQueues<Person> queues=new Queues<Person>();
        var testPerson=new Person("test",1);
        queues.enqueue(testPerson);
        Assertions.assertEquals(testPerson, queues.first());
    }
    @Test
    public void onEnQueuesShouldNOTBeIsEmpty(){
        IQueues<Person> queues=new Queues<Person>();
        queues.enqueue(new Person("test",1));
        Assertions.assertFalse(queues.isEmpty());
    }
    @Test
    public void onDeQueueShouldBeIsEmpty(){
        IQueues<Integer> queues=new Queues<>();
        queues.enqueue(1);
        Assertions.assertEquals(1,queues.size());
        queues.dequeue();
        Assertions.assertEquals(0,queues.size());

    }
}
