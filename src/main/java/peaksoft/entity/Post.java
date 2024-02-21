package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.generic_id.GenericId;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "posts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Post  extends GenericId {
    private String title;
    private String description;
    private LocalDate createdAt;

    @OneToMany(mappedBy = "post",cascade = CascadeType.REMOVE)
    private List<Comment> comments;

    @OneToMany(mappedBy = "post",cascade = {CascadeType.REMOVE})
    private List<Like> likes;

    @OneToMany
    private List<Image> images;

    @ManyToOne
    private User user;




}
