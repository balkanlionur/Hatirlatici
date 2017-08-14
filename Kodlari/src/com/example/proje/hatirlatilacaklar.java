package com.example.proje;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hatirlatilacaklar extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hatirlatilacaklar);
		
		final MediaPlayer sesbuton = MediaPlayer.create(hatirlatilacaklar.this, R.raw.button);
		
		final TextView a = (TextView)findViewById(R.id.textView1);
		
		Button buton1 = (Button)findViewById(R.id.button1);
		Button buton2 = (Button)findViewById(R.id.button2);
		
		buton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				a.setText(" ");
				
			}
		});
		
		buton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.KAYIT"));
			}
		});
	}
	
	

}
