package com.persona.proxy;

public class ServiceProxy extends AbstractPersonProxy {

	

    public ServiceProxy(PersonaProxyI p) {
        //super(p);
    }

    public void before() {
        System.out.println("Antes de ejecutar el proxy");
    }

    public void after() {
        System.out.println("Después de ejecutar el proxy");
    }

	@Override
	public void operation() {
		
		
	}


}


