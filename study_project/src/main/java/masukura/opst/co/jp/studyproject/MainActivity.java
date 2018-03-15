package masukura.opst.co.jp.studyproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button1 = findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				Toast.makeText(MainActivity.this, R.string.text1, Toast.LENGTH_SHORT).show();
			}
		});
	}
}