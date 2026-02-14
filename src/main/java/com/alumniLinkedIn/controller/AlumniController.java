package com.alumniLinkedIn.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.alumniLinkedIn.dto.AlumniSearchRequest;
import com.alumniLinkedIn.dto.ApiResponse;
import com.alumniLinkedIn.entity.Alumni;
import com.alumniLinkedIn.service.AlumniService;
import java.util.List;

@RestController
@RequestMapping("/api/alumni")
@RequiredArgsConstructor
public class AlumniController {

    private final AlumniService alumniService;

    //POST:- /api/alumni/search
    @PostMapping("/search")
    public ApiResponse<List<Alumni>> searchAlumni(
            @RequestBody AlumniSearchRequest request) {

        return ApiResponse.<List<Alumni>>builder()
                .status("success")
                .data(alumniService.searchAndSaveAlumni(request))
                .build();
    }

    // GET:- /api/alumni/all
    @GetMapping("/all")
    public ApiResponse<List<Alumni>> getAllAlumni() {

        return ApiResponse.<List<Alumni>>builder()
                .status("success")
                .data(alumniService.getAllAlumni())
                .build();
    }
}

