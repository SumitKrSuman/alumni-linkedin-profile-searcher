package com.alumniLinkedIn.service;

import com.alumniLinkedIn.dto.AlumniSearchRequest;
import com.alumniLinkedIn.entity.Alumni;
import com.alumniLinkedIn.repository.AlumniRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlumniServiceImpl implements AlumniService {

    private final AlumniRepository alumniRepository;

    @Override
    public List<Alumni> searchAndSaveAlumni(AlumniSearchRequest request) {

        List<Alumni> alumniList = new ArrayList<>();

        Alumni alumni = Alumni.builder()
                .name("John Doe")
                .currentRole(request.getDesignation())
                .university(request.getUniversity())
                .location("New York")
                .linkedinHeadline("Software Engineer at XYZ")
                .passoutYear(request.getPassoutYear())
                .build();

        alumniList.add(alumni);

        return alumniRepository.saveAll(alumniList);
    }

    @Override
    public List<Alumni> getAllAlumni() {
        return alumniRepository.findAll();
    }
}
