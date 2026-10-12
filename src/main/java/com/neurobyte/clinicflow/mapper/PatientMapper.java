package com.neurobyte.clinicflow.mapper;

import com.neurobyte.clinicflow.dto.request.PatientRequestDTO;
import com.neurobyte.clinicflow.dto.response.PatientResponseDTO;
import com.neurobyte.clinicflow.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class PatientMapper {

    public Patient toEntity(PatientRequestDTO request){

    }

    public PatientResponseDTO toResponse(Patient patient){

    }
}
