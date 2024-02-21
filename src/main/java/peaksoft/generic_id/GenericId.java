package peaksoft.generic_id;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@MappedSuperclass

@Getter@Setter
public class GenericId {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_seg"
    )
    @SequenceGenerator(
            name = "course_seg",
            sequenceName = "course_seg",
            allocationSize = 1
    )
    private Long id;
}
