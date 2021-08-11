import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment {
	
	private String customerName;
	private LocalDate appointmentDate;
	private LocalTime appointmentTime;
	private String designerName;
	private String address;

	public Appointment(String customerName, LocalDate appointmentDate, LocalTime timeNow, String designerName,
			String address) {
		this.customerName = customerName;
		this.appointmentDate = appointmentDate;
		this.appointmentTime = timeNow;
		this.designerName = designerName;
		this.address = address;
	}

	public Appointment(String customerName2, String string, String string2, String designerName2, String address2) {

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public LocalDate getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public LocalTime getAppointmentTime() {
		return appointmentTime;
	}

	public void setAppointmentTime(LocalTime appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String showApptDetails() {
		return String.format("%-10s %-15s %-15s %-15s %15s\n", customerName, appointmentDate, appointmentTime,
				designerName, address);

	}

}
