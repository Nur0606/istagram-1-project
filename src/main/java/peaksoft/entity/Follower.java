package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import peaksoft.generic_id.GenericId;

import java.util.List;

@Entity
@Table(name = "followers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Follower  extends GenericId {
    @ManyToMany
    @JoinTable(name = "follower_subscribers",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "subscriber_id"))
    private List<User> subscribers ;

    @ManyToMany
    @JoinTable(name = "follower_subscriptions",
            joinColumns = @JoinColumn(name = "follower_id"),
            inverseJoinColumns = @JoinColumn(name = "subscription_id"))
    private List<User> subscriptions ;

    @OneToOne(fetch = FetchType.LAZY)
    private User userz;
}
