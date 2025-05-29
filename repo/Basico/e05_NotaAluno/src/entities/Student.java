package entities;

public class Student {
		
		public String name;
		public double first;
		public double second;
		public double third;
		
		public double finalGrade () {
			return this.first + this.second + this.third;
		}
		
		public double missing () {
			return 60 - finalGrade();
		}
	

}