package com.virtualgames.ciudadanos;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureAtlas.AtlasRegion;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

//Tomaremos este objeto como modelo para hacer los otros
//Primer paso para crear un nuevo objeto: En el m�todo init() de Texturas y Sonidos instanciamos
//El objeto con el sufijo -grafica.
//Segundo paso: Tambi�n en Texturas y Sonidos creamos la propia clase del objeto, desde la que se reserva memoria
//para las texturas, por ejemplo:
/*public class TorreGrafica{
	public final AtlasRegion base;
	public final AtlasRegion medio;
	public final AtlasRegion copa;
	
	public TorreGrafica(TextureAtlas atlas){
		base = atlas.findRegion("Base");
		copa = atlas.findRegion("Copa");
		medio = atlas.findRegion("Medio");
	}*/
//Tercer paso(�ste) crear el objeto con su l�gica y su m�todo render(). Se deben cargar las texturas
//en el propio m�todo de inicializaci�n
//Cuarto paso: Para verlo tienes que actualizar el renderizador, para que la l�gica del objeto se ejecute,
//tienes que llamarla desde Logica. El objeto se instancia en "l�gica"


public class Torre extends Objetodejuego{

	private TextureRegion texturabase;
	private TextureRegion texturacopa;
	private TextureRegion texturamedio;
	
	public Torre(){
		init();
	};
	
	private void init(){
		posicionX = -0.5f;
		dimensionX = 1;
		dimensionY = 1;
		texturabase = Texturasysonidos.texturasysonidos.torre.base;
		texturacopa = Texturasysonidos.texturasysonidos.torre.copa;
		texturamedio = Texturasysonidos.texturasysonidos.torre.medio;
	}
	
	@Override
	public void render(SpriteBatch batch) {
	
		//Habr� que cambiar esto m�s adelante, por ahora s�lo renderizar� una base
		TextureRegion textura = null;
		//Dibujamos una base
		textura = texturabase;
		batch.draw(textura.getTexture(),posicionX, posicionY-1.5f,origenX,origenY,dimensionX,dimensionY,
				escalaX, escalaY,rotacion,textura.getRegionX(),textura.getRegionY(),
				textura.getRegionWidth(),textura.getRegionHeight(),false,false);
		textura = texturamedio;
		batch.draw(textura.getTexture(),posicionX, posicionY-0.5f,origenX,origenY,dimensionX,dimensionY,
				escalaX, escalaY,rotacion,textura.getRegionX(),textura.getRegionY(),
				textura.getRegionWidth(),textura.getRegionHeight(),false,false);
		textura = texturacopa;
		batch.draw(textura.getTexture(),posicionX, posicionY+0.5f,origenX,origenY,dimensionX,dimensionY,
				escalaX, escalaY,rotacion,textura.getRegionX(),textura.getRegionY(),
				textura.getRegionWidth(),textura.getRegionHeight(),false,false);
		
		
	}

}
