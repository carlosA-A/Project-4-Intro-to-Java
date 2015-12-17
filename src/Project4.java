//Name: Carlos Avogadro
//UFL ID: c.avogadro
//Section:6909
//Project Number: 4
//Brief description of file documents: Pokedex

import java.util.Scanner;
import java.util.Random;

public class Project4 {
public static void main(String [] args) {
	//variables
	int randomAttack;
	int randomDefense;
	int randomSpeed;
	int optionsMenu=0;
	String pokemonName;
	
	
	System.out.println("Welcome to your new PokeDex!");
	System.out.print("How many Pokemon are in your region?: ");
	
	//Get length of array
	Scanner input =new Scanner(System.in);
	int numberPokemon=input.nextInt();
	
	System.out.println();
	
	//Create pokedex object
	Pokedex pokedex=new Pokedex(numberPokemon);
	
	
	System.out.println("Your new Pokedex can hold "+numberPokemon+" pokemon. Let's start using it!");
	System.out.println();
	
	while(optionsMenu!=5){
		mainMenu();
		System.out.println();
		System.out.print("What would you like to do? ");
		optionsMenu=input.nextInt();
		
		if(optionsMenu>5||optionsMenu<1){
			System.out.println("\nThat's not a valid input choice. Try again!\n");
		}
		else if(optionsMenu==1){
			pokedex.listPokemon();
			
		}
		else if(optionsMenu==2){
			System.out.println();
			System.out.print("Please enter the Pokemon's name: ");
			pokemonName=input.next();
			System.out.println();
			
			Pokemon pokemon=new Pokemon(pokemonName, (pokemonName.length()*4)+2, 
					(pokemonName.length()*2)+7, (pokemonName.length()*3)+5);
			pokedex.addPokemon(pokemon);
		}
		else if(optionsMenu==3){
			System.out.println();
			System.out.print("Please enter the Pokemon of interest: ");
			pokemonName=input.next();
			System.out.println();
			
			pokedex.checkStats(pokemonName);
			
		}
		else if(optionsMenu==4){
			pokedex.sortPokemon();
		}

	
	}
	}

public static void mainMenu() {
	System.out.println("1. List Pokemon\n2. Add Pokemon\n3. Check a Pokemon's Stats\n4. Sort Pokemon\n5. Exit");
	
}
}
