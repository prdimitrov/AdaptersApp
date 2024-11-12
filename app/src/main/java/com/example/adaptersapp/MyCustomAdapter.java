package com.example.adaptersapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    public MyCustomAdapter(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length; //Returns the number of items in the data source
    }

    @Override
    public Object getItem(int position) {
        return items[position]; //Returns the data item at the given position
    }

    @Override
    public long getItemId(int position) {
        return position; //Returns a unique Identifier for the item at the given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            //convertView is a recycled View, that can be reused to improve
            //performance of the list
            convertView = LayoutInflater.from(context)
                    .inflate(R.layout.my_list_view, parent, false);

        } else {
            // Reusing the View (that's recycled)
            holder = (ViewHolder) convertView.getTag();
        }

        return null; //Displays the data at a position in the data set
    }

    static class ViewHolder {
        //Holds references to the views within an item layout
        TextView textView;
    }
}
