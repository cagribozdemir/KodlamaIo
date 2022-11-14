package kodlamaIo.entities;

public class Course {
	private int id;
	private String name;
	private String instructor;
	private String category;
	private double price;
	
	public Course() {
		
	}

	public Course(int id, String name, String instructor, String category, double price) {
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.category = category;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
