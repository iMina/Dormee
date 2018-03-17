package com.example.android.dormee;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
//        implements SavedFragment.OnFragmentInteractionListener
{

    /*private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Toast.makeText(getApplicationContext(), "Home screen to be implemented", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_saved:
//                    mTextMessage.setText(R.string.title_saved);
                    return true;
                case R.id.navigation_my_place:
                    Toast.makeText(getApplicationContext(), "My Place screen to be implemented", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.navigation_inbox:
                    Toast.makeText(getApplicationContext(), "Inbox screen to be implemented", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.flatshare_view);
      /*  BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navigation.setSelectedItemId(R.id.navigation_saved);*/
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_bar_search:
                Toast.makeText(getApplicationContext(), "Search action to be implemented", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_bar_filter:
                Toast.makeText(getApplicationContext(), "Filter action to be implemented", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }*/


    /*@Override
    public void onFragmentInteraction(Uri uri) {

    }

    *//**
 * Called when pointer capture is enabled or disabled for the current window.
 *
 * @param hasCapture True if the window has pointer capture.
 *//*
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }*/

   /* public void onTabSelected(View view) {
        switch (view.getId()) {
            case R.id.tab_apartments:
                return;
            case R.id.tab_flatshares:
                return;

        }
    }*/
}
