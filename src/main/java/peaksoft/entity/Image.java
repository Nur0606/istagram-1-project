package peaksoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;
import peaksoft.generic_id.GenericId;


import java.util.List;

@Entity
@Table(name = "images")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Image extends GenericId {
    private String imageURL;

    @OneToMany()
    private List<User> users;

    @ManyToOne
    private Post post;



}
