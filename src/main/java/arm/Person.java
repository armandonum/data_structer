package arm;

public class Person {
    private final String name;
    private final int age;

    public Person(){
        this.name="";
        this.age=0;    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString(){
        return "Name: "+name+" Age: "+age;
    }
  public void print(){System.out.println("Name: "+name+" Age: "+age);}
}
