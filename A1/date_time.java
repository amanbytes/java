import java.util.Date;
import java.text.SimpleDateFormat;

public class date_time {
    public static void main(String args[]){
        Date date = new Date();
        SimpleDateFormat first = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat second = new SimpleDateFormat("MM-dd-yyyy");
        SimpleDateFormat third = new SimpleDateFormat("EEEE MMMM dd yyyy");
        SimpleDateFormat fourth = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        SimpleDateFormat fifth = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a Z yyyy");
        String for_fifth = fifth.format(date);
        for_fifth=for_fifth.replace("am", "AM").replace("pm", "PM");
        SimpleDateFormat sixth = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat seventh = new SimpleDateFormat("w");
        SimpleDateFormat eigth = new SimpleDateFormat("W");
        SimpleDateFormat ninth = new SimpleDateFormat("D");
        System.out.println("Current date is : "+ first.format(date));
        System.out.println("Current date is : "+ second.format(date));
        System.out.println("Current date is : "+ third.format(date));
        System.out.println("Current date and time is : "+ fourth.format(date));
        System.out.println("Current date and time is : "+ for_fifth);
        System.out.println("Current time is : "+ sixth.format(date));
        System.out.println("Current week of year : "+ seventh.format(date));
        System.out.println("Current week of month : "+ eigth.format(date));
        System.out.println("Current day of year : "+ ninth.format(date));
    }
}
