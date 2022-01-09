package com.practice.pooria.variance.show.chart.api.dto;

public class Point {

	private int axisValue;
	private int defectValue;

	public Point(final int axisValue, final int defectValue) {
		this.axisValue = axisValue;
		this.defectValue = defectValue;
	}

	public int getAxisValue() {
		return axisValue;
	}

	public void setAxisValue(final int axisValue) {
		this.axisValue = axisValue;
	}

	public int getDefectValue() {
		return defectValue;
	}

	public void setDefectValue(final int defectValue) {
		this.defectValue = defectValue;
	}
}
