package oops.hashequals;

import java.util.Objects;

public final class Employee {

    private final Integer employeeId;
    private final String employeeName;
    private final String designation;

    public Employee(final Integer employeeId,
                    final String employeeName,
                    final String designation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.designation = designation;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) return true;

        if (obj != null && obj.getClass() == getClass()) {
            Employee emp = (Employee) obj;

            if (Objects.equals(emp.employeeId, employeeId) &&
                    Objects.equals(emp.employeeName, employeeName) &&
                    Objects.equals(emp.designation, designation)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public final int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + (employeeId != null ? employeeId.hashCode() : 0);
        result = prime * result + (employeeName != null ? employeeName.hashCode() : 0);
        result = prime * result + (designation != null ? designation.hashCode() : 0);
        return result;
    }

}
