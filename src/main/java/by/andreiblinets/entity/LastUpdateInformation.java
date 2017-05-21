package by.andreiblinets.entity;


import by.andreiblinets.constant.LastUpdateInformationConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = LastUpdateInformationConstant.NAME_TABLE)
public class LastUpdateInformation {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = LastUpdateInformationConstant.LAST_UPDATE_CITY, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateCity;

    @Column(name = LastUpdateInformationConstant.LAST_UPDATE_REGION, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateRegion;

    @Column(name = LastUpdateInformationConstant.LAST_UPDATE_COUNTRY, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdateCountry;

    public LastUpdateInformation() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getLastUpdateCity() {
        return lastUpdateCity;
    }

    public void setLastUpdateCity(Date lastUpdateCity) {
        this.lastUpdateCity = lastUpdateCity;
    }

    public Date getLastUpdateRegion() {
        return lastUpdateRegion;
    }

    public void setLastUpdateRegion(Date lastUpdateRegion) {
        this.lastUpdateRegion = lastUpdateRegion;
    }

    public Date getLastUpdateCountry() {
        return lastUpdateCountry;
    }

    public void setLastUpdateCountry(Date lastUpdateCountry) {
        this.lastUpdateCountry = lastUpdateCountry;
    }
}
