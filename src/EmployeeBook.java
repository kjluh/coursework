public class EmployeeBook {
    private final Employee[] addPersonal = new Employee[10];

    public void setAddPersonal(Employee objectPerson) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] == null) {
                addPersonal[i] = objectPerson;
                break;
            }
        }
    }

    public void changePersonalsDepartmentWithFioPersonal(String name, String family, String fatherName, int department) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getName().equals(name) && addPersonal[i].getFamily().equals(family) && addPersonal[i].getFatherName().equals(fatherName)) {
                addPersonal[i].setDepartment(department);
            }

        }
    }

    public void changePersonalsSalaryWithFioPersonal(String name, String family, String fatherName, double thisSalary) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getName().equals(name) && addPersonal[i].getFamily().equals(family) && addPersonal[i].getFatherName().equals(fatherName)) {
                addPersonal[i].setSalary(thisSalary);
            }

        }
    }

    public void deletePersonalsFio(String name, String family, String fatherName) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getName().equals(name) && addPersonal[i].getFamily().equals(family) && addPersonal[i].getFatherName().equals(fatherName)) {
                for (; i < addPersonal.length - 1; i++) {
                    addPersonal[i] = addPersonal[i + 1];
                } addPersonal[addPersonal.length - 1] = null;
            }
        }
    }

    public void deletePersonalsId(int id) {

            for (int i = 0; i < addPersonal.length; i++) {
                if (addPersonal[i] != null && addPersonal[i].getId() == id) {
                    for (; i < addPersonal.length - 1; i++) {
                        addPersonal[i] = addPersonal[i + 1];
                    } addPersonal[addPersonal.length - 1] = null;
                }
            }
    }

    public void printAllPersonals() {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null) {
                System.out.println(addPersonal[i].info());
            } else {
                break;
            }
        }
    }

    public void personalWithSalaryMore(double exampleSalary) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getSalary() >= exampleSalary) {
                System.out.println("id сотрудника = " + addPersonal[i].getId() + " " + addPersonal[i].getName() + " " + addPersonal[i].getFamily() + " " +
                        addPersonal[i].getFatherName() + " с зарплатой " + addPersonal[i].getSalary() + " руб");
            }
        }
    }

    public void personalWithSalaryLess(double exampleSalary) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getSalary() < exampleSalary) {
                System.out.println("id сотрудника = " + addPersonal[i].getId() + " " + addPersonal[i].getName() + " " + addPersonal[i].getFamily() + " " +
                        addPersonal[i].getFatherName() + " с зарплатой " + addPersonal[i].getSalary() + " руб");
            }
        }
    }

    public void infoForPersonalWithoutDepartment(int depart) {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == depart) {
                System.out.println(addPersonal[i].getName() + " " + addPersonal[i].getFamily() + " " + addPersonal[i].getFatherName() + " с зарплатой " + addPersonal[i].getSalary() + " руб");
            }
        }
    }

    public double averageSalaryFromDepartment(int depart) {
        int counterPersonals = 0;
        double sumSalary = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == depart) {
                sumSalary = addPersonal[i].getSalary() + sumSalary;
                counterPersonals++;
            }
        }
        return sumSalary / counterPersonals;
    }

    public void personIndexSalaryFromDepartment(int department, double indexForSalaryApp) {
        double sum = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == department) {
                addPersonal[i].setSalary(addPersonal[i].getSalary() * indexForSalaryApp + addPersonal[i].getSalary());
            }
        }
    }

    public double sumPersonalSalaryFromDepartment(int department) {
        double sum = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == department) {
                sum = sum + addPersonal[i].getSalary();
            }
        }
        return sum;
    }

    public double personWithMaxSalaryFromDepartment(int department) {
        double maxSalary = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == department) {
                if (maxSalary < addPersonal[i].getSalary()) {
                    maxSalary = addPersonal[i].getSalary();
                }
            }
        }
        return maxSalary;
    }

    public double personWithMinSalaryFromDepartment(int department) {
        double minSalary = maxValue();
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null && addPersonal[i].getDepartment() == department) {
                if (minSalary > addPersonal[i].getSalary()) {
                    minSalary = addPersonal[i].getSalary();
                }
            }
        }
        return minSalary;
    }

    public void indexing(double indexForSalaryApp) {
        for (int i = 0; i < addPersonal.length; i++) {
            addPersonal[i].setSalary(addPersonal[i].getSalary() * indexForSalaryApp + addPersonal[i].getSalary());
        }
    }

    public void fIO() {
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null) {
                System.out.println(addPersonal[i].getName() + " " + addPersonal[i].getFamily() + " " + addPersonal[i].getFatherName());
            }
        }
    }

    public double averageValue() {
        double avarageSalary = sumValue() / addPersonal.length;
        return avarageSalary;
    }

    public double minValue() {
        double minSalary = addPersonal[0].getSalary();
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null) {
                if (minSalary > addPersonal[i].getSalary()) {
                    minSalary = addPersonal[i].getSalary();
                }
            } else {
                break;
            }
        }
        return minSalary;
    }

    public double maxValue() {
        double maxSalary = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null) {
                if (maxSalary < addPersonal[i].getSalary()) {
                    maxSalary = addPersonal[i].getSalary();
                }
            } else {
                break;
            }
        }
        return maxSalary;
    }

    public double sumValue() {
        double sumSalary = 0;
        for (int i = 0; i < addPersonal.length; i++) {
            if (addPersonal[i] != null) {
                sumSalary = sumSalary + addPersonal[i].getSalary();
            } else {
                break;
            }
        }
        return sumSalary;
    }

}



