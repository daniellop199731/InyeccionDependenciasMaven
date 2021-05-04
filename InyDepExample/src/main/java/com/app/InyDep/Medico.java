package com.app.InyDep;

public class Medico {
	
	public Utencilios utencilio;
	
	public void setUtencilio( Utencilios utencilio ) {
		this.utencilio = utencilio;
	}
	
	public void operar() {
		System.out.println("Operando!!!");
		utencilio.usar();
	}
	
}
