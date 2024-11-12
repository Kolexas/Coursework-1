public class Main {
    public static void listOfEmployee(Employee[] archiveOfEmployee) {
        for (Employee employee : archiveOfEmployee) {
            System.out.println(employee);
        }
    }
    public static double spendingOnSalaries(Employee[] archiveOfEmployee){
        double total = 0;
        for (Employee employee : archiveOfEmployee) {
            total = total + employee.getSalary();
        }
        return total;
    }
    public static double salaryMin(Employee[] archiveOfEmployee) {
        double minSalary = archiveOfEmployee[0].getSalary();
        for (Employee employee : archiveOfEmployee) {
            if (minSalary > employee.getSalary()) {
                minSalary = employee.getSalary();
            }
        }
        return minSalary;
        }
    public static double salaryMax(Employee[] archiveOfEmployee) {
        double maxSalary = archiveOfEmployee[0].getSalary();
        for (Employee employee : archiveOfEmployee) {
            if (maxSalary < employee.getSalary()) {
                maxSalary = employee.getSalary();
            }
        }
        return maxSalary;
    }
    public  static double  salaryAverage(Employee[] archiveOfEmployee) {
        return spendingOnSalaries(archiveOfEmployee)/archiveOfEmployee.length;
    }
    public static void main(String[] args) {
        Employee[] archiveOfEmployee = new Employee[10];
        archiveOfEmployee[0] = new Employee("Кириллов Игорь Викторович  ", 5, 98123);
        archiveOfEmployee[1] = new Employee("Перетёртов Андрей Максимович", 4, 23904);
        archiveOfEmployee[2] = new Employee("Андреев Тимур Викторович", 1, 30498);
        archiveOfEmployee[3] = new Employee("Каленич Андрей Витальевич", 4, 32924);
        archiveOfEmployee[4] = new Employee("Кучерена Екатерина Васильевна", 4, 19419);
        archiveOfEmployee[5] = new Employee("Иванов Иван Иванович", 3, 42164);
        archiveOfEmployee[6] = new Employee("Андеева Юлия Викторовна", 4, 20000);
        archiveOfEmployee[7] = new Employee("Рядно Владислав Александрович", 4, 100233);
        archiveOfEmployee[8] = new Employee("Безверхов Эдуард Тимурович", 4, 42101);
        archiveOfEmployee[9] = new Employee("Ерохин Максим Эдуардович", 4, 67412);
        listOfEmployee(archiveOfEmployee);
        System.out.println(spendingOnSalaries(archiveOfEmployee));
        System.out.println(salaryMin(archiveOfEmployee));
        System.out.println(salaryMax(archiveOfEmployee));
        System.out.println(salaryAverage(archiveOfEmployee));
        for (Employee employee : archiveOfEmployee) {
            System.out.println(employee.getName());
        }
    }
}
