package zadaca5;

public class Main {

	public static void main(String[] args) {
		//Instanca za objekt1 so default konstruktor
				Predmet obj1 = new Predmet ();				
				//Instanca za objekt2 so dinamicki konstruktor so atribut za ime
				Predmet obj2 = new Predmet ("Matematika 1");
				//Instanca za objekt3 so  dinamicki konstruktor so site parametri
				Predmet obj3 = new Predmet ("OOP", "Ilija Joleski", 6);

				//Zadavanje vrednosti na atributite na objektot1
				obj1.ime = "Aplikativen Softver";
				obj1.profesor = "Andrijana Bocevska";
				obj1.krediti = 6;
				obj1.semestar = "I-vi";

				//Pecatenje na atributite na trite objekti
				System.out.println(obj1.ime + " " + obj1.profesor + " " + obj1.krediti + " " + obj1.semestar);
				System.out.println(obj2.ime);
				System.out.println(obj3.ime + " " + obj3.profesor + " " + obj3.krediti);

	}

}
