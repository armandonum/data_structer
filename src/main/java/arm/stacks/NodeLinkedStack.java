package arm.stacks;

public class NodeLinkedStack <T>{
T data;
NodeLinkedStack<T> next;
public NodeLinkedStack(T data) {
    this.data=data;
    this.next=null;
}
}
