package lab09_exercise04;

public class Residence implements Cleanable{
	private String street;
	private int roomCount;
	private int cleaningCount;
	
	public Residence() {}

	public Residence(String street, int roomCount, int cleaningCount) {
		super();
		this.street = street;
		this.roomCount = roomCount;
		this.cleaningCount = cleaningCount;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getRoomCount() {
		return roomCount;
	}

	public void setRoomCount(int roomCount) {
		this.roomCount = roomCount;
	}

	public int getCleaningCount() {
		return cleaningCount;
	}

	public void setCleaningCount(int cleaningCount) {
		this.cleaningCount = cleaningCount;
	}

	@Override
	public int getFee(String s) {
		return fees.get(s);
	}

	@Override
	public double getCleaningAmount() {
		return this.getCleaningCount()*this.getFee(this.getClass().getSimpleName());
	}
	
	
}
