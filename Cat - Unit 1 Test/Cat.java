public class Cat { // made "Public" --> "public", made "Cats" --> "Cat"
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;

	// 2-Parameter Constructor
	public Cat(String name, String breed) { // made "cat" --> "Cat", added "breed" parameter because it is later
											// mentioned
		this.name = name; // added "this" to variables we want to set
		this.breed = breed;
		this.isHungry = true; // "yes" is not a state for a boolean variable, made "yes" --> "true"
		livesRemaining = 9;
	}

	public String getName() { // void --> String because we want to return a string
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	// added setBreed() setter

	public void setIsHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	// added setIsHungry setter

	public void setLivesRemaining(int livesRemaining) {
		this.livesRemaining = livesRemaining;
	}
	// added this method

	public int getLivesRemaining() {
		return livesRemaining;
	}
	// added this method

	public String getBreed() {
		return breed;
	}
	// added getBreed() method cuz it was missing

	public boolean getIsHungry() { // void --> boolean because isHungry is a boolean, capitalized 'I' and 'H' in
									// "ishungry"
		return isHungry;
	}

	public void feed() { // boolean --> void because we are not returning anything
		this.isHungry = false;
	}

	public boolean equals(Cat other) {
		return this.name.equals(other.name) && this.breed.equals(other.breed) // == --> equals() because are comparing
																				// Strings
				&& this.livesRemaining == other.livesRemaining; // = --> == because we are comparing, not setting equal
	}

	public String toString() {
		return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining."); // toString()'s
																										// are return
																										// methods,
																										// System.out.println()
																										// --> return
	}
}