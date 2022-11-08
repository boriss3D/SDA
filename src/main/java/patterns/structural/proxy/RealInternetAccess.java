package patterns.structural.proxy;

public class RealInternetAccess implements OfficeInternetAccess {

    private String employeeName;

    RealInternetAccess(String empName) {
        this.employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+
                employeeName);
    }

}  
