package arm.Tests;

import arm.Person;
import arm.linkedList.ILinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import arm.linkedList.LinkedList;


public class testLinkedList {
    ILinkedList<Integer> list = new LinkedList<>();

    @Test
    public void inInitSizeIsZero() {
        Assertions.assertEquals(0, list.size());
    }

    @Test
    public void InitIsEmptyIsTrue() {
        Assertions.assertEquals(true, list.isEmpty());
    }

    @Test
    public void onInsertingLast() {

        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        int expectedValue = 5;
        int actualValue = list.size();
        Assertions.assertEquals(expectedValue, actualValue);

    }

    @Test
    public void onInsertingFirst() {
        for (int i = 0; i < 5; i++) {
            list.addFirst(i);
        }
        Assertions.assertEquals(5, list.size());
    }

    @Test
    public void onRemoveFirst() {
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        list.removeFirst();
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, list.size());

    }
    @Test
    public void onRemoveLast() {
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        list.removeLast();
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, list.size());

    }

    @Test
    public void onFirst() {
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        int expectedValue=0;
        Assertions.assertEquals(expectedValue, list.first().data);

    }
    @Test
    public void onLast() {
        for (int i = 0; i < 5; i++) {
            list.addLast(i);
        }
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, list.last().data);

    }
}


