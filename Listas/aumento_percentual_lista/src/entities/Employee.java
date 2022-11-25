package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalay(double percentage) {
        this.salary += ((percentage / 100.00) * this.salary);
    }

    public Integer getId() {
        return id;
    }

    public String toString() {
        return id + ", " + name + ", " + salary;
    }

}
