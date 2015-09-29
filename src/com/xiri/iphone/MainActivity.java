package com.xiri.iphone;

import java.io.IOException;


import java.io.InputStream;
import java.util.ArrayList;

import java.util.List;
import com.xiri.iphone.R;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import android.widget.ImageView;



public class MainActivity extends Activity {
	List<String> list = new ArrayList<String>();
	ImageView _imageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

//		_imageView = (ImageView) findViewById(R.id.iv_content);
//		Bitmap bitmap = getImageFromAssetsFile(this, "control_background.png");
//		StackBlurManager _stackBlurManager = new StackBlurManager(bitmap);
//
//		_stackBlurManager.process(5);
//
//		System.out.println(_stackBlurManager.returnBlurredImage().toString());

//		_imageView.setImageResource(R.drawable.control_background);

		// ToggleButton
		// list.add("1");
		// list.add("2");
		// list.add("3");
		// list.add("4");
		// list.add("5");
		// list.add("6");
		// list.add("7");
		// list.add("8");
		// list.add("9");
		//
		// HorizontalListView listview= (HorizontalListView)
		// findViewById(R.id.list);
		// HorizontalListView listview1= (HorizontalListView)
		// findViewById(R.id.list1);
		//
		// HorizontalListView listview2= (HorizontalListView)
		// findViewById(R.id.list2);
		//
		// HorizontalListView listview3= (HorizontalListView)
		// findViewById(R.id.list3);
		//
		//
		//
		// BaseAdapter adapter=new TestAdapter(getBaseContext(), list);
		// BaseAdapter adapter1=new TestAdapter(getBaseContext(), list);
		// BaseAdapter adapter2=new TestAdapter(getBaseContext(), list);
		// BaseAdapter adapter3=new TestAdapter(getBaseContext(), list);
		// listview1.setAdapter(adapter1);
		// listview2.setAdapter(adapter2);
		// listview3.setAdapter(adapter3);
		// listview.setAdapter(adapter);

	}

	/*
	 * 从Assets中读取图片
	 */
	private Bitmap getImageFromAssetsFile(Context context, String fileName) {
		Bitmap image = null;
		AssetManager am = context.getAssets();
		try {
			InputStream is = am.open(fileName);
			image = BitmapFactory.decodeStream(is);
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return image;

	}

}
