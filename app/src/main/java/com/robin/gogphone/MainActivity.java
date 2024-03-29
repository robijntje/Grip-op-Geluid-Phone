package com.robin.gogphone;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.robin.gogphone.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public void navigateSync() {
        Navigation.findNavController(this, R.id.nav_host_fragment_activity_main).navigate(R.id.navigation_sync);
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //Dit is de code voor de grafiek. Op dit moment maak de grafiek gebruk van mock data.
         GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[] {
                //Hieronder zijn de data points. Hier dient uiteindelijk echte data te worden toegevoegd.
                new DataPoint(0, 7),
                new DataPoint(1, 5),
                new DataPoint(2, 1),
                new DataPoint(3, 9),
                new DataPoint(4, 8)
        });
        //Deze code maakt het scrollen in inzoomen mogelijk
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.addSeries(series);

        //Loop test
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

     //   binding.buttonnts.setOnClickListener (new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
         //       fragment_sync fragment_sync = new fragment_sync();
         //               FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
         //               transaction.replace(R.id.replace, fragment_sync);
         //               transaction.commit();
         //   }
       // }

      //  Button buttonSync = (Button) findViewById(R.id.buttonSync);

      //  buttonSync.setOnClickListener(view -> {
     //       Log.d("Test", "User pressed fragment buttonSync");
      //  });

        BottomNavigationView navView = findViewById(R.id.nav_view);
        //Dit is de code die de navigatie in de navbar laat werken.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);
 //   }
  //  public void newView() {
   //     setContentView(R.layout.fragment_sync);
    }
}


