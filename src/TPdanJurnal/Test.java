package TPdanJurnal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        String date0 = "02/11/96";
        String date1 = "02/10/96";
        String date2 = "02/12/96";

        String[] dates = new String[]{date0, date1, date2};

        try {
            for (String date : dates) {
                DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                Date newDate = formatter.parse(date);

                Date earliest = Collections.min(Collections.singletonList(newDate));
                boolean beforeEarliest = newDate.before(earliest);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}