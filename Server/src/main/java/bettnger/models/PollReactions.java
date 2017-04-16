package bettnger.models;

import java.util.Date;

/**
 * Created by Kapila on 4/15/2017.
 */
public class PollReactions {

    private int reactionId;
    private int pollId;
    private int userId;
    private Date date;

    public PollReactions() {
    }

    public PollReactions(int reactionId, int pollId, int userId, Date date) {
        this.reactionId = reactionId;
        this.pollId = pollId;
        this.userId = userId;
        this.date = date;
    }

    public int getReactionId() {
        return reactionId;
    }

    public void setReactionId(int reactionId) {
        this.reactionId = reactionId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
