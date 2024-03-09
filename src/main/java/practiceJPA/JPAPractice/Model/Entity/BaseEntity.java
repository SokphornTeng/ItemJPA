package practiceJPA.JPAPractice.Model.Entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
// use with createAt and updatedAt
//@EntityListeners(AuditingEntityListener.class)
// use generate of ID is for dynamic
public abstract class BaseEntity<ID extends Serializable> {

    // we use BaseEntity for extends other which use id and use abstract for can't create object
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

//    // can't update in field of createAt but it can update when create
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(updatable = false)
//    @CreatedDate
//    private Date createdAt;
//
//
//    //when create it can't have value or add value
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(insertable = false)
//    @LastModifiedDate
//    private Date updatedAt;


    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

}
