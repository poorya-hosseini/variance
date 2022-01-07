package com.practice.pooria.varicnce.chart.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.pooria.varicnce.chart.entity.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long> {

}
