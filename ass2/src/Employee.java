import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String name;
    int salary;

    private List<Observer> observers = new ArrayList<Observer>();

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.sendMessage();
        }
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
}
