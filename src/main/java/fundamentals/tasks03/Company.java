package fundamentals.tasks03;

import java.util.Arrays;

public class Company {
    final private String name;
    private Employee[] employees = new Employee[5];

    Company(String name) {
        this.name = name;
    }

    void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    float getAverageAge() {
        float sum = 0.0F;
        for (Employee employee : this.employees) {
            sum += employee.getAge();
        }
        return sum / this.employees.length;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
