# CISC275-Fall2018-first-git
1. Create java files to make this code compile and run.

2. What five objects are created in the main?
	1.) An array list of type Dog called "dogs"
	2.) A new dog named Fido with 4 legs
	3.) A new dog named Fido with 3 legs
	4.) A new dog named Alfie with 4 legs
	5.) A new Comparator of type Animal (it is an abstract class)
3. Can you spot the comparator constructor call? Where is the class definition for the comparator?
The comparator constructor call is triggered by the keyword "new" in the following line:
Collections.sort(d0gs, new Comparator<Animal>()
Then, directly after this constructor call, is the definition for the abstract class!
