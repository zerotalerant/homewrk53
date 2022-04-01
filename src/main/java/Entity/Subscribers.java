package Entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "subscribers")
public class Subscribers{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "subscribe_date")
    private Time subscribeDate;

    @Column(name = "end_of_subscribe")
    private Time subscribeEnd;

    @Column(name = "lesson_id")
    private Integer lessonId;

    @Column(name = "subscribe_id")
    private Integer subscId;

    @Column(name = "teacher_id")
    private Integer teacherId;
    }