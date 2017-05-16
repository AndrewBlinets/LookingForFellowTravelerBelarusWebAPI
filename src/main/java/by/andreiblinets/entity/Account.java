package by.andreiblinets.entity;

import by.andreiblinets.constant.AccountConstant;
import by.andreiblinets.constant.UserConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table (name = AccountConstant.TABLE_NAME)
public class Account {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = AccountConstant.EMAIL, nullable = false)
    private String email;

    @Column(name = AccountConstant.HASH_PASSWORD, nullable = false)
    private String hashPassword;

    public Account() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
}
