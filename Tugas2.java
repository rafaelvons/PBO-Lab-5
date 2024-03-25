import java.text.DateFormat;
import java.util.Date;

public class Tugas2 {
    public static void main(String[] args) {
        
        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        Date currentDate = new Date();

        
        String tanggalDiformat = dateFormat.format(currentDate);
        System.out.println("Tanggal dan waktu saat ini: " + tanggalDiformat);

        
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.LONG);
        String tanggalDiformat2 = dateFormat2.format(currentDate);
        System.out.println("Tanggal saat ini: " + tanggalDiformat2);

       
        DateFormat dateFormat3 = DateFormat.getTimeInstance(DateFormat.SHORT);
        String waktuDiformat = dateFormat3.format(currentDate);
        System.out.println("Waktu saat ini: " + waktuDiformat);
    }
}


