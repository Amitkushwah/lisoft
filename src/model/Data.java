package model;

import java.util.Date;

public class Data
{
 String bt,snmae,en,branch,date,timein,timeout;
 int Sno;
Date date2;
    public void setSno(int Sno) {
        this.Sno = Sno;
    }

    public int getSno() {
        return Sno;
    }
    public Date getDate2() {
        return date2;
    }

    public void setDate2(Date date2) {
        this.date2 = date2;
    }
   
    public void setBt(String bt) {
        this.bt = bt;
    }

    public void setSnmae(String snmae) {
        this.snmae = snmae;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBt() {
        return bt;
    }

    public String getSnmae() {
        return snmae;
    }

    public String getEn() {
        return en;
    }

    public String getBranch() {
        return branch;
    }

    public String getDate() {
        return date;
    }

    public String getTimein() {
        return timein;
    }

    public String getTimeout() {
        return timeout;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTimein(String timein) {
        this.timein = timein;
    }

    public void setTimeout(String timeout) {
        this.timeout = timeout;
    }
 
}
