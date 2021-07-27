package ks.hs.emirim.hyojin.kha;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec t1 = tabHost.newTabSpec("one").setIndicator("Photo 01");
        t1.setContent(R.id.img01);
        tabHost.addTab(t1);

        TabHost.TabSpec t2 = tabHost.newTabSpec("two").setIndicator("Photo 02");
        t2.setContent(R.id.img02);
        tabHost.addTab(t2);

        TabHost.TabSpec t3 = tabHost.newTabSpec("three").setIndicator("Photo 03");
        t3.setContent(R.id.img03);
        tabHost.addTab(t3);

        TabHost.TabSpec t4 = tabHost.newTabSpec("four").setIndicator("Photo 04");
        t4.setContent(R.id.img04);
        tabHost.addTab(t4);

        tabHost.setCurrentTab(1);
    }
}