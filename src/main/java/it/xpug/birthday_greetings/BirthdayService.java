package it.xpug.birthday_greetings;


import java.util.List;



public class BirthdayService {

	private EmployeeRepository employeeRepository;
	private EmailService emailService;


	public void sendGreetings(XDate today) throws Exception {
		List<Employee> employees = employeeRepository.getEmployeesByBirthday(today);
		for(Employee employee : employees){
			Greeting greeting = new Greeting(employee);
			emailService.send(greeting);
		}
	}



	public BirthdayService(EmployeeRepository employeeRepository, EmailService emailService) {
		this.employeeRepository = employeeRepository;
		this.emailService = emailService;
	}
}
