
public class Pokedex {

	Pokemon[] pokemonArray;
	//static int amountPokemon;
	
	//COMPLETE CONSTRUCTOR
	public Pokedex(int size){
		
			pokemonArray=new Pokemon[size]; 	
	}
	
	public void listPokemon(){
		int counter=1;
		if (Pokemon.creationNumber==0) {
			System.out.println("Your Pokedex is currently empty!");
			
		}
		for(int i=0;i<Pokemon.creationNumber;i++){
			System.out.println(counter+". "+pokemonArray[i].getSpecies());
			
			counter++;
			
		}
		System.out.println();
	}
	
	
	//Adds pokemon to array
	
	//BROKEN,
	public void addPokemon(Pokemon pkm){
		int activator=0;
		int activatePrint=0;
		if (pkm.creationNumber>1) {
			pkm.creationNumber--;
			
		}
		for(int i=0;i<Pokemon.creationNumber;i++){
			if(pokemonArray[0]==null){
				pokemonArray[pkm.getCreationNumber()-1]=pkm;
				

			}
			
			else if (pkm.getSpecies().equals(pokemonArray[i].getSpecies())) {
				System.out.println("Pokedex is already storing that Pokemon!");
				
			}
			else if (pokemonArray.length<pkm.getCreationNumber()+1){
				activatePrint++;
				
				
			}
			else{
				activator++;
												
			}
			
		}
		if (activator==pkm.creationNumber ) {
			
			pokemonArray[pkm.getCreationNumber()]=pkm;
			pkm.creationNumber++;			
		}
		else if (activatePrint>1) {
			System.out.println("Your Pokedex is already holding the max amount!");
		}
		
	}
	//Loop through array and if pokemon name exists,then print the stars
	public void checkStats(String pkm_nm){
		int counter=0;
		for(int i=0;i<Pokemon.creationNumber;i++){
			if(pkm_nm.equals(pokemonArray[i].getSpecies())){
				System.out.println("The stats for "+pokemonArray[i].getSpecies()+" are:");
				System.out.println("Attack: "+ pokemonArray[i].getAttack());
				System.out.println("Defense: "+ pokemonArray[i].getDefense());
				System.out.println("Speed: "+ pokemonArray[i].getSpeed());
				System.out.println();
				counter++;
			}
			
			
		}
		if (counter<1) {
			System.out.println("The Pokemon could not be found!");
			System.out.println();
			
		}
		
	}
	//COMPLETE
	public void sortPokemon(){
		
		
		
		for(int i=0;i<Pokemon.creationNumber;i++){
			Pokemon firstPokemon=pokemonArray[i];
			int currentIndex=i;
			
			for (int j = 0; j < Pokemon.creationNumber; j++) {
				if (pokemonArray[j].getSpecies().compareTo(pokemonArray[i].getSpecies())>pokemonArray[i].getSpecies().compareTo(pokemonArray[j].getSpecies())) {
					pokemonArray[i]=pokemonArray[j];
					pokemonArray[j]=firstPokemon;
					firstPokemon=pokemonArray[i];
					
					
				}
			}
			
			
			
			
			
		
			
		}
				
	}
	
	
	

	
}
