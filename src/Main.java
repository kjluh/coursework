public class Main {
    public static void main(String[] args) {
        Employee[] personals = new Employee[10];
        Employee ivan = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 4);
        Employee ivan1 = new Employee("Ivan1", "Ivanov", "Ivanovich", 1, 2);
        Employee ivan2 = new Employee("Ivan2", "Ivanov", "Ivanovich", 2, 3);
        Employee ivan3 = new Employee("Ivan3", "Ivanov", "Ivanovich", 2, 1);
        Employee ivan4 = new Employee("Ivan4", "Ivanov", "Ivanovich", 3, 5);
        Employee ivan5 = new Employee("Ivan5", "Ivanov", "Ivanovich", 3, 6);
        Employee ivan6 = new Employee("Ivan6", "Ivanov", "Ivanovich", 5, 7);
        Employee ivan7 = new Employee("Ivan7", "Ivanov", "Ivanovich", 5, 8);
        Employee ivan8 = new Employee("Ivan8", "Ivanov", "Ivanovich", 4, 9);
        Employee ivan9 = new Employee("Ivan9", "Ivanov", "Ivanovich", 4, 10);

        personals[0] = ivan;
        personals[1] = ivan1;
        personals[2] = ivan2;
        personals[3] = ivan3;
        personals[4] = ivan4;
        personals[5] = ivan5;
        personals[6] = ivan6;
        personals[7] = ivan7;
        personals[8] = ivan8;
        personals[9] = ivan9;

        toString(personals); //а
        System.out.println();
        System.out.println("расходы на зарплату сотрудникам равны " + sumValue(personals)); //b
        System.out.println();
        System.out.println("минимальная зарплата сотрудника = " + minValue(personals)); //c
        System.out.println();
        System.out.println("максимальная зарплата сотрудника = " + maxValue(personals)); //d
        System.out.println();
        System.out.println("Среднее значение зарплат = " + averageValue(personals)); //e
        System.out.println();
        fIO(personals); //f
        System.out.println();
        System.out.println("Повышенная сложность");
        System.out.println();
        System.out.println("зп до индексации " + personals[1].salary);
        indexing(personals, 1.9); //1
        System.out.println("зп после индексации " + personals[1].salary);
        System.out.println();
        System.out.println("Минимальная зарплата сотрудника по отделу 3 = " + personWithMinSalaryFromDepartment(personals, 3)); //2,a
        System.out.println();
        System.out.println("Максимальная зарплата сотрудника по отделу 3 = " + personWithMaxSalaryFromDepartment(personals, 3)); //2,b
        System.out.println();
        System.out.println("Сумма зарплат отделу 3 = " + sumPersonalSalaryFromDepartment(personals, 3)); //2,c
        System.out.println();
        System.out.println("Среднюю зарплату по отделу 3 = " + averageSalaryFromDepartment(personals, 3)); //2,d
        System.out.println();
        personIndexSalaryFromDepartment(personals, 3, 7.1); //2,e
        System.out.println("Сумма зарплат отделу 3 = " + sumPersonalSalaryFromDepartment(personals, 3));
        System.out.println();
        infoForPersonalWithoutDepartment(personals, 3); //2,f
        System.out.println();
        personalWithSalaryLess(personals, 8); //3,a
        System.out.println();
        personalWithSalaryMore(personals, 60); //3,b

    }

    public static void personalWithSalaryMore(Employee[] arr, double exampleSalary) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].salary >= exampleSalary) {
                    System.out.println("id сотрудника = " + arr[i].getId() + " " + arr[i].name + " " + arr[i].family + " " +
                            arr[i].fatherName + " с зарплатой " + arr[i].salary + " руб");
                }
            }
        }
    }

    public static void personalWithSalaryLess(Employee[] arr, double exampleSalary) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].salary < exampleSalary) {
                    System.out.println("id сотрудника = " + arr[i].getId() + " " + arr[i].name + " " + arr[i].family + " " +
                            arr[i].fatherName + " с зарплатой " + arr[i].salary + " руб");
                }
            }
        }
    }

    public static void infoForPersonalWithoutDepartment(Employee[] arr, int depart) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == depart) {
                System.out.println(arr[i].name + " " + arr[i].family + " " + arr[i].fatherName + " с зарплатой " + arr[i].salary + " руб");
            }
        }
    }

    public static double averageSalaryFromDepartment(Employee[] arr, int depart) {
        int counterPersonals = 0;
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == depart) {
                sumSalary = arr[i].salary + sumSalary;
                counterPersonals++;
            }
        }
        return sumSalary / counterPersonals;
    }

    public static void personIndexSalaryFromDepartment(Employee[] arr, int department, double indexForSalaryApp) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == department) {
                arr[i].salary = arr[i].salary * indexForSalaryApp + arr[i].salary;
            }
        }
    }

    public static double sumPersonalSalaryFromDepartment(Employee[] arr, int department) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == department) {
                sum = sum + arr[i].salary;
            }
        }
        return sum;
    }

    public static double personWithMaxSalaryFromDepartment(Employee[] arr, int department) {
        double maxSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == department) {
                if (maxSalary < arr[i].salary) {
                    maxSalary = arr[i].salary;
                }
            }
        }
        return maxSalary;
    }

    public static double personWithMinSalaryFromDepartment(Employee[] arr, int department) {
        double minSalary = maxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].department == department) {
                if (minSalary > arr[i].salary) {
                    minSalary = arr[i].salary;
                }
            }
        }
        return minSalary;
    }

    public static void indexing(Employee[] arr, double indexForSalaryApp) {
        for (int i = 0; i < arr.length; i++) {
            arr[i].salary = arr[i].salary * indexForSalaryApp + arr[i].salary;
        }
    }

    public static void fIO(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].name + " " + arr[i].family + " " + arr[i].fatherName);
            }
        }
    }

    public static double averageValue(Employee[] arr) {
        double avarageSalary = sumValue(arr) / arr.length;
        return avarageSalary;
    }

    public static double minValue(Employee[] arr) {
        double minSalary = arr[0].salary;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (minSalary > arr[i].salary) {
                    minSalary = arr[i].salary;
                }
            } else break;
        }
        return minSalary;
    }

    public static double maxValue(Employee[] arr) {
        double maxSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (maxSalary < arr[i].salary) {
                    maxSalary = arr[i].salary;
                }
            } else break;
        }
        return maxSalary;
    }

    public static double sumValue(Employee[] arr) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sumSalary = sumSalary + arr[i].salary;
            } else break;
        }
        return sumSalary;
    }

    public static void toString(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            } else break;
        }
    }
}
