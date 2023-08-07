package Rays;

public class TestRaceCondition {
public static void main(String[] args) {
	RaceCondition r1 = new RaceCondition("Kallu");
	RaceCondition r2 = new RaceCondition("Shelendra");
	r1.start();
	r2.start();
}
}
