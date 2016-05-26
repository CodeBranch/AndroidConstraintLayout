package io.twere.constraintlayout.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import io.twere.constraintlayout.R;

public class MainActivity extends AppCompatActivity {

  @Override public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
    super.onCreate(savedInstanceState, persistentState);
    setContentView(R.layout.scroll_view_example);
  }
}
