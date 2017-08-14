package com.example.proje;



import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class acilis extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final MediaPlayer sesbuton = MediaPlayer.create(acilis.this, R.raw.button);
		
		Button buton1 = (Button)findViewById(R.id.button1);
		Button buton2 = (Button)findViewById(R.id.button2);
		Button buton3 = (Button)findViewById(R.id.button3);
		
		buton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.FILTRELEME"));
				
			}
		});
		
		buton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.KILAVUZ"));
			}
		});
		
		buton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.HAKKIMIZDA"));
			}
		});
	}
}

