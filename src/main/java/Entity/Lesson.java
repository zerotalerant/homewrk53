package Entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "lesson")
public class Lesson{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subject_name")
    private String fullname;

    @Column(name = "teacher_id")
    private String teacher;

    @Column(name = "subscriber_id")
    private Integer subscribers;


