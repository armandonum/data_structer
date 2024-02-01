package arm.CircleList;

public interface ICircleList<T> {
    int size();
    boolean isEmpty();
void insert(T data);

void print();
ICircleList<T> clone();
}
