package wrapup;

public class Person {
	private String name;
	private int score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "\n이름:" + this.name + " 점수:" + this.score;
	}
	
	
	

}
