public class TakeForm implements Behavior, AnimalKingdom{

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
		persona.breed("Elite Class");
		persona.shit(4);
	}
}

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