package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.generic_id.GenericId;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "comments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Comment extends GenericId {
    private String comment;
    private LocalDate createdAt;


    @ManyToMany
    private List <User> users;

    @ManyToOne
    private Post post;


    @OneToMany(mappedBy = "comment",cascade = CascadeType.REMOVE)
    private List<Like> likes;

}
