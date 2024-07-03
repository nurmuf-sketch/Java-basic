public class GeneralEmployee extends Employee {
    public GeneralEmployee(String name, String address, int age, String employeeId, String jobDesc, Placement placement) {
        super(name, address, age, employeeId, jobDesc, placement);
    }

    @Override
    public int getAllowance() {
        return 0;
    }

    @Override
    public int getSalary() {
        return super.getPlacement().getUmk();
    }
}
