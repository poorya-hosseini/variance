package com.practice.pooria.variance.show.chart.api.transformer;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.practice.pooria.variance.show.chart.api.dto.Point;
import com.practice.pooria.variance.show.chart.model.Defect;

public class TransformDefectToPoint {

	private TransformDefectToPoint() {
	}

	public static List<Point> getX(List<Defect> defects) {
		Function<Defect, Point> mapper = defect -> new Point(defect.getX(), defect.getValue());
		return genericMapper(defects, mapper);
	}

	public static List<Point> getY(List<Defect> defects) {
		Function<Defect, Point> mapper = defect -> new Point(defect.getY(), defect.getValue());
		return genericMapper(defects, mapper);
	}

	public static List<Point> getZ(List<Defect> defects) {
		Function<Defect, Point> mapper = defect -> new Point(defect.getZ(), defect.getValue());
		return genericMapper(defects, mapper);
	}

	private static List<Point> genericMapper(List<Defect> defects, Function<Defect, Point> mapper) {
		return defects
			.stream()
			.map(mapper)
			.collect(Collectors.toList());
	}
}
