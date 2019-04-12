//Shaymaa Al-Sharbati, S1512130

package gcu.mpd.s1512130;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        ReadRss readRss = new ReadRss(this, recyclerView);
        readRss.execute();
    }

}
}

