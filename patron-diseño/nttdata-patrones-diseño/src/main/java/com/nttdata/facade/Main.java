package com.nttdata.facade;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		FachadaPersonas fachada = new FachadaPersonas();
        List<PersonF> personas20y30 = fachada.getPersonasEntre20y30();
        if (personas20y30 != null) {
            for (PersonF p : personas20y30) {
                System.out.println("Nombre: " + p.getName() + ", Edad: " + p.getAge());
            }
        } else {
            System.out.println("No se encontraron personas entre 20 y 30 años");
        }
	}

}
