package com.shamsid.activitylifecycle;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LoggingActivity {

  @Override protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);
  }

  @Override protected void onPostCreate (@Nullable Bundle savedInstanceState) {
    super.onPostCreate (savedInstanceState);
  }

  public void onNext(View view){
    startActivity (new Intent (this,SecondActivity.class));
  }

  @Override protected void onStart () {
    super.onStart ();
  }

  @Override protected void onStop () {
    super.onStop ();
  }

  @Override protected void onDestroy () {
    super.onDestroy ();
  }

  @Override protected void onPostResume () {
    super.onPostResume ();
  }

  @Override public void onBackPressed () {
    super.onBackPressed ();
  }

  @Override protected void onPause () {
    super.onPause ();
  }

  @Override protected void onResume () {
    super.onResume ();
  }
}
