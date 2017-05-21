package by.andreiblinets.entity;

import by.andreiblinets.constant.TripConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = TripConstant.NAME_TABLE)
public class Trip {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  TripConstant.ID_CITY_OF_DEPARTURE, nullable = false)
    private City cityidOfDeparture;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  TripConstant.ID_CITY_OF_ARRIVED, nullable = false)
    private City cityIdOfArrived;

    @Column(name = TripConstant.DATA_OF_DEPARTURE, nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataOfDeparture;

    @Column(name = TripConstant.TIME_OF_DEPARTURE, nullable = false)
    @Temporal(TemporalType.TIME)
    private Date timeOfDeparture;

    @Column (name = TripConstant.COMPENSATION )
    private int compensation;

    @Column (name = TripConstant.TRANSPORD_ID )
    private int transportId;

    @Column (name = TripConstant.COUNT_FREE )
    private int countFree;

    @Column (name = TripConstant.INFORMATION )
    private String information;

    @Column (name = TripConstant.DEPARTURE_DEVIALTON )
    private int departureDevialton;

    @Column (name = TripConstant.AUTO_ADD )
    private boolean autoAdd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public City getCityidOfDeparture() {
        return cityidOfDeparture;
    }

    public void setCityidOfDeparture(City cityidOfDeparture) {
        this.cityidOfDeparture = cityidOfDeparture;
    }

    public City getCityIdOfArrived() {
        return cityIdOfArrived;
    }

    public void setCityIdOfArrived(City cityIdOfArrived) {
        this.cityIdOfArrived = cityIdOfArrived;
    }

    public Date getDataOfDeparture() {
        return dataOfDeparture;
    }

    public void setDataOfDeparture(Date dataOfDeparture) {
        this.dataOfDeparture = dataOfDeparture;
    }

    public int getCompensation() {
        return compensation;
    }

    public void setCompensation(int compensation) {
        this.compensation = compensation;
    }

    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public int getCountFree() {
        return countFree;
    }

    public void setCountFree(int countFree) {
        this.countFree = countFree;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getDepartureDevialton() {
        return departureDevialton;
    }

    public void setDepartureDevialton(int departureDevialton) {
        this.departureDevialton = departureDevialton;
    }

    public boolean isAutoAdd() {
        return autoAdd;
    }

    public void setAutoAdd(boolean autoAdd) {
        this.autoAdd = autoAdd;
    }

    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Date timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }
}
