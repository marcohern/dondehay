package com.rocketteam.dondehay.providers;

import android.app.SearchManager;
import android.content.SearchRecentSuggestionsProvider;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;

import com.rocketteam.dondehay.tags.Tags;

import java.util.Locale;

/**
 * Created by marcoh on 23/11/14.
 */
public class PlacesSearchProvider extends SearchRecentSuggestionsProvider {

    private final static String[] suggestions = {
            "Lorem Ipsum",
            "Dolor sit amet",
            "Sanctum discus",
            "Demanicus Tolero"
    };

    public final static String AUTHORITY = Tags.APP_PACKAGE + ".providers.PlacesSearchProvider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public PlacesSearchProvider() {
        setupSuggestions(AUTHORITY, MODE);


    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        String q = uri.getLastPathSegment().toLowerCase(Locale.getDefault());
        Log.w(Tags.PLACES_SEARCH_PROVIDER, "Uri:" + uri);
        Log.w(Tags.PLACES_SEARCH_PROVIDER, "Query:" + q);
        return querySiteIndex(q);
    }

    private Cursor querySiteIndex(String q) {
        String[] columns = { "_id", SearchManager.SUGGEST_COLUMN_TEXT_1, SearchManager.SUGGEST_COLUMN_TEXT_2 };
        MatrixCursor matrixCursor= new MatrixCursor(columns);

        for (int i=0; i < suggestions.length; i++) {
            String si = suggestions[i];

            if (si.toLowerCase(Locale.getDefault()).contains(q)) {
                matrixCursor.addRow(new Object[] {i, si, si });
            }
        }
        return matrixCursor;
    }
}
