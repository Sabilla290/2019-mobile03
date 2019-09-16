package id.ac.polinema.aplikasiku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

			new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent i = new Intent(MainActivity.this, WelcomeActivity.class);
				startActivity(i);
				finish();
			}
			}, 1000);
	}
}
