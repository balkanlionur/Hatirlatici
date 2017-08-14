package com.example.proje;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

public class arama extends Activity implements OnItemSelectedListener{

	
	Spinner s1;
	Spinner s2;
	TextView c;
	
	ArrayAdapter<String> arrayAdapter1;
	Button buton2;
	
	
	private static String[] iller = new String[] { "Istanbul","Ankara"
		,"Izmir","Adana","Adiyaman","Afyonkarahisar","Agri","Aksaray",
		"Amasya","Antalya","Ardahan","Artvin","Aydin","Balikesir","Bartin"
		,"Batman","Bayburt","Bilecik","Bingöl","Bitlis","Bolu","Burdur",
		"Bursa","Çanakkale","Çankiri","Çorum","Denizli","Diyarbakir","Düzce",
		"Edirne","Elazig","Erzincan","Erzurum","Eskisehir","Gaziantep","Giresun"
		,"Gümüshane","Hakkari","Hatay","Igdir","Isparta","Kahramanmaras","Karabük"
		,"Karaman","Kars","Kastamonu","Kayseri","Kirikkale","Kirklareli","Kirsehir"
		,"Kilis","Kocaeli","Konya","Kütahya","Malatya","Manisa","Mardin","Mersin"
		,"Mugla","Mus","Nevsehir","Nigde","Ordu","Osmaniye","Rize","Sakarya",
		"Samsun","Siirt","Sinop","Sivas","sirnak","Tekirdag","Tokat","Trabzon"
		,"Tunceli","sanliurfa","Usak","Van","Yalova","Yozgat","Zonguldak" };
	
	private static String[] organizator = new String[] { "","Academy of Science and Technology",
		"ACIS, UITM, Shah Alam","AHEF The Federation of the Family Physicians Associations",
		"Asian Buffalo Association","Association of Turkish and American Communication Scholars",
		"ATMM","Bah&ccedil;e?ehir University (Turkey)"," Mukogawa Women&#039;s University (Japan)",
		"Center for International and European Studies (CIES) at Kadir Has University",
		"CODATU","DAKAM","Dokuz Eylul University Faculty of Business and International Council for QFD",
		"Future Academy","Future AcademyÂ®","GAZI UNIVERSITY, ATILIM UNIVERSITY, TUBAV",
		"Global Academy of Business and Economic Research of USA","Global Illuminators",
		"Hacettepe University Department of Information Management",
		"Hacettepe University Faculty of Nursing","Hacettepe University Faculty of Nursing, Psychiatric Nurses Association",
		"Hacettepe University, Center for Energy Markets Application &amp; Research",
		"HARUN M. HASHIM LAW CENTRE","IMDA","Informa IIR Ltd",
		"International Foundation for Research and Development (IFRD)"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.arama);
		
		final MediaPlayer sesbuton = MediaPlayer.create(arama.this, R.raw.button);
		
		ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.iller, iller);
		
		 arrayAdapter1 = new ArrayAdapter<String>(this,
                R.layout.organizator, organizator);
		
		
 
        s1 = (Spinner) findViewById(R.id.spinner1);
 
        s1.setOnItemSelectedListener(this);
 
        s1.setAdapter(arrayAdapter);
        
        s2 = (Spinner) findViewById(R.id.spinner2);
        
        s2.setOnItemSelectedListener(this);
 
        s2.setAdapter(arrayAdapter1);
		
		TextView a= (TextView)findViewById(R.id.textView1);
		TextView b= (TextView)findViewById(R.id.textView2);
		c=(TextView)findViewById(R.id.textView3);
		
		s1 = (Spinner)findViewById(R.id.spinner1);
		s2= (Spinner)findViewById(R.id.spinner2);

		Button buton1= (Button)findViewById(R.id.button1);
		buton2= (Button)findViewById(R.id.button2);
		
		buton1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sesbuton.start();
				startActivity(new Intent("android.intent.action.KONFERANS"));
				
				
			}
		});
		
	}
	
	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		 String secilenDeger = s1.getItemAtPosition(position).toString();
		 String secilenDeger1 = s2.getItemAtPosition(position).toString();
	
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}
	
	

	

	

}
