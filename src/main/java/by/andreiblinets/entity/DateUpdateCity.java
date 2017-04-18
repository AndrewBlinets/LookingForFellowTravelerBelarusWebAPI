package by.andreiblinets.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dateupdate")
public class DateUpdateCity {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "dataupdatecity", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeUpdate;

    public DateUpdateCity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataTimeUpdate() {
        return dataTimeUpdate;
    }

    public void setDataTimeUpdate(Date dataTimeUpdate) {
        this.dataTimeUpdate = dataTimeUpdate;
    }

    @Override
    public String toString() {
        return "DateUpdateCity{" +
                "id=" + id +
                ", dataTimeUpdate=" + dataTimeUpdate +
                '}';
    }
}
