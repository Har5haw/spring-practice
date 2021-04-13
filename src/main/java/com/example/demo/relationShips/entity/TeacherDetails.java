package com.example.demo.relationShips.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class TeacherDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "teacherDetails",
            cascade = {
                    CascadeType.DETACH,
                    CascadeType.MERGE,
                    CascadeType.PERSIST,
                    CascadeType.REFRESH
            }
    )
    private Teacher teacher;

    @NonNull private int age;

    @NonNull private int experience;
}
