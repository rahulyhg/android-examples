package com.shamsid.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by shamsheR on 30/01/17.
 */

public class LoggingActivity extends Activity{


  @Override
  protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    Log.d (getClass ().getSimpleName (),"onCreate");

  }

  @Override protected void onRestart () {
    super.onRestart ();
    Log.d (getClass ().getSimpleName (),"onRestart");
  }

  /*
   * onStart is called when activity is first started or brought to
   * foreground from hidden state
   */
  @Override protected void onStart () {
    super.onStart ();
    Log.d (getClass ().getSimpleName (),"onStart");
  }

  @Override protected void onPause () {
    super.onPause ();
    Log.d (getClass ().getSimpleName (),"onPause");
  }

  /*
   * onResume is called when just before the activity comes to foreground or
   * restarted from a stopped state or
   * after a pop dialog box is disappeared
   */
  @Override protected void onResume () {
    super.onResume ();
  }

  /*
     * onStop is called when activity is about to stop.
     */
  @Override protected void onStop () {
    super.onStop ();
    Log.d (getClass ().getSimpleName (),"onStop");
  }
  /*
   * onDestroy is called when the activity is shutting down
   *
   */
  @Override protected void onDestroy () {
    super.onDestroy ();
    Log.d (getClass ().getSimpleName (),"onDestroy");
  }
}
