import java.util.Objects;

public class Employee {
    private final String name;
    private int department;
    private double salary;
    private final int id;
    private static int counter;

    public Employee(String name, int department, double salary) {
        this.name = name;
        this.department = department;
        if (department > 5 || department <= 0) {
            throw new ArrayIndexOutOfBoundsException("Такого отдела не существует");
        }
        this.salary = salary;
        this.id =counter++;
    }
    public String getName() {
        return this.name;
    }
    public int getDepartment() {
        return department;
    }
        public double getSalary () {
            return salary;
        }
        public void setDepartment ( int department){
            this.department = department;
        }
        public void setSalary ( double salary){
            this.salary = salary;
        }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + department + " отдел"  + " " + salary + " руб";
    }
    @Override
        public boolean equals (Object other){
            if (this.getClass() != other.getClass()) {
                return false;
            }
            Employee e1 = (Employee) other;
            return name.equals(e1.name);
        }
    @Override
        public int hashCode () {
            return Objects.hash(name);
        }
}