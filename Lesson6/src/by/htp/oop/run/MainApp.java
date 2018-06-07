package by.htp.oop.run;

import by.htp.oop.entity.Employee;
import by.htp.oop.entity.Master;
import by.htp.oop.entity.Person;
import by.htp.oop.entity.Student;

public class MainApp {

	public static void main(String[] args) {
		
//		Person p = new Person(); 
		
		Object o = new Student();
		Person p = new Master();
		Student st = new Student();
		
		Employee emp = new Employee();
		
		Person[] pers = new Person[3];
		
		pers[0] = p;
		pers[1] = st;
		pers[2] = emp;
		
		for (Person person : pers) {
//			person.doSmth();
			person.eat();
			
//			if(person.getClass().equals(Student.class)) {
//			if(person instanceof Student) {
//				Student stud = (Student) person;
//				stud.sleep();
//			}
			
			
		}
		// учет видов(не менее 10) городского транспорта гМинска, вывести на экран список,возможность отсортировать по стоимости проезда, по скорости из п.А в п.Б
	}
}
