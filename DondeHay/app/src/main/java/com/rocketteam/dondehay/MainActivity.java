package com.rocketteam.dondehay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.rocketteam.dondehay.adapters.DrawerMenuAdapter;
import com.rocketteam.dondehay.models.DrawerMenuModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<DrawerMenuModel> mLeftModel;
    private DrawerLayout mLeftLayout;
    private ListView mLeftList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeftModel = new ArrayList<DrawerMenuModel>();
        mLeftModel.add(new DrawerMenuModel("Lorem Ipsum","LOREM"));

        mLeftLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mLeftList = (ListView) findViewById(R.id.left_drawer);

        mLeftList.setAdapter(new DrawerMenuAdapter(this, R.layout.drawer_list_item, mLeftModel));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
