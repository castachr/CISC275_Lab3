
public abstract class Animal {
	public String name;
	public int numLegs;
	
	public String getName(){
		return name;
	}
	
	public int getLegs(){
		return numLegs;
	}
	
	public void setName(String newName){
		this.name = newName;
	}
	
	public void setLegs(int newLegs){
		this.numLegs = newLegs;
	}
	
	public String toString(){
		return "Name: " + this.getName() +" Legs: " +this.getLegs();
	}
	public static void main (String [] args){
		
	}
}
