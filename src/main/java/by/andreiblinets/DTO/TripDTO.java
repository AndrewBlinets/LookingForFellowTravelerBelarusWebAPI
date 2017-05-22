package by.andreiblinets.DTO;


import java.util.Date;

public class TripDTO {

    private long cityidOfDeparture;
    private long cityIdOfArrived;
    private Date dataOfDeparture;
    private Date timeOfDeparture;
    private int compensation;
    private int countFree;
    private String information;
    private int departureDevialton;
    private String tokenUser;

    public String getTokenUser() {
        return tokenUser;
    }

    public void setTokenUser(String tokenUser) {
        this.tokenUser = tokenUser;
    }

    public long getCityidOfDeparture() {
        return cityidOfDeparture;
    }

    public void setCityidOfDeparture(long cityidOfDeparture) {
        this.cityidOfDeparture = cityidOfDeparture;
    }

    public long getCityIdOfArrived() {
        return cityIdOfArrived;
    }

    public void setCityIdOfArrived(long cityIdOfArrived) {
        this.cityIdOfArrived = cityIdOfArrived;
    }

    public Date getDataOfDeparture() {
        return dataOfDeparture;
    }

    public void setDataOfDeparture(Date dataOfDeparture) {
        this.dataOfDeparture = dataOfDeparture;
    }

    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(Date timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public int getCompensation() {
        return compensation;
    }

    public void setCompensation(int compensation) {
        this.compensation = compensation;
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
}
