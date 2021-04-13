package com.example.demo.relationShips.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull private String firstName;

    @NonNull private String lastName;

    @OneToOne(cascade = {CascadeType.ALL})
    private TeacherDetails teacherDetails;

    @OneToMany(mappedBy = "teacher"
            ,cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private List<Subject> subjects;

    public void add(Subject subject){

        if (subjects == null){
            subjects = new ArrayList<>();
        }

        subject.setTeacher(this);
        subjects.add(subject);
    }
}
