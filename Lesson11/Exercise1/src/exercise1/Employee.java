/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Objects;

/**
 *
 * @author Spyros
 */
public class Employee {

    protected long employeeId;
    protected String firstName;
    protected String lastName;

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Employee)) {
            return false;
        }

        Employee other = (Employee) o;
        return this.employeeId == other.employeeId;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o == null) {
//            return false;
//        }
//        if (!(o instanceof Employee)) {
//            return false;
//        }
//
//        Employee other = (Employee) o;
//        if (this.employeeId != other.employeeId) {
//            return false;
//        }
//        if (!this.firstName.equals(other.firstName)) {
//            return false;
//        }
//        if (!this.lastName.equals(other.lastName)) {
//            return false;
//        }
//
//        return true;
//    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + (int) (this.employeeId ^ (this.employeeId >>> 32));
        hash = 61 * hash + Objects.hashCode(this.firstName);
        hash = 61 * hash + Objects.hashCode(this.lastName);
        return hash;
    }
}
