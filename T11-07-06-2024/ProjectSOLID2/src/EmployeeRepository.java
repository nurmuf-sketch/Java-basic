import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeRepository {
    private List<Employee> employees;
    private Map<String, Placement> placements;

    public EmployeeRepository() {
        this.employees = new ArrayList<>();
        this.placements = new HashMap<>();
        initializePlacements();
        initializeEmployees();
    }

    private void initializePlacements() {
        placements.put("Garut", new Placement("Garut", 1961085));
        placements.put("Bandung", new Placement("Bandung", 3742276));
        placements.put("Jakarta", new Placement("Jakarta", 4453935));
        placements.put("Bekasi", new Placement("Bekasi", 4782935));
        placements.put("Bogor", new Placement("Bogor", 4330249));
    }

    private void initializeEmployees() {
        employees.add(new GeneralEmployee("Susi", "Bandung", 27, generateUniqueId("Emp"), "Admin", getPlacementByCity("Jakarta")));
        employees.add(new GeneralEmployee("Anto", "Bandung", 35, generateUniqueId("Emp"), "Office Boy", getPlacementByCity("Bandung")));
        employees.add(new GeneralEmployee("Riman", "Jakarta", 28, generateUniqueId("Emp"), "Human Resource Dev", getPlacementByCity("Bandung")));

        employees.add(new Programmer("Budi", "Bandung", 25, generateUniqueId("Prog"), "Back End Dev", getPlacementByCity("Jakarta"), "Java", 2));
        employees.add(new Programmer("Ani", "Bandung", 30, generateUniqueId("Prog"), "Front End Dev", getPlacementByCity("Bandung"), "React Js", 6));
        employees.add(new Programmer("Ujang", "Jakarta", 28, generateUniqueId("Prog"), "Full Stack Dev", getPlacementByCity("Bandung"), "Kotlin", 4));

        employees.add(new ProjectLeader("Ahmad", "Bandung", 25, generateUniqueId("PL"), "Project Leader", getPlacementByCity("Garut"), 3));
        employees.add(new ProjectLeader("Dani", "Bandung", 30, generateUniqueId("PL"), "Scrum Master", getPlacementByCity("Bekasi"), 1));
        employees.add(new ProjectLeader("Cecep", "Jakarta", 28, generateUniqueId("PL"), "Project Leader", getPlacementByCity("Bogor"), 2));

        employees.add(new Analyst("Indah", "Garut", 25, generateUniqueId("AL"), "Analyst", getPlacementByCity("Jakarta")));
        employees.add(new Analyst("Puspa", "Bandung", 30, generateUniqueId("AL"), "Analyst", getPlacementByCity("Bekasi")));
        employees.add(new Analyst("Sari", "Jakarta", 28, generateUniqueId("AL"), "Analyst", getPlacementByCity("Bogor")));
    }

        public void addEmployee(Employee employee) {
            String uniqueId;
            if (employee instanceof Programmer) {
                uniqueId = generateUniqueId("Prog");
            } else if (employee instanceof ProjectLeader) {
                uniqueId = generateUniqueId("PL");
            } else if (employee instanceof Analyst) {
                uniqueId = generateUniqueId("AL");
            } else {
                uniqueId = generateUniqueId("Emp");
            }
            employee.setEmployeeId(uniqueId);
            employees.add(employee);
        }
    
        public void deleteEmployee(String employeeId) {
            employees.removeIf(employee -> employee.getEmployeeId().equals(employeeId));
        }
    
        public Employee getEmployeeById(String employeeId) {
            for (Employee employee : employees) {
                if (employee.getEmployeeId().equals(employeeId)) {
                    return employee;
                }
            }
            return null;
        }
    
        public List<Employee> getAllEmployees() {
            return employees;
        }
    
        public List<Employee> getEmployeesByPlacement(String cityName) {
            List<Employee> filteredEmployees = new ArrayList<>();
            for (Employee employee : employees) {
                if (employee.getPlacement().getCityName().equalsIgnoreCase(cityName)) {
                    filteredEmployees.add(employee);
                }
            }
            return filteredEmployees;
        }
    
        public Placement getPlacementByCity(String cityName) {
            return placements.get(cityName);
        }
    
        private String generateUniqueId(String prefix) {
            int prefixCount = 0;
            for (Employee emp : employees) {
                if (emp.getEmployeeId().startsWith(prefix)) {
                    prefixCount++;
                }
            }
            return prefix + "-" + String.format("%03d", prefixCount + 1);
        }
}
    
