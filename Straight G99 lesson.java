interface Pet{
  public void test();
}
class Dog implements Pet{
   public void test(){
     System.out.println("Interface Method Implemented");
     System.out.println("          Learned");
     System.out.println("You can put an Interface within a Class directly");
  }
   public static void main(String args[]){
     Pet p = new Dog();
     p.test();
  }
}


/*public class TakeForm implements Behavior, AnimalKingdom{

	public void shit(int a){
		System.out.println("Behavior I did was Shit "+ a);
		//System.out.println("Behavior I did was Shit "+ a "times");
	}

	public void race(String b){
		System.out.println("I was born a "+b);
	}

	public void breed(String c){
		System.out.println("I am part of the " + c);
	}

	public static void main (String agrs[]){
		TakeForm persona = new TakeForm();
		persona.race("Lion");
		persona.breed("Elite");
		persona.shit(4);
	}
}
*/
//how do i get it to print a times instead of just a.

/*
*	TakeForm persona = new TakeForm();
		//String Lion = "sdfsd";
		String Elite = "shhiit";
		//Learn Lesson about strings and how Java REQUIRES Quotes "" for string vars and needs 'S'tring
		persona.race("sdfsd");
		persona.breed(Elite);   worked & printed shhitt
		persona.shit(4);
*/