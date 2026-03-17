package com.cmlbay.javaadvancedlab.equality;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class description here.
 *
 * @author cmlba
 * @version 1.0
 * @since 2026-03-13
 */
public class EmployeeEqualityTest {

    @Test
    void equals_shouldReturnTrue_forLogicallySameEmployees() {
        Employee first = new Employee(1L,"cml@example.com");
        Employee second = new Employee(1L,"cml@example.com");

        assertEquals(first,second);
        assertEquals(first.hashCode(),second.hashCode());
    }

    @Test
    void hashSet_shouldTreatEqualEmployeesAsSingleElement_whenHashCodeIsImplemented(){
        Employee first = new Employee(1L,"cml@example.com");
        Employee second = new Employee(1L,"cml@example.com");

        Set<Employee> employees = new HashSet<>();
        employees.add(first);
        employees.add(second);

        assertEquals(1,employees.size());
    }

    @Test
    void hashSet_mayBehaveIncorrectly_whenEqualsExistsButHashCodeDoesNot(){
        BrokenEmployee first = new BrokenEmployee(1L,"cml@example.com");
        BrokenEmployee second = new BrokenEmployee(1L,"cml@example.com");

        Set<BrokenEmployee> employees = new HashSet<>();
        employees.add(first);
        employees.add(second);

        assertEquals(2,employees.size());
    }
}
