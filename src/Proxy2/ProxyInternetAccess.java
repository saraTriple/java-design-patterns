package src.Proxy2;

public class ProxyInternetAccess implements OfficeInternetAccess{

    private int employeeRank;
    private RealNetAccess realNetAccess;

    public ProxyInternetAccess(int employeeRank) {
        this.employeeRank = employeeRank;
    }
    @Override
    public void grantInternetAccess() {
        // Restrict the access
        if (employeeRank >= 5) {
            realNetAccess = new RealNetAccess(employeeRank);
            realNetAccess.grantInternetAccess();
        } else {
            System.out.println("Internet Access Denied, Job Level < 5 :)");
        }


    }
}
