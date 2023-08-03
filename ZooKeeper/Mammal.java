package com.aymen.zoo;

public class Mammal {
	protected int energyLevel;
	
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	
	public void displayEnergy() {
		System.out.println("Energy is :" + energyLevel );
	}
	
	
	
	


	public int getEnergyLevel() {
		return energyLevel;
	}


	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
