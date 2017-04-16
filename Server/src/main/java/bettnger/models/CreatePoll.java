package bettnger.models;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import java.util.Date;

/**
 * Created by Kapila on 4/15/2017.
 */

@Entity
@Table(name = "CreatePoll")
public class CreatePoll {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int createPollId;
    private int pollId;
    private int userId;
    private Date createdTime;
    private String createdLocation;

    public CreatePoll() {
    }

    public CreatePoll(int pollId, int userId, Date createdTime, String createdLocation) {

        this.pollId = pollId;
        this.userId = userId;
        this.createdTime = createdTime;
        this.createdLocation = createdLocation;
    }

    public int getCreatePollId() {
        return createPollId;
    }

    public void setCreatePollId(int createPollId) {
        this.createPollId = createPollId;
    }

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getCreatedLocation() {
        return createdLocation;
    }

    public void setCreatedLocation(String createdLocation) {
        this.createdLocation = createdLocation;
    }

}
