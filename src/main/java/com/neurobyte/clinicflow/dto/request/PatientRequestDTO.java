package com.neurobyte.clinicflow.dto.request;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PatientRequestDTO {
    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @Past
    @NotNull
    private LocalDate dateOfBirth;
    @Size(min=10, max=10)
    @Pattern(regexp = "^[0-9]+$")
    @NotBlank
    private String phoneNumber;
}
