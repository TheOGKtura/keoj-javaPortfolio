import java.text.DecimalFormat;

public class lab5_program2 {
    public static void main(String[] args) {
        PersonInfo me = new PersonInfo("Keoj Lyle M. Sioco", "Concepcion, Malabon City", 20, "09563860386");
        PersonInfo lance = new PersonInfo("Lance R. Syjuco", "Bayan, Malabon City", 21, "09523749582");
        PersonInfo keena = new PersonInfo("Keena Rielle Sioco", "Concepcion, Malabon City", 16, "09153450203");
    
        showInformation(me);
        showInformation(keena);
        showInformation(lance);
    }

    public static void showInformation(PersonInfo i) {
        // Needed for formatting the number to the correct pattern
        DecimalFormat df = new DecimalFormat("###########");
        
        System.out.print(i.getPersonInfoName() + " " + i.getPersonInfoAddress());
        System.out.print(" " + i.getPersonInfoAge());
        System.out.print(" 0" + df.format(i.getPersonInfoPhoneNum()));
        System.out.println();
    }
}
