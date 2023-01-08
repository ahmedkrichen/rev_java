import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class TraitmentC {
    private Connection con=Connect.getConnection();

    public void addConsultation(Consultation c){
        try {
            PreparedStatement prep=con.prepareStatement("INSERT INTO CONSULTATION values('2023-04-04',?,?)");
            // prep.setDate(1, c.getDate());
            prep.setInt(1, c.getCin());
            prep.setString(2, c.getDiag());
            prep.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Integer> getCin()
    {   
        ResultSet res=null;
        ArrayList<Integer> lis=new ArrayList<>();
        try {
            PreparedStatement prep =con.prepareStatement("select cinpatient from patient");
            res=prep.executeQuery();
            while(res.next())
            {
                lis.add(res.getInt(1));

            }
        } catch (Exception e) {
            System.out.println(e);

        }
        return lis;
    }

    public LinkedHashMap<Consultation,Patient> Consultation()
    {   
        ResultSet res=null;
        
        Connection con=Connect.getConnection();
        LinkedHashMap<Consultation,Patient> map=new LinkedHashMap<>();
        try {
            PreparedStatement prep =con.prepareStatement("select * from Consultation c,patient p where c.cinpatient=p.cinpatient order by c.date DESC;");  
            res=prep.executeQuery();
            while(res.next())
            {
                Consultation c=new Consultation(res.getDate(1), res.getInt(2), res.getString(3));
                Patient p=new Patient(res.getInt(2), res.getString(5), res.getString(6), null);
                map.put(c,p);
            }
        } catch (Exception e) {
            System.out.println(e);

        }
        return map;
    }

    
}
