package ks.hs.emirim.hyojin.kha;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec t1 = tabHost.newTabSpec("one").setIndicator("월간",getResources().getDrawable(R.drawable.img01));
        t1.setContent(R.id.img01);
        tabHost.addTab(t1);

        TabHost.TabSpec t2 = tabHost.newTabSpec("two").setIndicator("주간",getResources().getDrawable(R.drawable.img02));
        t2.setContent(R.id.img02);
        tabHost.addTab(t2);

        TabHost.TabSpec t3 = tabHost.newTabSpec("three").setIndicator("일간",getResources().getDrawable(R.drawable.img03));
        t3.setContent(R.id.img03);
        tabHost.addTab(t3);

        TabHost.TabSpec t4 = tabHost.newTabSpec("four").setIndicator("통계",getResources().getDrawable(R.drawable.img04));
        t4.setContent(R.id.img04);
        tabHost.addTab(t4);

        tabHost.setCurrentTab(1);

        for(int i = 0; i < tabHost.getTabWidget().getChildCount(); i++){
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#FFFFD2"));
        }


        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                TextView tp =(TextView)tabHost.getCurrentTabView().findViewById(android.R.id.title);
                tp.setTextColor(Color.parseColor("#808080"));
            }
        });
        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                TextView tp =(TextView)tabHost.getCurrentTabView().findViewById(android.R.id.title);
                tp.setTextColor(Color.parseColor("#000000"));

                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    tabHost.getTabWidget().getChildAt(i)
                            .setBackgroundColor(Color.parseColor("#FFFFD2")); // unselected
                }

                tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab())
                        .setBackgroundColor(Color.parseColor("#FAED7D")); // selected
            }

        });

    }
}