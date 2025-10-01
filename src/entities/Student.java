package entities;

public class Student {
	private String name;
	private double grade1;
	private double grade2;
	private double grade3;
	
	//private final double VALUE1 = 30.00;
	//private final double VALUE23 = 35.00;
	private final double AVG_VALUE = 60.00;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade1() {
		return grade1;
	}
	
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	
	public double getGrade2() {
		return grade2;
	}
	
	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}
	
	public double getGrade3() {
		return grade3;
	}
	
	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}
	
	
	public double finalGrade() {
		double finalGrade;
		finalGrade = this.getGrade1() + this.getGrade2() + this.getGrade3();
		
		return finalGrade;
	}
	
	public void approvedOrNot() {
		
		System.out.printf("%nFINAL GRADE = %.2f%n", this.finalGrade());
		
		if (this.finalGrade() < AVG_VALUE) {
			System.out.println("FAILED");
			
			double missingPoints = AVG_VALUE - this.finalGrade();
			System.out.printf("MISSING %.2f POINTS", missingPoints);
		} else {
			System.out.println("PASS");
		}
	}
	
}
