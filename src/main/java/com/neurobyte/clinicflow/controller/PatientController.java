package com.neurobyte.clinicflow.controller;

import com.neurobyte.clinicflow.dto.request.PatientRequestDTO;
import com.neurobyte.clinicflow.dto.response.PatientResponseDTO;
import com.neurobyte.clinicflow.entity.Patient;
import com.neurobyte.clinicflow.repository.PatientRepository;
import jakarta.validation.Valid;
import lombok.ToString;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PatientController {
    private final PatientRepository repository;

    public PatientController(PatientRepository repository) {
        this.repository = repository;
    }


    @PostMapping("/save")

    public String saveDetails() {
        Patient patient = new Patient();
        patient.setName("Hello");
        patient.setAge(25);
        repository.save(patient);
        return patient.getId().toString();
    }


    @GetMapping("/find")
    public Optional<Patient> findDetails() {
        return repository.findById(5L);
    }

    @GetMapping("/update")
    public Patient updateDetails() {
        Patient patient = repository.findById(5L).get();
        patient.setAge(99);
        repository.save(patient);
        return patient;
    }

    @PostMapping("/patients")
    public PatientResponseDTO createPatient(@Valid @RequestBody PatientRequestDTO patientRequestDTO) {

    }
}
