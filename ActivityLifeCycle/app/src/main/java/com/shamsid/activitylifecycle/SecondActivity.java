package com.shamsid.activitylifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends LoggingActivity {

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_second);
  }

  public void onView(View view){
    EditText urlEditText = (EditText)findViewById (R.id.tv_url);
    startActivity (new Intent (Intent.ACTION_VIEW, Uri.parse (urlEditText.getText ().
        toString ())));
  }
}
