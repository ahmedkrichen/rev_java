import java.sql.Date;

public class Consultation {
private Date date;
private int Cin;
private String diag;


public Consultation(Date date, int cin, String diag) {
    this.date = date;
    Cin = cin;
    this.diag = diag;
}
public Date getDate() {
    return date;
}
public void setDate(Date date) {
    this.date = date;
}
public int getCin() {
    return Cin;
}
public void setCin(int cin) {
    Cin = cin;
}
public String getDiag() {
    return diag;
}
public void setDiag(String diag) {
    this.diag = diag;
}

}
