package by.andreiblinets.entity;

import by.andreiblinets.constant.CommentConstant;
import by.andreiblinets.constant.RequestConstant;
import by.andreiblinets.constant.UserConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = RequestConstant.NAME_TABLE)
public class Request {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  RequestConstant.ID_USRER, nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  RequestConstant.ID_CITY_OF_DEPARTURE, nullable = false)
    private City cityidOfDeparture;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  RequestConstant.ID_CITY_OF_ARRIVED, nullable = false)
    private City cityIdOfArrived;

    @Column(name = RequestConstant.DATATRIP, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column (name = RequestConstant.TIME_FROM)
    private int timeFrom;

    @Column (name = RequestConstant.TIME_TO)
    private int timeTo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(int timeFrom) {
        this.timeFrom = timeFrom;
    }

    public int getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(int timeTo) {
        this.timeTo = timeTo;
    }
}
