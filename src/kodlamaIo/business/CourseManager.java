package kodlamaIo.business;


import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers ) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	
	public void add(Course course) throws Exception{
		if(course.getPrice()<0) {
			throw new Exception("Fiyat 0 dan küçük olamaz");
		}
		
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
}
