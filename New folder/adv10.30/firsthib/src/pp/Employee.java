package pp;

public class Employee {
private int id;
private String name;
private String job;
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
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", job=" + job + "]";
}

}
