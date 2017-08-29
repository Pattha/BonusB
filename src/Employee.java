
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setB(int b){

		System.out.println("Salary  "+b  +"  Bonus  "+(bonusCalculator.computeBonus(b)));
	}
}
