package bettnger.models;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Kapila on 3/19/2017.
 */
@Entity
@Table(name="UserDetails")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToOne (mappedBy = "userDetails")
    private Account account;

    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    @OneToMany(mappedBy = "userDetails", cascade = CascadeType.ALL)
    private Set<Event> event;

    public UserDetails(Account account, String name, String email, String address, String phoneNumber, Set<Event> event) {
        this.account = account;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.event = event;
    }

    public UserDetails() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Set<Event> getEvent() {
        return event;
    }

    public void setEvent(Set<Event> event) {
        this.event = event;
    }
}
