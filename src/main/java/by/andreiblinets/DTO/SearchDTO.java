package by.andreiblinets.DTO;

import java.util.Date;

public class SearchDTO {

    private long idCityOfDeparture;
    private long idCityOfArrived;
    private Date data;

    public SearchDTO() {
    }

    public long getIdCityOfDeparture() {
        return idCityOfDeparture;
    }

    public void setIdCityOfDeparture(long idCityOfDeparture) {
        this.idCityOfDeparture = idCityOfDeparture;
    }

    public long getIdCityOfArrived() {
        return idCityOfArrived;
    }

    public void setIdCityOfArrived(long idCityOfArrived) {
        this.idCityOfArrived = idCityOfArrived;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }
}
