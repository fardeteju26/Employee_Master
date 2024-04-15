package emp.com.example.Employee_Master.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee_master")
public class Employee {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

	    private String firstName;
	    private String lastName;
	    private String dateOfBirth;
	    private String gender;
	    private String nationality;
	    private String address;
	    private String contactNumber;
	    private String department;
	    private String position;

	   

	    public Employee() {
	        
	    }

	    public Employee(String firstName, String lastName, String dateOfBirth, String gender, String nationality,
	                    String address, String contactNumber, String department, String position) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender;
	        this.nationality = nationality;
	        this.address = address;
	        this.contactNumber = contactNumber;
	        this.department = department;
	        this.position = position;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }

	    public  String getDateOfBirth() {
	        return dateOfBirth;
	    }

	    public void setDateOfBirth(String dateOfBirth) {
	        this.dateOfBirth = dateOfBirth;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getNationality() {
	        return nationality;
	    }

	    public void setNationality(String nationality) {
	        this.nationality = nationality;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getContactNumber() {
	        return contactNumber;
	    }

	    public void setContactNumber(String contactNumber) {
	        this.contactNumber = contactNumber;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }

	
	    @Override
	    public String toString() {
	        return "Employee{" +
	                "id=" + id +
	                ", firstName='" + firstName + '\'' +
	                ", lastName='" + lastName + '\'' +
	                ", dateOfBirth=" + dateOfBirth +
	                ", gender='" + gender + '\'' +
	                ", nationality='" + nationality + '\'' +
	                ", address='" + address + '\'' +
	                ", contactNumber='" + contactNumber + '\'' +
	                ", department='" + department + '\'' +
	                ", position='" + position + '\'' +
	                '}';
	    }

		public int getStatus() {
			// TODO Auto-generated method stub
			return 0;
		}
}
