package com.example.proje;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class kilavuz extends Activity {
    /** Called when the activity is first created. */
    private ImageView foto;
    private Gallery gallery;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kilavuz);
        
        gallery = (Gallery) findViewById(R.id.gallery);
        foto = (ImageView) findViewById(R.id.imageView1);
        
        gallery.setAdapter(new ImageAdapter(this));

        gallery.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                
            	switch(position) {
                
                case 0: foto.setImageResource(R.drawable.k1); break;
                
                case 1: foto.setImageResource(R.drawable.k2); break;
                
                case 2: foto.setImageResource(R.drawable.k3); break;
                
                case 3: foto.setImageResource(R.drawable.k4); break;
                
                case 4: foto.setImageResource(R.drawable.k5); break;
                
                case 5: foto.setImageResource(R.drawable.k6); break;
                
                case 6: foto.setImageResource(R.drawable.k7); break;
                
                }
            }
        });
        
        
        
    }
	
	public class ImageAdapter extends BaseAdapter {
	    int mGalleryItemBackground;
	    private Context mContext;
	    private Integer[] mImageIds = {
	            R.drawable.k1,
	            R.drawable.k2,
	            R.drawable.k3,
	            R.drawable.k4,
	            R.drawable.k5,
	            R.drawable.k6,
	            R.drawable.k7,
	         };
	    public ImageAdapter(Context c) {
	        mContext = c;
	        TypedArray attr = mContext.obtainStyledAttributes(R.styleable.GaleriOlusturma);
	        mGalleryItemBackground = attr.getResourceId(
	                R.styleable.GaleriOlusturma_android_galleryItemBackground, 0);
	        attr.recycle();
	    }
	    public int getCount() {
	        return mImageIds.length;
	    }
	    public Object getItem(int position) {
	        return position;
	    }
	    public long getItemId(int position) {
	        return position;
	    }
	    public View getView(int position, View convertView, ViewGroup parent) {
	        ImageView imageView = new ImageView(mContext);
	        imageView.setImageResource(mImageIds[position]);
	        imageView.setLayoutParams(new Gallery.LayoutParams(150, 100));
	        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
	        imageView.setBackgroundResource(mGalleryItemBackground);

	        return imageView;
	    }
	}
}