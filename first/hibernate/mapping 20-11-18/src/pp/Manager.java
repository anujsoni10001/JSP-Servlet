package pp;

import java.util.Map;

public class Manager {
private int id;
private String name;
private Map<String,String> emps;
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
public Map<String, String> getEmps() {
	return emps;
}
public void setEmps(Map<String, String> emps) {
	this.emps = emps;
}

}
