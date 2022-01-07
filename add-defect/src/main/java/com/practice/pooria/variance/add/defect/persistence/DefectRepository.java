package com.practice.pooria.variance.add.defect.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practice.pooria.variance.add.defect.entity.Defect;

public interface DefectRepository extends JpaRepository<Defect, Long> {

}
