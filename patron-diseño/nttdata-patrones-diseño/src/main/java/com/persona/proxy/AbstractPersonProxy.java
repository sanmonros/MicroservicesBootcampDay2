package com.persona.proxy;

public abstract class AbstractPersonProxy implements PersonaProxyI {

	private PersonaProxyI p;

	public void PersonaProxyI(PersonaProxyI p) {
	        this.p=p;
	  }

	@Override
	public void operation() {
		before();
		p.operation();
		after();

	}

	public abstract void before();

	public abstract void after();

}
