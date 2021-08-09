package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape { //classe abastrata com os paramentros a serem herdados para as classes filhas

	private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
