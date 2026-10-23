package com.mygdx.game;

import com.badlogic.gdx.graphics.OrthographicCamera;

// Wrapper para OrthographicCamera para aplicar el principo SIngleton
public class OrthographicCameraWrapper {
	private static OrthographicCamera instance;
	
	// Constructor privado
	private  OrthographicCameraWrapper() {}
	
	// Metodo que devuelve una unica instancia de la camara
	public static OrthographicCamera getInstance() {
		if (instance == null) {
			instance = new OrthographicCamera();
			System.out.println("Se instancio OrthographicCamera");
		}
		return instance;
	}
}
