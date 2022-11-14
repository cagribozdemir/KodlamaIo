package kodlamaIo;

import kodlamaIo.business.CourseManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.entities.Course;


public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Java ile yazılım geliştirme ", "Engin Demiroğ", "Java", 50);

		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);
		courseManager.add(course1);
	}

}
