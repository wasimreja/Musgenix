package com.example.musicplayer_ui;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class AlbumsFragment extends Fragment {
    private static final String TAG="AlbumsFragment";
    public static AlbumsFragment newInstance(){
        return new AlbumsFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d(TAG,"inside on create of albums fragment");
        setHasOptionsMenu(true);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){

        View view=inflater.inflate(R.layout.fragment_holder_for_albumstab,container,false);
        Log.d(TAG,"inside on create view of albums fragment");
        return view;
    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        super.onCreateOptionsMenu(menu,inflater);
        inflater.inflate(R.menu.fragment_menu,menu);
        MenuItem item=menu.findItem(R.id.three_dots);


    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG,"inside on start");
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Log.d(TAG,"inside on attach");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG,"inside on stop");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG,"inside on resume");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG,"iNSIDE on destroy");
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d(TAG,"iNSIDE on destroy view");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(TAG,"inside on pAUSE");
    }
    @Override
    public void onDetach(){
        super.onDetach();
        Log.d(TAG,"iNSIDE on detach");
    }
}