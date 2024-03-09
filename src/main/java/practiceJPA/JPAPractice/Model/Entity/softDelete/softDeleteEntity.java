package practiceJPA.JPAPractice.Model.Entity.softDelete;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import practiceJPA.JPAPractice.Model.Entity.BaseAuditEntity;

import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
public abstract class softDeleteEntity<ID extends Serializable> extends BaseAuditEntity<ID> {

    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
