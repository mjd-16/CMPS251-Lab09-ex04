package lab09_exercise04;

import java.time.LocalDate;

public class Vehicle implements Cleanable {
	
	private String plateNumber;
	private int wheels;
	private int weight;
	private LocalDate registrationDate;
	private int cleaningCount;

	public Vehicle(String plateNumber, int wheels, int weight, LocalDate registrationDate, int cleaningCount) {
		super();
		this.plateNumber = plateNumber;
		this.wheels = wheels;
		this.weight = weight;
		this.registrationDate = registrationDate;
		this.cleaningCount = cleaningCount;
	}

	public Vehicle() {
		super();
	}


	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getCleaningCount() {
		return cleaningCount;
	}

	@Override
	public int getFee(String s) {
		return fees.get(s);
	}

	@Override
	public void setCleaningCount(int n) {
		this.cleaningCount = n;
	}

	@Override
	public double getCleaningAmount() {
		return cleaningCount*getFee(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "Vehicle [plateNumber=" + plateNumber + ", wheels=" + wheels + ", weight=" + weight
				+ ", registrationDate=" + registrationDate == null? "" : registrationDate + ", cleaningCount=" + cleaningCount + "]";
	}
	

}
