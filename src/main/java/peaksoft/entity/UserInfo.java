package peaksoft.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import peaksoft.enums.Gender;
import peaksoft.generic_id.GenericId;

@Entity
@Table(name = "user_infos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserInfo  extends GenericId {
    private String fullName;
    private String biografia;
    private Gender gender;
    private String image;

    @OneToOne
    private User user;


}
