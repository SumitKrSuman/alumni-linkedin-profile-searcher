package com.alumniLinkedIn.service;

import java.util.List;
import com.alumniLinkedIn.dto.AlumniSearchRequest;
import com.alumniLinkedIn.entity.Alumni;

public interface AlumniService {

    List<Alumni> searchAndSaveAlumni(AlumniSearchRequest request);

    List<Alumni> getAllAlumni();
}
