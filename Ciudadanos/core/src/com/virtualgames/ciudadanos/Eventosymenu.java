package com.virtualgames.ciudadanos;

public class Eventosymenu {

public static final Eventosymenu eventosymenu = new Eventosymenu();

//Aqu� vamos a ir reuniendo instancias de cada uno de los men�s y eventos, inicializ�ndolos y dot�ndolos
//de los par�metros necesarios en el caso de los eventos

MenuAlmacen menualmacen = new MenuAlmacen();
MenuEjercito menuejercito = new MenuEjercito();
MenuComercio menucomercio = new MenuComercio();
MenuEspionaje menuespionaje = new MenuEspionaje();
MenuSocial menusocial = new MenuSocial();

//Tambi�n contiene la variable men�visible, para controlar si existe alg�n men� abierto y cu�l es
MenuAbstracto menuvisible;

private Eventosymenu(){
	menuvisible = null;
}

public void SetMenu(MenuAbstracto menu){
	menuvisible = menu;
};
public MenuAbstracto GetMenu(){
	return menuvisible;
};




}
