package ks.hs.emirim.hyojin.kha;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarActivity extends AppCompatActivity {
    CalendarView calendarView;
    TextView today;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);

        today = findViewById(R.id.today);
        calendarView = findViewById(R.id.calendarView);

        DataFormat formatter = new DataFormat("yyyy년 MM월 dd일");
            Date date = new Date(calendarView.getDate());
            today.setText(formatter.formate(date));

            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
                @Override
                public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                    String day;
                    day = year + "년" + (month+1) + "월" + dayOfMonth + "일";
                    today.setText(day);
                }
            });
    }
}
