package com.practice.pooria.variance.show.chart.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.practice.pooria.variance.show.chart.api.dto.Point;
import com.practice.pooria.variance.show.chart.api.transformer.TransformDefectToPoint;
import com.practice.pooria.variance.show.chart.service.DefectService;

@RestController
@RequestMapping("/show-chart")
public class ChartDataApi {

	@Autowired
	private DefectService defectService;

	@GetMapping("/x")
	public List<Point> getXValues() {
		return TransformDefectToPoint.getX(defectService.getAllDefects());
	}

	@GetMapping("/y")
	public List<Point> getYValues() {
		return TransformDefectToPoint.getY(defectService.getAllDefects());
	}

	@GetMapping("/z")
	public List<Point> getZValues() {
		return TransformDefectToPoint.getZ(defectService.getAllDefects());
	}
}
