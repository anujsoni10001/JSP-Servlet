package pp;

public class Appointment {
private int AppointmentId;
private String DoctorId;
private String HospitalId;
private String Date;
private String Status;
private int BookedbyAccountId;
private String HospitalName;
private String DoctorName;
private double ChargesRM;
public double getChargesRM() {
	return ChargesRM;
}
public void setChargesRM(double chargesRM) {
	ChargesRM = chargesRM;
}
public String getDoctorName() {
	return DoctorName;
}
public void setDoctorName(String doctorName) {
	DoctorName = doctorName;
}
public String getHospitalName() {
	return HospitalName;
}
public void setHospitalName(String hospitalName) {
	HospitalName = hospitalName;
}
public int getBookedbyAccountId() {
	return BookedbyAccountId;
}
public void setBookedbyAccountId(int bookedbyAccountId) {
	BookedbyAccountId = bookedbyAccountId;
}

public int getAppointmentId() {
	return AppointmentId;
}
public void setAppointmentId(int appointmentId) {
	AppointmentId = appointmentId;
}
public String getDoctorId() {
	return DoctorId;
}
public void setDoctorId(String doctorId) {
	DoctorId = doctorId;
}
public String getHospitalId() {
	return HospitalId;
}
public void setHospitalId(String hospitalId) {
	HospitalId = hospitalId;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
}
