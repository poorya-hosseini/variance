package com.practice.pooria.varicnce.chart.api.DTO;

public class DefectDto {

	private long id;
	private int x;
	private int y;
	private int z;
	private int value;

	public DefectDto() {
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(final int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(final int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(final int z) {
		this.z = z;
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}

	public static class Builder {

		private long id;
		private int x;
		private int y;
		private int z;
		private int value;

		public Builder setId(final long id) {
			this.id = id;
			return this;
		}

		public Builder setX(final int x) {
			this.x = x;
			return this;
		}

		public Builder setY(final int y) {
			this.y = y;
			return this;
		}

		public Builder setZ(final int z) {
			this.z = z;
			return this;
		}

		public Builder setValue(final int value) {
			this.value = value;
			return this;
		}

		public DefectDto build() {
			DefectDto defectDto = new DefectDto();
			defectDto.setId(id);
			defectDto.setX(x);
			defectDto.setY(y);
			defectDto.setZ(z);
			defectDto.setValue(value);
			return defectDto;
		}
	}
}
