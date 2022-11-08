package patterns.structural.composite;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee manager = new Employee("manager","Software",
                100);
        System.out.println("manager without developer"+manager);

        Employee developer1 = new Employee("Developer1", "Software"
                ,80);
        manager.add(developer1);


        System.out.println("manager with 1 developer"+manager);

        Employee developer2 = new Employee("developer2","Software"
                ,80);
        manager.add(developer2);

        System.out.println("manager with 2 developers"+manager);
        System.out.println(manager);


        Employee employee1 = new Employee("Accuntant1","Acc",23);
        developer2.add(employee1);

        Employee employee2 = new Employee("Accuntant1","Acc",23);
        developer2.add(employee2);

        System.out.println("developer 2 with 2 employees: "+developer2);
    }
}
