package composer.base;

import java.util.ArrayList;

public abstract class Person 
{
	public String title ;
	public String firstName ;  
	public String lastName ;  
	public ArrayList<String> middleNames  ; 
	public Gender gender  ;
	public ArrayList<String> nationalities  ;
	public ContactDetails contactDetails  ;
	public BirthDetails birthDetails  ;
	public DeathDetails deathDetails  ;
}