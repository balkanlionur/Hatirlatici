package com.example.proje;

import java.util.Calendar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class kayit extends Activity {
	
	DatePicker tarih;
	TimePicker saat;
	Button buton2;
	TextView b;
	
	final static int RQS_1 = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kayit);
		
		final MediaPlayer sesbuton = MediaPlayer.create(kayit.this, R.raw.button);
		
		
		
		TextView a=(TextView)findViewById(R.id.textView1);
		b=(TextView)findViewById(R.id.textView2);
		
		Button buton1 = (Button)findViewById(R.id.button1);
		buton2 = (Button)findViewById(R.id.button2);
		Button buton3 = (Button)findViewById(R.id.button3);
		
		 tarih = (DatePicker)findViewById(R.id.pickerdate);
		
		 saat = (TimePicker)findViewById(R.id.pickertime);
		
		 Calendar now = Calendar.getInstance();

			tarih.init(
					now.get(Calendar.YEAR), 
					now.get(Calendar.MONTH), 
					now.get(Calendar.DAY_OF_MONTH), 
					null);
			
			saat.setCurrentHour(now.get(Calendar.HOUR_OF_DAY));
			saat.setCurrentMinute(now.get(Calendar.MINUTE));
		 
		 buton2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Calendar current = Calendar.getInstance();
				
				Calendar cal = Calendar.getInstance();
				cal.set(tarih.getYear(), 
						tarih.getMonth(), 
						tarih.getDayOfMonth(), 
						saat.getCurrentHour(), 
						saat.getCurrentMinute(), 
						00);
				
				if(cal.compareTo(current) <= 0){
					//The set Date/Time already passed
				    Toast.makeText(getApplicationContext(), 
				    		"Girilen Tarih Geçersizdir !", 
				    		Toast.LENGTH_LONG).show();
				}else{
					setAlarm(cal);
				}
				
			}});
		 
		buton3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.ACILIS"));
			}
		});
	}
	
	private void setAlarm(Calendar targetCal){
		
		final MediaPlayer zil = MediaPlayer.create(kayit.this, R.raw.zilsesi);
		zil.start();

		b.setText("Alarm Kaydedildi " + targetCal.getTime());
		
		Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
		PendingIntent pendingIntent = PendingIntent.getBroadcast(getBaseContext(), RQS_1, intent, 0);
		AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC_WAKEUP, targetCal.getTimeInMillis(), pendingIntent);	  
	}
	
	

}
