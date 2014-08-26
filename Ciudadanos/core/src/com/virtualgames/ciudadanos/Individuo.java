package com.virtualgames.ciudadanos;

public class Individuo {

//Sexo: True - Hombre, False - Mujer
boolean sexo;
int edad;
int lealtad;
int miedo;
int habilidad;
String profesion;
int nivel;
boolean cansado = false;
	
public Individuo(boolean sexo, int edad, int lealtad, int miedo, String profesion, int nivel){
	this.sexo = sexo;
	this.edad = edad;
	this.lealtad = lealtad;
	this.miedo = miedo;
	this.profesion = profesion;
	this.nivel = nivel;
}

public void envejecer(){
	this.edad++;
}

public void cambiardeprofesion(String nuevaprofesion){
	this.profesion = nuevaprofesion;
}
public void subirdenivel(){
	this.nivel++;
}
public void cansarindividuo(){
	cansado=true;
}
public void descansarindividuo(){
	cansado=false;
}


//�Cu�nto trigo producen? Se produce en las granjas
//�Cu�nto trigo consumen? Se ve en el registro de individuos
//�Cu�ndo mueren? Se ve en el registro de individuos
//�Est�n enfermos? Se actualiza en el registro de individuos
//�Tienen un n�mero de identificaci�n? Por ahora no
	
}
