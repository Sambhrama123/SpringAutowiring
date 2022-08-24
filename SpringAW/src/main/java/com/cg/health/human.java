package com.cg.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class human {
	private heart Heart;

	public heart getHeart() {
		return Heart;
	}
	
	
	@Autowired
	@Qualifier("humanheart")
	public void setHeart(heart heart) {
		Heart = heart;
	}
public void startpumping()
{
	System.out.println("the name of the animal"+Heart.getNameofanimal());
	System.out.println("the no of heart"+Heart.getNoofheart());
	System.out.println("You are still alive");
	
Heart.pumping();
}
}

