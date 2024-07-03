public class ProjectLeader extends Employee {
    private int totalProject;

    public ProjectLeader(String name, String address, int age, String employeeId, String jobDesc, Placement placement,
                         int totalProject) {
        super(name, address, age, employeeId, jobDesc, placement);
        this.totalProject = totalProject;
    }

    public int getTotalProject() {
        return totalProject;
    }

    public void setTotalProject(int totalProject) {
        this.totalProject = totalProject;
    }

    @Override
    public int getAllowance() {
        double allowancePercentage;
        if (totalProject >= 2) {
            allowancePercentage = 0.15;
        } else {
            allowancePercentage = 0.05;
        }
        return (int) (getSalary() * allowancePercentage);
    }

    @Override
    public int getSalary() {
        double salary = super.getPlacement().getUmk() * 2.0;
        return (int) salary;
    }
}
