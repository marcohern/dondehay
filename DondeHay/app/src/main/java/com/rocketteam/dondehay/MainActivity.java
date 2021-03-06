package com.rocketteam.dondehay;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SearchView;

import com.rocketteam.dondehay.adapters.DrawerMenuAdapter;
import com.rocketteam.dondehay.models.DrawerMenuModel;
import com.rocketteam.dondehay.models.TestData;
import com.rocketteam.dondehay.tags.Tags;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private List<DrawerMenuModel> mLeftModel;
    private ListView mLeftList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w(Tags.MAIN, "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLeftModel = new ArrayList<DrawerMenuModel>();
        mLeftModel.add(new DrawerMenuModel("Lorem Ipsum","LOREM"));
        mLeftList = (ListView) findViewById(R.id.left_drawer);

        mLeftList.setAdapter(new DrawerMenuAdapter(this, mLeftModel));
        TestData.init();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Log.w(Tags.MAIN, "onCreateOptionsMenu");

        getMenuInflater().inflate(R.menu.menu_main, menu);

        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Log.w(Tags.MAIN, "onOptionsItemSelected");

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
