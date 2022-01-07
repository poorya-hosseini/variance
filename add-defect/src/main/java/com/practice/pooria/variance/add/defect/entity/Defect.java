package com.practice.pooria.variance.add.defect.entity;

import java.util.StringJoiner;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Defect {

	@Id
	@GeneratedValue
	private
	Long id;

	private int x;
	private int y;
	private int z;
	private int value;

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
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

	@Override
	public String toString() {
		return new StringJoiner(", ", Defect.class.getSimpleName() + "[", "]")
			.add("id=" + id)
			.add("x=" + x)
			.add("y=" + y)
			.add("z=" + z)
			.add("value=" + value)
			.toString();
	}
}
