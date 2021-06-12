package pp;

import java.util.Set;

public class Course {
private int cid;
private String cname;
private String duration;
private Set<Student> Students;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public Set<Student> getStudents() {
	return Students;
}
public void setStudents(Set<Student> students) {
	Students = students;
}

}
