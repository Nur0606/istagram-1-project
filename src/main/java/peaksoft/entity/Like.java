package peaksoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import peaksoft.generic_id.GenericId;

@Entity
@Table(name = "likes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Like extends GenericId {
    private boolean isLike;

    @OneToOne
    private User user;

    @ManyToOne
    private Comment comment;

    @ManyToOne
    private Post post;

}
