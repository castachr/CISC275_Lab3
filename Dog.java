
public class Dog extends Animal implements Comparable<Dog>{
	// Constructors - default and takes string + int
		public Dog(){
			this.name = "";
			this.numLegs = 0;
		}
		public Dog(String name, int numLegs){
			this.name = name;
			this.numLegs = numLegs;
		}
		public static void main (String [] args){
			
		}
		public int compareTo(Dog otherD){
			if(this.getLegs() - otherD.getLegs() == 0){
				return this.getName().compareTo(otherD.getName());
			}
			else{
				return this.getLegs()-otherD.getLegs();
			}
		}
}
