package bettnger.models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kapila on 3/11/2017.
 */

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String type;
    private Date dateTime;
    private String information;

    @ManyToOne
    @JoinColumn(name = "userDetailId")
    private UserDetails userDetails;

    public Event() {
    }

    public Event(String type, Date dateTime, String information, UserDetails userDetails) {
        this.type = type;
        this.dateTime = dateTime;
        this.information = information;
        this.userDetails = userDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
