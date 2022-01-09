package com.practice.pooria.variance.show.chart.serviceimpl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.practice.pooria.variance.show.chart.config.DefectEndpointProperties;
import com.practice.pooria.variance.show.chart.model.Defect;
import com.practice.pooria.variance.show.chart.service.DefectService;

@Service
public class DefectServiceImpl implements DefectService {

	@Autowired
	private DefectEndpointProperties properties;

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<Defect> getAllDefects() {
		ResponseEntity<Defect[]> responseEntity = restTemplate.getForEntity(
			properties.getEndpoint(),
			Defect[].class);
		return responseEntity.getBody() == null ? Collections.emptyList() : Arrays.asList(responseEntity.getBody());
	}
}
