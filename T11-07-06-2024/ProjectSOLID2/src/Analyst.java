public class Analyst extends Employee {
    public Analyst(String name, String address, int age, String employeeId, String jobDesc, Placement placement) {
        super(name, address, age, employeeId, jobDesc, placement);
    }

    @Override
    public int getAllowance() {
        double allowancePercentage = 0.05;
        return (int) (getSalary() * allowancePercentage);
    }

    @Override
    public int getSalary() {
        double salary = super.getPlacement().getUmk() * 1.6;
        return (int) salary;
    }
}
