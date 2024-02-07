package arm.Tests;

import arm.stacks.LimkedStacks;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class testStacks {
    @Test
    public void inInitSizeIsZero() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        assert stack.size() == 0;
    }

    @Test
    public void InitIsEmptyIsTrue() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        assert stack.isEmpty() == true;
    }

    @Test
    public void onPushing() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        int expectedValue=5;
        Assertions.assertEquals(expectedValue, stack.size());
    }
    @Test
    public void onPopping() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, stack.size());
    }
    @Test
    public void onTop() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, stack.top());
    }
    @Test
    public void onPoping() {
        LimkedStacks<Integer> stack = new LimkedStacks<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        stack.pop();
        int expectedValue=4;
        Assertions.assertEquals(expectedValue, stack.size());
    }


}
