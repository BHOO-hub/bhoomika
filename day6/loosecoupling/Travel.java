package com.loosecoupling;

public class Travel implements Itravel {
	
	
	//sending transport object into travel class
	private Transport transport;
	
	//constructor
	Travel(Transport transport){
		this.transport = transport;
		
	}

	@Override
	public void start() {
		transport.Start();
		
	}
	
	

}
