
/* This class represents a Company composed of Departments */
import java.util.ArrayList;

class Company {
    ArrayList<Department> departments = new ArrayList<>();

    void addDepartment(String name) {
        departments.add(new Department(name)); // creates department
    }
}
