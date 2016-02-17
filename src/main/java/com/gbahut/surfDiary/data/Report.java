package com.gbahut.surfDiary.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Report
{
    @Id
    @GeneratedValue
    private Long id;

    @Column private String date;

  /*  @Column private double wind;

    @Column private String windDir;

    @Column private double waveHeight;

    @Column private double waveDir;

    @Column private int periodTps;

    @Column private int periodTpz;

    @Column private String spot;*/

    @Column private double waveScore;

    @Column private double surfingScore;

    @Column private String comments;

/*
    public Report( String date, double wind, String windDir,
                  double waveHeight, double waveDir, int periodTps,
                  int periodTpz, String spot, double waveScore,
                  double surfingScore, String comments)
    {
        this.date = date;
        this.wind = wind;
        this.windDir = windDir;
        this.waveHeight = waveHeight;
        this.waveDir = waveDir;
        this.periodTps = periodTps;
        this.periodTpz = periodTpz;
        this.spot = spot;
        this.waveScore = waveScore;
        this.surfingScore = surfingScore;
        this.comments = comments;
    }
*/

    public Report(String date, double waveScore, double surfingScore,
                  String comments)
    {
        this.date = date;
        this.waveScore = waveScore;
        this.surfingScore = surfingScore;
        this.comments = comments;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    /* public double getWind()
     {
         return wind;
     }

     public void setWind(double wind)
     {
         this.wind = wind;
     }

     public String getWindDir()
     {
         return windDir;
     }

     public void setWindDir(String windDir)
     {
         this.windDir = windDir;
     }

     public double getWaveHeight()
     {
         return waveHeight;
     }

     public void setWaveHeight(double waveHeight)
     {
         this.waveHeight = waveHeight;
     }

     public double getWaveDir()
     {
         return waveDir;
     }

     public void setWaveDir(double waveDir)
     {
         this.waveDir = waveDir;
     }

     public int getPeriodTps()
     {
         return periodTps;
     }

     public void setPeriodTps(int periodTps)
     {
         this.periodTps = periodTps;
     }

     public int getPeriodTpz()
     {
         return periodTpz;
     }

     public void setPeriodTpz(int periodTpz)
     {
         this.periodTpz = periodTpz;
     }

     public String getSpot()
     {
         return spot;
     }

     public void setSpot(String spot)
     {
         this.spot = spot;
     }
 */
    public double getWaveScore()
    {
        return waveScore;
    }

    public void setWaveScore(double waveScore)
    {
        this.waveScore = waveScore;
    }

    public double getSurfingScore()
    {
        return surfingScore;
    }

    public void setSurfingScore(double surfingScore)
    {
        this.surfingScore = surfingScore;
    }

    public String getComments()
    {
        return comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }

}
