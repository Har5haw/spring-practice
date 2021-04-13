package com.example.demo.relationShips.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = "name")})
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;


    @NonNull private String name;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private Teacher teacher;

    @ManyToMany(fetch = FetchType.LAZY,cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    @JoinTable(
            name = "student_subject",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;
}
