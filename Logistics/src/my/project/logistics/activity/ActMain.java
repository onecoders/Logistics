package my.project.logistics.activity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.sino.app.advancedB41918.R;

public class ActMain extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.act_main, menu);
		return true;
	}

}
