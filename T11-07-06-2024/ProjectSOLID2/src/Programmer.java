public class Programmer extends Employee {
    private String programmingLanguage;
    private int experiences;

    public Programmer(String name, String address, int age, String employeeId, String jobDesc, Placement placement,
                      String programmingLanguage, int experiences) {
        super(name, address, age, employeeId, jobDesc, placement);
        this.programmingLanguage = programmingLanguage;
        this.experiences = experiences;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public int getExperiences() {
        return experiences;
    }

    public void setExperiences(int experiences) {
        this.experiences = experiences;
    }

    @Override
    public int getAllowance() {
        double allowancePercentage;
        if (experiences > 4) {
            allowancePercentage = 0.2;
        } else {
            allowancePercentage = 0.1;
        }
        return (int) (getSalary() * allowancePercentage);
    }

    @Override
    public int getSalary() {
        double salary = super.getPlacement().getUmk() * 1.5;
        return (int) salary;
    }
}
