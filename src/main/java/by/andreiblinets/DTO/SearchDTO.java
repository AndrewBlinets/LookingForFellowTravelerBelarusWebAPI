package by.andreiblinets.DTO;

public class SearchDTO {

    private int idCityOfDeparture;
    private int idCityOfArrived;
    private String data;

    public SearchDTO() {
    }

    public int getIdCityOfDeparture() {
        return idCityOfDeparture;
    }

    public void setIdCityOfDeparture(int idCityOfDeparture) {
        this.idCityOfDeparture = idCityOfDeparture;
    }

    public int getIdCityOfArrived() {
        return idCityOfArrived;
    }

    public void setIdCityOfArrived(int idCityOfArrived) {
        this.idCityOfArrived = idCityOfArrived;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
