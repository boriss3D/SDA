package fundamentals.tasks03;

public class CompanyTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("firstNam1", "lastName1", 25);
        Employee employee2 = new Employee("firstNam2", "lastName2", 35);
        Employee employee3 = new Employee("firstNam3", "lastName3", 45);
        Employee employee4 = new Employee("firstNam4", "lastName4", 55);
        Employee employee5 = new Employee("firstNam5", "lastName5", 65);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
        Company company = new Company("SDA");
        company.setEmployees(employees);

        System.out.println(company);
        System.out.println(company.getAverageAge());
    }
}
