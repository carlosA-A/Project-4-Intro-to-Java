
public class Pokemon {

private String species;
private int attack;
private int defense;
private int speed;
public static int creationNumber;

//Constructor for pokemon class
public Pokemon(String species, int attack, int defense, int speed){
	//pokemon data fields
	this.species=species;
	this.attack=attack;
	this.defense=defense;
	this.speed=speed;
	creationNumber++;
}

//returns pokemon species
public String getSpecies() {
	return species;
}

public int getCreationNumber() {
	return creationNumber;
}
//sets Pokemon species
public void setSpecies(String spc) {
	species = spc;
}

//returns pokemon attack
public int getAttack() {
	return attack;
}


public void setAttack(int atk) {
	attack = atk;
}


public int getDefense() {
	return defense;
}


public void setDefense(int def) {
	defense = def;
}


public int getSpeed() {
	return speed;
}


public void setSpeed(int spd) {
	speed = spd;
}
public void grow(int boost){
	
	attack+=boost;
}
public void harden(int boost){
	defense+=boost;
	
}
public void haste(int boost){
	speed+=boost;
	
}

//public static void  main(String[] args) {
//	Pokemon pikachu=new Pokemon("electricity",5,5,5);
//
//	System.out.println(pikachu.getAttack());	
//}
}
