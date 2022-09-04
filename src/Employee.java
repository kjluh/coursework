public class Employee {
    String name;
    String family;
    String fatherName;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя " + name +
                ", Фамилия " + family +
                ", Отчество " + fatherName +
                ", Отдел " + department +
                ", зп " + salary + " рублей.";
    }
}
