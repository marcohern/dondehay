package com.rocketteam.dondehay.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rocketteam.dondehay.R;
import com.rocketteam.dondehay.models.DrawerMenuModel;

import java.util.List;

/**
 * Created by marcoh on 23/11/14.
 */
public class DrawerMenuAdapter extends ArrayAdapter<DrawerMenuModel> {

    public DrawerMenuAdapter(Context context, int resource, List<DrawerMenuModel> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        // first check to see if the view is null. if so, we have to inflate it.
        // to inflate it basically means to render, or show, the view.
        if (v == null) {
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.drawer_list_item, null);
        }

        DrawerMenuModel drawerMenuModel = getItem(position);
        if (drawerMenuModel != null) {
            TextView label = (TextView)v.findViewById(R.id.drawer_list_label);
            TextView code = (TextView)v.findViewById(R.id.drawer_list_code);

            label.setText(drawerMenuModel.getDisplayName());
        }

        return v;
    }


}
