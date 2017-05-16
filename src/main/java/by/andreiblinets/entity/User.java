package by.andreiblinets.entity;

import by.andreiblinets.constant.UserConstant;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

/**
 * This class represents the User model.
 *
 * @author Andrew Blinets
 */

@Entity
@Table(name = UserConstant.NAME_TABLE)
public class User {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = UserConstant.NAME, nullable = false)
    private String name;

    @Column(name = UserConstant.SURNAME, nullable = false)
    private String surname;

    @Column(name = UserConstant.PHONE, nullable = false)
    private String phone;

    @Column(name = UserConstant.EMAIL, nullable = false)
    private String email;

    @Column(name = UserConstant.HASH_PASSWORD, nullable = false)
    private String hashPassword;

    @Column(name = UserConstant.RATING)
    private long rating;

    @Column(name = UserConstant.DATA_REGISTRATION, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTimeRegistration;

    @Column(name = UserConstant.ABOUT_USER)
    private String aboutUser;

    @Column (name = UserConstant.FOTO)
    private String foto;

    @Column (name = UserConstant.USER_ROLE,nullable = false)
    private String roleUser;


    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public Date getDataTimeRegistration() {
        return dataTimeRegistration;
    }

    public void setDataTimeRegistration(Date dataTimeRegistration) {
        this.dataTimeRegistration = dataTimeRegistration;
    }

    public String getAboutUser() {
        return aboutUser;
    }

    public void setAboutUser(String aboutUser) {
        this.aboutUser = aboutUser;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }
}
