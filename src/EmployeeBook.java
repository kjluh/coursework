import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] personals = new Employee[10];

    public void setPersonals(Employee klass) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] == null) {
                personals[i] = klass;
                break;
            }
        }
    }
    public void changePersonalsDepartmentWithFioPersonal(String name, String family, String fatherName, int department) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].getName().equals(name) && personals[i].getFamily().equals(family) && personals[i].getFatherName().equals(fatherName)) {
                personals[i].department = department;
            }

        }
    }

    public void changePersonalsSalaryWithFioPersonal(String name, String family, String fatherName, double thisSalary) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].getName().equals(name) && personals[i].getFamily().equals(family) && personals[i].getFatherName().equals(fatherName)) {
                personals[i].salary = thisSalary;
            }

        }
    }

    public void deletePersonalsFio(String name, String family, String fatherName) {
        for (int i = 0; i < personals.length - 1; i++) {
            if (personals[i] != null && personals[i].getName().equals(name) && personals[i].getFamily().equals(family) && personals[i].getFatherName().equals(fatherName)) {
                for (; i < personals.length - 1; i++) {
                    personals[i] = personals[i + 1];
                }
            }

        }
        personals[personals.length - 1] = null;
    }

    public void deletePersonalsId(int id) {
        for (int i = 0; i < personals.length - 1; i++) {
            if (personals[i] != null && personals[i].getId() == id) {
                for (; i < personals.length - 1; i++) {
                    personals[i] = personals[i + 1];
                }
            }
        }
        personals[personals.length - 1] = null;
    }

    public void printAllPersonals() {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                System.out.println(personals[i].info());
            } else break;

        }
    }

    public void personalWithSalaryMore(double exampleSalary) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                if (personals[i] != null && personals[i].salary >= exampleSalary) {
                    System.out.println("id сотрудника = " + personals[i].getId() + " " + personals[i].name + " " + personals[i].family + " " +
                            personals[i].fatherName + " с зарплатой " + personals[i].salary + " руб");
                }
            }
        }
    }

    public void personalWithSalaryLess(double exampleSalary) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                if (personals[i] != null && personals[i].salary < exampleSalary) {
                    System.out.println("id сотрудника = " + personals[i].getId() + " " + personals[i].name + " " + personals[i].family + " " +
                            personals[i].fatherName + " с зарплатой " + personals[i].salary + " руб");
                }
            }
        }
    }

    public void infoForPersonalWithoutDepartment(int depart) {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == depart) {
                System.out.println(personals[i].name + " " + personals[i].family + " " + personals[i].fatherName + " с зарплатой " + personals[i].salary + " руб");
            }
        }
    }

    public double averageSalaryFromDepartment(int depart) {
        int counterPersonals = 0;
        double sumSalary = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == depart) {
                sumSalary = personals[i].salary + sumSalary;
                counterPersonals++;
            }
        }
        return sumSalary / counterPersonals;
    }

    public void personIndexSalaryFromDepartment(int department, double indexForSalaryApp) {
        double sum = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == department) {
                personals[i].salary = personals[i].salary * indexForSalaryApp + personals[i].salary;
            }
        }
    }

    public double sumPersonalSalaryFromDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == department) {
                sum = sum + personals[i].salary;
            }
        }
        return sum;
    }

    public double personWithMaxSalaryFromDepartment(int department) {
        double maxSalary = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == department) {
                if (maxSalary < personals[i].salary) {
                    maxSalary = personals[i].salary;
                }
            }
        }
        return maxSalary;
    }

    public double personWithMinSalaryFromDepartment(int department) {
        double minSalary = maxValue();
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null && personals[i].department == department) {
                if (minSalary > personals[i].salary) {
                    minSalary = personals[i].salary;
                }
            }
        }
        return minSalary;
    }

    public void indexing(double indexForSalaryApp) {
        for (int i = 0; i < personals.length; i++) {
            personals[i].salary = personals[i].salary * indexForSalaryApp + personals[i].salary;
        }
    }

    public void fIO() {
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                System.out.println(personals[i].name + " " + personals[i].family + " " + personals[i].fatherName);
            }
        }
    }

    public double averageValue() {
        double avarageSalary = sumValue() / personals.length;
        return avarageSalary;
    }

    public double minValue() {
        double minSalary = personals[0].salary;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                if (minSalary > personals[i].salary) {
                    minSalary = personals[i].salary;
                }
            } else break;
        }
        return minSalary;
    }

    public double maxValue() {
        double maxSalary = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                if (maxSalary < personals[i].salary) {
                    maxSalary = personals[i].salary;
                }
            } else break;
        }
        return maxSalary;
    }

    public double sumValue() {
        double sumSalary = 0;
        for (int i = 0; i < personals.length; i++) {
            if (personals[i] != null) {
                sumSalary = sumSalary + personals[i].salary;
            } else break;
        }
        return sumSalary;
    }

}



