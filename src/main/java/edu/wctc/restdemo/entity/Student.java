package edu.wctc.restdemo.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="gpa")
    private String gpa;

    @ManyToOne()
    @JoinColumn(name="address_id")
    private Address address;

    @ElementCollection
    @CollectionTable(name="student_language", joinColumns = @JoinColumn(name="student_id"))
    @Column(name="language")
    private List<String> languages;

    @Column(name="date_enrolled")
    private LocalDate dateEnrolled;
}
