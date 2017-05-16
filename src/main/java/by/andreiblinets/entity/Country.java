package by.andreiblinets.entity;

import by.andreiblinets.constant.CountryConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = CountryConstant.NAME_TABLE)
public class Country {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = CountryConstant.NAME_COUNTRY, nullable = false)
    private String name;

    @Column(name = CountryConstant.NAME_CURRENCIES, nullable = false)
    private String currencies;

    public Country() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String currencies) {
        this.currencies = currencies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
