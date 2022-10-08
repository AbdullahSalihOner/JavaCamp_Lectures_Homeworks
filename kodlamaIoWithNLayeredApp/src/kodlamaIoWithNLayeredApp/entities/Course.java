package kodlamaIoWithNLayeredApp.entities;

public class Course {
	private int id;
	private String courseName;
	private String price;
	
	
	public Course() {
		
	}

	public Course(int id, String courseName, String price) {
		this.id = id;
		this.courseName = courseName;
		this.price = price;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
