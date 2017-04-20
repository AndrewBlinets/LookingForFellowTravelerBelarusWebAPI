package by.andreiblinets.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dateupdate")
public class DateUpdateInformation {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "dataupdatecity", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeUpdateCity;

    @Column(name = "dataupdateregion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeUpdateRegion;

    @Column(name = "dataupdatecountry", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeUpdateCountry;

    public DateUpdateInformation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataTimeUpdateCity() {
        return dataTimeUpdateCity;
    }

    public void setDataTimeUpdateCity(Date dataTimeUpdateCity) {
        this.dataTimeUpdateCity = dataTimeUpdateCity;
    }

    public Date getDataTimeUpdateRegion() {
        return dataTimeUpdateRegion;
    }

    public void setDataTimeUpdateRegion(Date dataTimeUpdateRegion) {
        this.dataTimeUpdateRegion = dataTimeUpdateRegion;
    }

    public Date getDataTimeUpdateCountry() {
        return dataTimeUpdateCountry;
    }

    public void setDataTimeUpdateCountry(Date dataTimeUpdateCountry) {
        this.dataTimeUpdateCountry = dataTimeUpdateCountry;
    }
}
