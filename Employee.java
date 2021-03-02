
public class Employee implements EmployeeRules{
        String name;
        int salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee {" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getSalary() { return salary; }
}


