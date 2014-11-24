package com.rocketteam.dondehay.activities;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.rocketteam.dondehay.tags.Tags;

import static android.content.Intent.ACTION_SEARCH;

/**
 * Created by marcoh on 23/11/14.
 */
public class SearchResultActivity extends Activity {

    public SearchResultActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.w(Tags.SEARCH_RESULT,"onCreate");
        super.onCreate(savedInstanceState);

        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.w(Tags.SEARCH_RESULT, "onNewIntent");
        super.onNewIntent(intent);

        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        Log.w(Tags.SEARCH_RESULT,"handleIntent");

        if (ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            //use the query to search your data somehow
        }
    }
}
