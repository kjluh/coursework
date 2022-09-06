public class Main {
    public static void main(String[] args) {
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

        EmployeeBook personals = new EmployeeBook();
        personals.setAddPersonal(ivan);
        personals.setAddPersonal(ivan1);
        personals.setAddPersonal(ivan2);
        personals.setAddPersonal(ivan3);
        personals.setAddPersonal(ivan4);
        personals.setAddPersonal(ivan5);
        personals.setAddPersonal(ivan6);
        personals.setAddPersonal(ivan7);
        personals.setAddPersonal(ivan8);
        personals.setAddPersonal(ivan9);

        personals.printAllPersonals();
        personals.deletePersonalsFio("Ivan3","Ivanov","Ivanovich");
        personals.deletePersonalsId(3);
        personals.printAllPersonals();
        System.out.println(personals.sumPersonalSalaryFromDepartment(1));
        personals.changePersonalsSalaryWithFioPersonal("Ivan7","Ivanov","Ivanovich",111);
        personals.infoForPersonalWithoutDepartment(5);
        personals.changePersonalsDepartmentWithFioPersonal("Ivan7","Ivanov","Ivanovich",1);
        personals.infoForPersonalWithoutDepartment(1);
        personals.deletePersonalsFio("Ivan9", "Ivanov", "Ivanovich");

        personals.personalWithSalaryLess(3);

    }


}
