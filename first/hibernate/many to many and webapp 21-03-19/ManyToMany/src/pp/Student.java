package pp;

import java.util.Set;

public class Student {
private int sid;
private String sname;
private Set<Course> courses;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public Set<Course> getCourses() {
	return courses;
}
public void setCourses(Set<Course> courses) {
	this.courses = courses;
}

}
