public class Main {
    public static void listOfEmployees(Employee[] archiveOfEmployee) {
        for (Employee employee : archiveOfEmployee) {
            System.out.println(employee);
        }
    }

    public static double spendingOnSalaries(Employee[] archiveOfEmployee) {
        double total = 0;
        for (Employee employee : archiveOfEmployee) {
            total += employee.getSalary();
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

    public static double salaryAverage(Employee[] archiveOfEmployee) {
        return Math.ceil(spendingOnSalaries(archiveOfEmployee) / archiveOfEmployee.length);
    }

    public static void indexSalary(Employee[] archiveOfEmployee) {
        float index = 1.05f;
        for (Employee employee : archiveOfEmployee) {
            employee.setSalary(employee.getSalary() * index);
        }
    }

    public static Employee salaryMinInDepartment(int department, Employee[] archiveOfEmployee) {
        double minSalaryInDepartment = 1_000_000;
        int minSalaryEmployee = 0;
        for (int i = 0; i < archiveOfEmployee.length; i++) {
            if (department == archiveOfEmployee[i].getDepartment()) {
                if (minSalaryInDepartment > archiveOfEmployee[i].getSalary()) {
                    minSalaryInDepartment = archiveOfEmployee[i].getSalary();
                    minSalaryEmployee = i;
                }
            }
        }
        return archiveOfEmployee[minSalaryEmployee];
    }

    public static Employee salaryMaxInDepartment(int department, Employee[] archiveOfEmployee) {
        double maxSalaryInDepartment = 0;
        int maxSalaryEmployee = 0;
        for (int i = 0; i < archiveOfEmployee.length; i++) {
            if (department == archiveOfEmployee[i].getDepartment()) {
                if (maxSalaryInDepartment < archiveOfEmployee[i].getSalary()) {
                    maxSalaryInDepartment = archiveOfEmployee[i].getSalary();
                    maxSalaryEmployee = i;
                }
            }
        }
        return archiveOfEmployee[maxSalaryEmployee];
    }

    public static int spendingOnSalariesInDepartment(int department, Employee[] archiveOfEmployee) {
        int total = 0;
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                total += (int) employee.getSalary();
            }
        }
        return total;
    }

    public static double averageSalaryInDepartment(int department, Employee[] archiveOfEmployee) {
        int peopleInDepartment = 0;
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                peopleInDepartment++;
            }
        }
        return Math.ceil((double) spendingOnSalariesInDepartment(department, archiveOfEmployee) / peopleInDepartment);
    }

    public static void indexSalariesInDepartment(float index, int department, Employee[] archiveOfEmployee) {
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                employee.setSalary(employee.getSalary() * index);
            }
        }
    }

    public static void listOfDepartment(int department, Employee[] archiveOfEmployee) {
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }
    public static void compareSalariesMin(int number, int department, Employee[] archiveOfEmployee) {
        int counter = 0;
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                if (employee.getSalary() < number) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
                    counter++;
                }
            }
        }
        if (counter==0) {
            System.out.println("Таких сотрудников нет");
        }
    }
    public static void compareSalariesMax(int number, int department, Employee[] archiveOfEmployee) {
        int counter = 0;
        for (Employee employee : archiveOfEmployee) {
            if (department == employee.getDepartment()) {
                if (employee.getSalary() > number) {
                    System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
                    counter++;
                }
            }
        }
            if (counter==0) {
                System.out.println("Таких сотрудников нет");
        }
    }
        public static void main (String[]args){
            Employee[] archiveOfEmployee = new Employee[10];
            archiveOfEmployee[0] = new Employee("Кириллов Игорь Викторович  ", 3, 98123);
            archiveOfEmployee[1] = new Employee("Перетёртов Андрей Максимович", 2, 23904);
            archiveOfEmployee[2] = new Employee("Андреев Тимур Викторович", 1, 30498);
            archiveOfEmployee[3] = new Employee("Каленич Андрей Витальевич", 4, 32924);
            archiveOfEmployee[4] = new Employee("Кучерена Екатерина Васильевна", 5, 19419);
            archiveOfEmployee[5] = new Employee("Иванов Иван Иванович", 3, 42164);
            archiveOfEmployee[6] = new Employee("Андеева Юлия Викторовна", 2, 20000);
            archiveOfEmployee[7] = new Employee("Рядно Владислав Александрович", 4, 100233);
            archiveOfEmployee[8] = new Employee("Безверхов Эдуард Тимурович", 5, 42101);
            archiveOfEmployee[9] = new Employee("Ерохин Максим Эдуардович", 1, 67412);
            listOfEmployees(archiveOfEmployee);
            System.out.println(spendingOnSalaries(archiveOfEmployee));
            System.out.println(salaryMin(archiveOfEmployee));
            System.out.println(salaryMax(archiveOfEmployee));
            System.out.println(salaryAverage(archiveOfEmployee));
            for (Employee employee : archiveOfEmployee) {
                System.out.println(employee.getName());
            }
            indexSalary(archiveOfEmployee);
            listOfEmployees(archiveOfEmployee);
            System.out.println(salaryMinInDepartment(5, archiveOfEmployee));
            System.out.println(salaryMaxInDepartment(5, archiveOfEmployee));
            System.out.println(spendingOnSalariesInDepartment(5, archiveOfEmployee));
            System.out.println(averageSalaryInDepartment(5, archiveOfEmployee));
            indexSalariesInDepartment(1.05f, 5, archiveOfEmployee);
            listOfEmployees(archiveOfEmployee);
            listOfDepartment(5, archiveOfEmployee);
            compareSalariesMin(30000,5,archiveOfEmployee);
            compareSalariesMax(30000,5,archiveOfEmployee);
        }
    }

