package com.practice.pooria.variance.add.defect.api.transformer;

import org.springframework.stereotype.Component;
import com.practice.pooria.variance.add.defect.api.dto.DefectDto;
import com.practice.pooria.variance.add.defect.entity.Defect;

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
