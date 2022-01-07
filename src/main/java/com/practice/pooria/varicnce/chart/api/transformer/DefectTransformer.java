package com.practice.pooria.varicnce.chart.api.transformer;

import org.springframework.stereotype.Component;
import com.practice.pooria.varicnce.chart.api.DTO.DefectDto;
import com.practice.pooria.varicnce.chart.entity.Defect;

@Component
public class DefectTransformer {

	public Defect transform(DefectDto dto) {
		Defect defect = new Defect();
		defect.setId(dto.getId());
		defect.setX(dto.getX());
		defect.setY(dto.getY());
		defect.setZ(dto.getZ());
		defect.setValue(dto.getValue());
		return defect;
	}

	public DefectDto transform(Defect defect) {
		return new DefectDto
			.Builder()
			.setId(defect.getId())
			.setX(defect.getX())
			.setY(defect.getY())
			.setZ(defect.getZ())
			.setValue(defect.getValue())
			.build();
	}
}
