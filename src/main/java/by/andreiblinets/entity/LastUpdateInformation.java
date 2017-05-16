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
    private Date dataTimeUpdateRegion;

    @Column(name = LastUpdateInformationConstant.LAST_UPDATE_COUNTRY, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeUpdateCountry;

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
