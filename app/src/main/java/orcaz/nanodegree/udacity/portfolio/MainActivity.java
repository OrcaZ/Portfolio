package orcaz.nanodegree.udacity.portfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        String app = null;
        switch (view.getId()){
            case R.id.movie_app_button:
                app = "movie app!";
                break;
            case R.id.alexandria_app_button:
                app = "alexandria app!";
                break;
            case R.id.scores_app_button:
                app = "scores app!";
                break;
            case R.id.build_it_bigger_app_button:
                app = "build it bigger app!";
                break;
            case R.id.xyz_reader_app_button:
                app = "xyz reader app!";
                break;
            case R.id.capstone_app_button:
                app = "capstone app!";
                break;
        }
        if(app != null)
            Toast.makeText(this, "This button will launch my " + app, Toast.LENGTH_SHORT).show();
    }
}
