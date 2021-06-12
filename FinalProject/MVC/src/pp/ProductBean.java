//In MVC Make Bean Class and RegisteredDao Class in different but in same pacakage//
//Bean Class of MVC//
package pp;

public class ProductBean {
private String name;
private String id;
private String cat;
private String cmp;
private String price;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getCat() {
	return cat;
}
public void setCat(String cat) {
	this.cat = cat;
}
public String getCmp() {
	return cmp;
}
public void setCmp(String cmp) {
	this.cmp = cmp;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
}
