package com.example.proje;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class filtreleme extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.filtreleme);
		
		final MediaPlayer sesbuton = MediaPlayer.create(filtreleme.this, R.raw.button);
		
		TextView a=(TextView)findViewById(R.id.textView1);
		
		Button buton1 = (Button)findViewById(R.id.button1);
		Button buton2 = (Button)findViewById(R.id.button2);
		Button buton3 = (Button)findViewById(R.id.button3);
		
		buton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.HATIRLATILACAKLAR"));
			}
		});
		
		buton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.KONFERANS"));
			}
		});
		
		buton2.setOnClickListener(new View.OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.ARAMA"));
			}
		});
	}

}
