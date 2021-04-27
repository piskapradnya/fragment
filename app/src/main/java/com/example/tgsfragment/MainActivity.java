package com.example.tgsfragment;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tgsfragment.fragment.Chat;
import com.example.tgsfragment.fragment.Home;
import com.example.tgsfragment.fragment.Search;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    Button btn_Home, btn_Search, btn_Chat, btn_Exit;

    Home fragmentHome;
    Search fragmentSearch;
    Chat fragmentChat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_Home    = findViewById(R.id.btnHome);
        btn_Search = findViewById(R.id.btnSearch);
        btn_Chat    = findViewById(R.id.btnChat);
        btn_Exit    = findViewById(R.id.btnExit);

        btn_Home.setOnClickListener(this);
        btn_Search.setOnClickListener(this);
        btn_Chat.setOnClickListener(this);
        btn_Exit.setOnClickListener(this);
    }

    void menuHome(){
        fragmentHome = new Home();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentHome);
        ft.commit();
    }
    void menuSearch(){
        fragmentSearch = new Search();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentSearch);
        ft.commit();

    }
    void menuChat(){
        fragmentChat = new Chat();
        FragmentTransaction ft = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragmentChat);
        ft.commit();
    }

    void menuExit(){
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btn_Home){
            menuHome();
        }
        if (v == btn_Search){
            menuSearch();

        }
        if (v == btn_Chat){
            menuChat();

        }
        if (v == btn_Exit){
            menuExit();
        }

    }
}





