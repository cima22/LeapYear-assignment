package dssc.assignment.leapyear;

public class LeapYear {
    public static void main(String... args){
        LeapYear leapYear = new LeapYear();
        for (String arg : args) {
            String out = arg + " is";
            boolean isLeap = leapYear.isLeapYear(Integer.parseInt(arg));
            out += !isLeap ? " a common year." : " a leap year.";
            System.out.println(out);
        }

    }
    public boolean isLeapYear(int y) {
        if(y % 400 == 0)
            return true;
        if(y % 100 == 0)
            return false;
        return y % 4 == 0;
    }
}