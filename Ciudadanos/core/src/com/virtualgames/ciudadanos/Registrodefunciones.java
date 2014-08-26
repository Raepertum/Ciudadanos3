package com.virtualgames.ciudadanos;

import com.badlogic.gdx.utils.Array;

public class Registrodefunciones {

	public static final Registrodefunciones registrodefunciones = new Registrodefunciones();
	
	//Almacenamos los c�digos de nuevos eventos que se incorporar�n al generador de eventos
	Array <Integer> codigosdeeventos= new Array <Integer>();
	//Almacenamos los eventos que corresponden a dichos c�digos
	Array <Evento> eventospendientes = new Array <Evento>();;
	
	private Registrodefunciones(){
		
	//Registro de funciones usa clases accesibles desde cualquier sitio:
	//Variablesdejuego, registro de individuos, registro de granjas...
		
		
	}
	
	//Funciones sociales
	
	public void distribuidordefunciones(int codigo, int numerodeopcion){
		switch(codigo){
		//Evento 1: "Unos campesinos quieren ocupar uno de tus campos y cultivarlo." +
		//" A cambio se comprometen a ofrecerte la mitad de sus cosechas."
		case 100:switch (numerodeopcion){
		//Se instala una familia de aldeanos, cuyo miedo y lealtad base depende de las opciones escogidas
		case 0: instalaciondenuevosciudadanos("campesinos",100,20,0);
		        //PRUEBA
		        anadiralacoladeeventospendientes(1);
		break;
		case 1: instalaciondenuevosciudadanos("campesinos",80,30,0);
		break;
		case 2: instalaciondenuevosciudadanos("campesinos",70,50,0);
		break;
		case 3: instalaciondenuevosciudadanos("campesinos",60,60,0);
		break;
		case 4: instalaciondenuevosciudadanos("campesinos",50,80,0);
		break;
		}
		
		}
	};
	
	
	private void instalaciondenuevosciudadanos(String tipodeciudadanos, int lealtadbase, int miedobase, int habilidadbase){
		
		//Esta llamada nos va a crear una familia de seis miembros
		if(tipodeciudadanos=="campesinos"){
		Registrodefamilias.registrodefamilias.crearfamiliadealdeanos(lealtadbase, miedobase, habilidadbase);
		}
		
		
	};
	
	//Funciones l�gicas
	
	//Primero a�adimos c�digos (Esto se hace desde el propio registro de funciones)
	private void anadiralacoladeeventospendientes(Integer codigonumericodevento){
		codigosdeeventos.add(codigonumericodevento);
	};
	
	//Desde l�gica preguntamos por el tama�o de la array de c�digos
	public int devolvertamanoarraydecodigos(){
		return codigosdeeventos.size;
	}	
	
	//Desde l�gica devolvemos los c�digos
	public int devolvercodigosdeeventos(int indice){
		return codigosdeeventos.get(indice);
	}
	
	//Desde l�gica vamos a pedir que se nos manden los eventos que hay que ir a�adiendo	
	public void convertircodigoseneventos(Evento evento){
		eventospendientes.add(evento);	
	}
	
	//Desde l�gica devolvemos la array de eventos pendientes
	public Evento devolvereventospendientes(int indice){
		return eventospendientes.get(indice);
	};
	
	public int devolvertama�oarraydeeventos(){
		return eventospendientes.size;
	}
	
	public void limpiareventospendientes(){
		//Limpia los c�digos y limpia los eventos
		eventospendientes.clear();
		codigosdeeventos.clear();
		
	}
	
	
	
	
}
