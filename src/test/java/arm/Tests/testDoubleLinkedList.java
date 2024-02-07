package arm.Tests;

import arm.linkedList.DoubleLinkedList;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class testDoubleLinkedList {

    @Test
    public void inInitSizeIsZero() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        Assertions.assertEquals(0, DoubleList.size());
    }

    @Test
    public void InitIsEmptyIsFalse() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        Assertions.assertFalse(DoubleList.isEmpty());
    }

    @Test
    public void onInsertingLast() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addLast(i);
        }
        int expectedValue = 5;
        int actualValue = DoubleList.size();
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    public void onInsertingFirst() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addFirst(i);
        }
        int expectedValue = 5;
        Assertions.assertEquals(expectedValue, DoubleList.size());
    }

    @Test
    public void onRemoveFirst() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addLast(i);
        }
        DoubleList.removeFirst();
        int expectedValue = 4;
        Assertions.assertEquals(expectedValue, DoubleList.size());
    }

    @Test
    public void onRemoveLast() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addLast(i);
        }
        DoubleList.removeLast();
        int expectedValue = 4;
        Assertions.assertEquals(expectedValue, DoubleList.size());
    }
    @Test
    public void onFirst() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addLast(i);
        }
        int expectedValue = 0;
        int actualValue = DoubleList.first().data;
        Assertions.assertEquals(expectedValue, actualValue);
    }
    @Test
    public void onLast() {
        DoubleLinkedList<Integer> DoubleList = new DoubleLinkedList<>();

        for (int i = 0; i < 5; i++) {
            DoubleList.addLast(i);
        }
        int expectedValue = 4;
        int actualValue = DoubleList.last().data;
        Assertions.assertEquals(expectedValue, actualValue);
    }

}
