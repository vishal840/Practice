
public class Puppy {
	int puppyAge;
	public Puppy(String name){
		System.out.println("Name chosen for the dog:" + name);
	}
	public void setAge(int age)
	{
		puppyAge = age;
	}
	public void getAge(){
		System.out.println("Dog age is:" + puppyAge);
		
	}
	
	public static void main(String args[])
	{
		Puppy myPuppy = new Puppy("Bruno");
		
		myPuppy.setAge(5);
		
		myPuppy.getAge();
		
		System.out.println("Age of the Dog is:"+myPuppy.puppyAge);
	
			}
	
}

