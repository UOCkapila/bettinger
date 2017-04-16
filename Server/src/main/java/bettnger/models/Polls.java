package bettnger.models;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by Kapila on 4/15/2017.
 */

@Entity
@Table(name= "Polls")
public class Polls {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int pollId;
    private String name;
    private int themeId;
    private String hashtagName;
    private String description;
    private String Summary;
    private int photoId;
    private int preferenceId;
    private Date expireDate;

    public Polls() {
    }

    public Polls(String name, int themeId, String hashtagName, String description, String summary, int photoId, int preferenceId, Date expireDate) {
        this.name = name;
        this.themeId = themeId;
        this.hashtagName = hashtagName;
        this.description = description;
        Summary = summary;
        this.photoId = photoId;
        this.preferenceId = preferenceId;
        this.expireDate = expireDate;
    }

    public int getPollId() {
        return pollId;
    }

    public void setPollId(int pollId) {
        this.pollId = pollId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public void setHashtagName(String hashtagName) {
        this.hashtagName = hashtagName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getPreferenceId() {
        return preferenceId;
    }

    public void setPreferenceId(int preferenceId) {
        this.preferenceId = preferenceId;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
}
