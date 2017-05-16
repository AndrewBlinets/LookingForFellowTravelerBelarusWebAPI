package by.andreiblinets.entity;

import by.andreiblinets.constant.CommentConstant;
import by.andreiblinets.constant.NotificationConstant;
import by.andreiblinets.constant.UserConstant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = CommentConstant.NAME_TABLE)
public class Comment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  CommentConstant.ID_AUTHOR, nullable = false)
    private User userAuthor;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name =  CommentConstant.ID_USRER, nullable = false)
    private User user;

    @Column(name = CommentConstant.DATA, nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;

    @Column (name = CommentConstant.TEXT, nullable = false)
    private String text;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUserAuthor() {
        return userAuthor;
    }

    public void setUserAuthor(User userAuthor) {
        this.userAuthor = userAuthor;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
