package bettnger.models;

import javax.persistence.*;

/**
 * Created by Kapila on 4/15/2017.
 */
@Entity
@Table(name = "PollOption")
public class PollOption {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int pollOptionID;
    private int pollID;
    private String name;
    private String description;
    private int photoId;
    private String count;
}
