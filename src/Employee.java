public class Employee {
    private String name;
    private String family;
    private String fatherName;
    int department;
    double salary;
    private final int id;
    private static int counter;

    Employee(String name, String family, String fatherName, int department, double salary) {
        this.name = name;
        this.family = family;
        this.fatherName = fatherName;
        this.department = department;
        this.salary = salary;
        id = ++counter;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return this.id;
    }

        public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String info() {
        return "Имя " + name + ", Фамилия " + family + ", Отчество " + fatherName + ", Отдел " + department +
                ", зп " + salary + " рублей.";
    }
}
