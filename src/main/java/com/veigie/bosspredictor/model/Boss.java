package com.veigie.bosspredictor.model;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "boss")
public class Boss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "race")
    private String race;
    @Column(name = "last_day_players_killed")
    private int lastDayPlayersKilled;
    @Column(name = "last_day_killed")
    private int lastDayKilled;
    @Column(name = "last_week_players_killed")
    private int lastWeekPlayersKilled;
    @Column(name = "last_week_killed")
    private int lastWeekKilled;
    @Column(name = "date")
    private Date date;

    public int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    void setRace(String race) {
        this.race = race;
    }

    public int getLastDayPlayersKilled() {
        return lastDayPlayersKilled;
    }

    void setLastDayPlayersKilled(int lastDayPlayersKilled) {
        this.lastDayPlayersKilled = lastDayPlayersKilled;
    }

    public int getLastDayKilled() {
        return lastDayKilled;
    }

    void setLastDayKilled(int lastDayKilled) {
        this.lastDayKilled = lastDayKilled;
    }

    public int getLastWeekPlayersKilled() {
        return lastWeekPlayersKilled;
    }

    void setLastWeekPlayersKilled(int lastWeekPlayersKilled) {
        this.lastWeekPlayersKilled = lastWeekPlayersKilled;
    }

    public int getLastWeekKilled() {
        return lastWeekKilled;
    }

    void setLastWeekKilled(int lastWeekKilled) {
        this.lastWeekKilled = lastWeekKilled;
    }

    public Date getDate() {
        return date;
    }

    void setDate(Date date) {
        this.date = date;
    }


}
