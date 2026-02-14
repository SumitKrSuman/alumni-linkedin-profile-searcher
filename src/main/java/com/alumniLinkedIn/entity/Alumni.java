package com.alumniLinkedIn.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "alumni")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alumni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "current_position", length = 100)
    private String currentRole;

    @Column(name = "university", length = 150)
    private String university;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "linkedin_headline", length = 255)
    private String linkedinHeadline;

    @Column(name = "passout_year")
    private Integer passoutYear;
}
