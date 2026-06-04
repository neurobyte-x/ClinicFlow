package com.neurobyte.clinicflow.repository;

import com.neurobyte.clinicflow.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
