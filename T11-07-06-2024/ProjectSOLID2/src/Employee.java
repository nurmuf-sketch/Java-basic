public abstract class Employee {
    private String name;
    private String address;
    private int age;
    private String employeeId;
    private String jobDesc;
    private Placement placement;

    public Employee(String name, String address, int age, String employeeId, String jobDesc, Placement placement) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.employeeId = employeeId;
        this.jobDesc = jobDesc;
        this.placement = placement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    public Placement getPlacement() {
        return placement;
    }

    public void updatePlacement(Placement placement) {
        this.placement = placement;
    }

    public abstract int getAllowance();

    public abstract int getSalary();
}
