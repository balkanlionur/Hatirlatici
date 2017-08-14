package com.example.proje;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.acilis);
		
		Thread acilisekrani = new Thread(){
			
			public void run(){
				try{
					sleep(5000);
					startActivity(new Intent("android.intent.action.ACILIS"));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		
		};
		acilisekrani.start();
	}
}
