package arm.stacks;
import arm.Person;
import arm.interfaces.IRunner;


public class ArrayStackRunner implements IRunner{
    @Override
    public void run() {
        ArrayStacks<Person> stack = new ArrayStacks<Person>();
        stack.print();
        stack.push(new Person("A", 10));
        stack.push(new Person("B", 20));
        stack.push(new Person("C", 30));
        stack.print();
        System.out.println("1.-------");
        var person=stack.pop();
        //System.out.println("Pop: \n"+stack.pop());

        stack.print();
        System.out.println("2.-------");
        person=stack.top();
        //System.out.println("top: \n"+stack.top());
        stack.print();
        System.out.println("3.-------");
        person=stack.pop();
        //System.out.println("Pop: \n"+stack.pop());
        stack.print();
    }

    @Override
    public void printMenu() {

    }
}
