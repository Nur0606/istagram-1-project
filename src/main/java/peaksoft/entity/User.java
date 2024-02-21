package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.generic_id.GenericId;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "users")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class User  extends GenericId {
    @Column(unique = true)
    private String userName;
    private String password;
    @Column(unique = true)
    private String email;
    private String phoneNumber;


    @OneToMany(mappedBy = "user",cascade = {REMOVE,REFRESH})
    private List<Post> posts;

    @OneToOne(mappedBy = "userz",cascade = {REMOVE,REFRESH,PERSIST})
    private Follower follower;

    @OneToOne(mappedBy = "user",cascade = {REMOVE,REFRESH,PERSIST})
    private UserInfo userInfo;

    @ManyToMany(mappedBy = "users",cascade = {REMOVE,REFRESH})
    private List<Comment>comments;

    @OneToOne(cascade = {REMOVE,REFRESH})
    private Like like;

    @ManyToOne(cascade = {REMOVE,REFRESH})
    private Image image;

}
