package hellojpa;

import javax.management.relation.Role;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MBR")
public class Member {

    @Id //PK가 뭔지 Java에서 알려주는 용도
    private Long id;

    @Column(name = "name", insertable = true, updatable = true) //insert나 update를 할때 이 컬럼을 반영할것인지 아닌지 결정
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public Member(){

    }
}
