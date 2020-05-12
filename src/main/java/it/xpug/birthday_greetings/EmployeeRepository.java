package it.xpug.birthday_greetings;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getEmployeesByBirthday(XDate today) throws Exception;
}