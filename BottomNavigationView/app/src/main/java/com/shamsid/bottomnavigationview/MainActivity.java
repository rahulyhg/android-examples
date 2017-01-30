package com.shamsid.bottomnavigationview;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);

    BottomNavigationView bottomNavigationItemView = (BottomNavigationView)
        findViewById (R.id.bottom_navigation_view);

    final TextView showItemSelected = (TextView) findViewById (R.id.tv_item_clicked);

    bottomNavigationItemView.setOnNavigationItemSelectedListener (new BottomNavigationView.
        OnNavigationItemSelectedListener () {
      @Override public boolean onNavigationItemSelected (@NonNull MenuItem item) {
        switch (item.getItemId ()){
          case R.id.favorite_item:
            showItemSelected.setText ("Favorite Item Clicked!");
            break;
          case R.id.location_item:
            showItemSelected.setText ("Location Item Clicked");
            break;
          case R.id.update_item:
            showItemSelected.setText ("Update Item Clicked");
            break;
        }
        return true;
      }
    });
  }
}
