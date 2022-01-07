package com.practice.pooria.variance.add.defect.api;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.practice.pooria.variance.add.defect.api.dto.DefectDto;
import com.practice.pooria.variance.add.defect.api.transformer.DefectTransformer;
import com.practice.pooria.variance.add.defect.entity.Defect;
import com.practice.pooria.variance.add.defect.persistence.DefectRepository;

@RestController
public class DefectApi {

	@Autowired
	private DefectRepository defectRepository;

	@Autowired
	private DefectTransformer defectTransformer;

	@GetMapping("/defects")
	public List<DefectDto> all() {
		return defectRepository
			.findAll()
			.stream()
			.map(defectTransformer::transform)
			.collect(Collectors.toList());
	}

	@PostMapping(value = "/defects", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public @ResponseBody Defect newDefect(DefectDto defect) {
		return defectRepository.save(defectTransformer.transform(defect));
	}

	@DeleteMapping("/defects")
	public void deletedDefect(@RequestBody DefectDto defect) {
		defectRepository.delete(defectTransformer.transform(defect));
	}
}
