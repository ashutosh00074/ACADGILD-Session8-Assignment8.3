package com.tech.gigabyte.customgridview;
/**
 * Created by GIGABYTE on 4/30/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


// BaseAdapter - Common base class of common implementation for an Adapter
class CustomGVActivity extends BaseAdapter {

    private String[] result;
    private Context context;
    private int[] imageId;
    private static LayoutInflater inflater = null;                         //Instantiates a layout XML file into its corresponding View objects.

    public CustomGVActivity(MainActivity mainActivity, String[] NameList, int[] Images) {
        // TODO Auto-generated constructor stub
        result = NameList;
        context = mainActivity;
        imageId = Images;
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);       //LayoutInflater for inflating layout resources in this context.

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    private class Holder {
        TextView textView;
        ImageView imageView;
    }

    @Override
    //convertView - The old view to reuse

    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder = new Holder();
        View rowView;

        rowView = inflater.inflate(R.layout.grid_layout, null);
        holder.textView = (TextView) rowView.findViewById(R.id.texts);
        holder.imageView = (ImageView) rowView.findViewById(R.id.images);

        holder.textView.setText(result[position]);
        holder.imageView.setImageResource(imageId[position]);

        rowView.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                //A Toast will notify when any of image clicked
                Toast.makeText(context, "You Clicked " + result[position], Toast.LENGTH_SHORT).show();
            }
        });

        return rowView;
    }

}
