package demo02DateFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.toString());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date parse = simpleDateFormat.parse("2019-10-22 22:11:11");

        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
    }
}
