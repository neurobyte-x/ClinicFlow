package com.neurobyte.clinicflow.service;

import com.neurobyte.clinicflow.dto.request.PatientRequestDTO;
import com.neurobyte.clinicflow.dto.response.PatientResponseDTO;
import com.neurobyte.clinicflow.mapper.PatientMapper;
import com.neurobyte.clinicflow.repository.PatientRepository;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientMapper patientMapper;
    private final PatientRepository patientRepository;

    // Constructor injection
    public PatientService(PatientMapper patientMapper, PatientRepository patientRepository) {
        this.patientMapper = patientMapper;
        this.patientRepository = patientRepository;
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO) {
    }
}
