package com.xiri.iphone;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;



public class TestAdapter extends BaseAdapter{
	
		private Context context;
		private List<String> list;
		
		public TestAdapter(Context context,List<String> list){
			
			this.context=context;
			this.list=list;
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return list.get(position);
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			
		        ViewHolder holder;
		        if (convertView == null) {
		            LayoutInflater li = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		            convertView = li.inflate(R.layout.activity_horizontal_picker, parent, false);
		            holder = new ViewHolder();
		            holder.tvNumber = (TextView) convertView.findViewById(R.id.text);
		     
		          
		            convertView.setTag(holder);
		        } else {
		            holder = (ViewHolder) convertView.getTag();
		        }


		        holder.tvNumber.setText("11111111+11");
		 
			return convertView;
		}
	class ViewHolder{
		TextView tvNumber;
		TextView tvTime;
		TextView tvContent;
		Button btnDelete;
		
		
	}
	

}
