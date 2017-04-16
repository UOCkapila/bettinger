package bettnger.models;

import javax.persistence.*;

/**
 * Created by Kapila on 4/15/2017.
 */
@Entity
@Table(name = "Theme")
public class Theme {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int themeId ;
    private String name;
    private String description;

    public Theme() {
    }

    public Theme(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
