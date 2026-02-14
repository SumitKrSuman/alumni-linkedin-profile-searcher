package com.alumniLinkedIn.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AlumniSearchRequest {

    @NotBlank(message = "University name is required")
    private String university;

    @NotBlank(message = "Designation is required")
    private String designation;

    @Positive(message = "Passout year must be positive")
    private Integer passoutYear;

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getPassoutYear() {
		return passoutYear;
	}

	public void setPassoutYear(Integer passoutYear) {
		this.passoutYear = passoutYear;
	}
}
