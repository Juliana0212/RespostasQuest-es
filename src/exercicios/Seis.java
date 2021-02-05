package exercicios;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Seis {
	
    public static void main(String[] args) throws ParseException {
        
        DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
               
        Date d1 = df.parse ("10/12/2020");
        Date d2 = df.parse ("25/12/2020");
        
        
        System.out.println(d1);
        System.out.println(d2);
        
        long dt = (d2.getTime() - d1.getTime()) + 3600000; // 1 hora para compensar horário de verão
        System.out.println ("Diferença entre as datas: " + dt / 86400000L); 
    }
}

