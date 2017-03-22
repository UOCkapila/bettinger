package bettnger.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Kapila on 2/26/2017.
 */

@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private String username;

    @NotNull
    private String password;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "userDetailsId")
    private UserDetails userDetails;

    public Account() {
    }

    public Account(String username, String password,UserDetails userDetails) {
        this.username = username;
        this.password = password;
        this.userDetails = userDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
