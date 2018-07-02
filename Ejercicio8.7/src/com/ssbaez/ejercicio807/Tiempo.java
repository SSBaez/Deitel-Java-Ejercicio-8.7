package com.ssbaez.ejercicio807;

public class Tiempo {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo() {
		this(0, 0, 0);
	}

	public Tiempo(int hora) {
		this.hora = hora;
	}
	
	public Tiempo(int hora, int minuto) {
		this(hora, minuto, 0);
	}
	
	public Tiempo(int hora, int minuto, int segundo) {
		if(hora < 0 || hora >= 24)
			throw new IllegalArgumentException("hora debe estar entre 0 y 23");
		
		if(minuto < 0 || minuto >= 60)
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		
		if(segundo < 0 || segundo >= 60)
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public Tiempo(Tiempo tiempo) {
		this(tiempo.getHora(), tiempo.getMinuto(), tiempo.getSegundo());
	}
	
	public void establecerTiempo(int hora, int minuto, int segundo) {
		if(hora < 0 || hora >= 24)
			throw new IllegalArgumentException("hora debe estar entre 0 y 23");
		
		if(minuto < 0 || minuto >= 60)
			throw new IllegalArgumentException("minuto debe estar entre 0 y 59");
		
		if(segundo < 0 || segundo >= 60)
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
	}
	
	public void setHora(int hora) {
		if(hora < 0 || hora >= 24)
			throw new IllegalArgumentException("hora debe estar entre 0 y 23");
		
		this.hora = hora;
	}
	
	public void setMinuto(int minuto) {
		if(minuto < 0 || hora >= 60)
			throw new IllegalArgumentException("minuto debe de estar entre 0 y 59");
		
		this.minuto = minuto;
	}
	
	public void setSegundo(int segundo) {
		if(segundo < 0 || segundo >= 60)
			throw new IllegalArgumentException("segundo debe estar entre 0 y 59");
		
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public String aStringUniversal() {
		return String.format("%02d:%02d:%02d", getHora(), getMinuto(), getSegundo());
	}
	
	public String toString() {
		return String.format("%d:%02d:%02d %s",
				((getHora() == 0 || getHora() == 12) ? 12 : getHora() % 12),
				getMinuto(), getSegundo(), (getHora() < 12 ? "AM" : "PM	"));
	}
	
	public void ticTac() {
		if(getSegundo() == 59) {
			setSegundo(0);
			incrementarMinuto();
		}
		else
			setSegundo(getSegundo() + 1);
	}
	
	public void incrementarMinuto() {
		if(getMinuto() == 59) {
			setMinuto(0);
			incrementarHora();
		}
		else
			setMinuto(getMinuto() + 1);
	}
	
	public void incrementarHora() {
		if(getHora() == 23)
			setHora(0);
		else
			setHora(getHora() + 1);
	}

}
