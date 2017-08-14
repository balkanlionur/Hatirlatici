package com.example.proje;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class hakkimizda extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hakkimizda);
		
		TextView a=(TextView)findViewById(R.id.textView1);
		a.setText("HAKKIMIZDA");
		TextView b=(TextView)findViewById(R.id.textView2);
		TextView c=(TextView)findViewById(R.id.textView3);
		TextView d=(TextView)findViewById(R.id.textView4);
		
		
	}

}
