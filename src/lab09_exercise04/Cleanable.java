package lab09_exercise04;

import java.util.Map;

public interface Cleanable {
	public Map<String, Integer> fees = Map.of("Car", 10, "Truck", 15, "Unit", 25, "Villa", 50);
	
	public int getFee(String s);
	public void setCleaningCount(int n);
	public double getCleaningAmount();
	
}
