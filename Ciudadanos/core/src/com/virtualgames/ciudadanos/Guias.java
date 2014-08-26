package com.virtualgames.ciudadanos;
//�sta es una clase dummy que, b�sicamente explica lo que hay que hacer para crear cada cosa en el juego
/*1.�C�mo crear un evento?
6/7/2014
En L�gica se instancian 4 clases que intervienen en la formaci�n de un evento:
a) Registrodeeventos
b) Registrodeopciones
c) Registro de funciones
d) Registrodeavisos
e) Nivel1/Generadordeeventos
a) Todo evento se compone de un texto que explica el contenido del evento y de varias opciones que contienen el texto de cada posibilidad para el jugador,
as� como de un mensaje de confirmaci�n o "aviso" por cada opci�n pulsada.
Primer paso: Asignar un c�digo. El primer evento tiene el n�mero 100, el segundo el 101 y as� correlativamente. Lo primero que hacemos, por tanto, 
es entrar en el Registro de eventos, crear una variable del tipo Evento con el nombre que queramos asignarle (En el caso del primer evento es 
Evento1), despu�s comprobar la longitud de la array "todos los eventos" para evitar no tener sitio en dicha array para meter el evento.
Una vez realizados esos pasos previos, instanciamos la variable que hemos creado antes, usando el n�mero que le corresponda, a�adiendo el texto
del evento y meti�ndola dentro de la array "todosloseventos".
Esta instanciaci�n requiere que usemos el registro de opciones.
b) Recordamos el c�digo asignado. Siguiendo el ejemplo, el 101. Entramos en Registrodeopciones.
All� vamos a crear variables seg�n el n�mero de opciones. Por cada opci�n, vamos a reservar una variable de tipo Opcion con el siguiente formato:
"opcion"+numerodeopcion+"e"+numerodeevento
Adem�s, vamos tambi�n a crear una array por cada evento con el siguiente formato:
"opcionese"+numerodeevento
En la instanciaci�n, incluiremos el texto y pediremos los avisos al registro de avisos, tambi�n deberemos incluir las nuevas opciones en las 
funciones "devolveropcion" y "devolverarraydeopciones".
A diferencia de la clase "Evento", que es est�tica, la clase "Opci�n", le pasa el c�digo de evento y funci�n al registro de funciones, que ejecuta
el c�digo espec�fico de la opci�n pulsada.
c) Por tanto, en registro de funciones, dentro del switch contenido en la funci�n distribuidora, hay que meter el nombre de la funci�n que queremos
ejecutar, que se encargar� de modificar las variables globales, as� como de cambiar la cola de eventos si es necesario.
Tambi�n en esta clase se incluyen las propias funciones.
d) En el registro de avisos, al igual que hacemos en el registro de opciones, reservamos tantas variables de aviso como variables de opciones, tambi�n
creamos la correspondiente array. En devolveraviso() hay que introducir un nuevo caso con sus correspondientes subcaso y hacer lo mismo con la
array en devolverarraydeavisos.
e) Por �ltimo, hay que entrar en las clases Generadordeeventos y Nivel1. Este c�digo es provisional ya que, por el momento, el evento se ejecuta
en unas l�neas contenidas en la funci�n constructora de "Generadordeeventos", extray�ndolas de la array contenida en el Nivel. As� que, por el momento,
hay que modificar Nivel1 asegur�ndonos que su arraydeeventos tiene tama�o suficiente y llamando al registro de eventos para llenarla y, despu�s,
modificar Generador de eventos para que ejecute la posici�n de la array contenida en el Nivel correspondiente. Como hay que hacer que 
generadordeeventos sea m�s complejo en el futuro, por ahora se har�n pruebas individualizadas de cada evento meti�ndolos en la funci�n constructora.

 
 
*/
//2.�C�mo registrar un nuevo objeto en el juego?
//3.�C�mo funcionan los registros?
//4.�C�mo crear un men�?
//4.2 �C�mo crear las tablas de valores de un men�?
//4.2.1 �C�mo se actualizan los valores de un men�?