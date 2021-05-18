package com.cmpe277.newsflash.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.cmpe277.newsflash.R;
import com.cmpe277.newsflash.viewmodels.NewsViewModel;
import com.cmpe277.newsflash.viewmodels.NewsViewModelFactory;

public class NewsActivity extends AppCompatActivity {

    private static NewsViewModel newsViewModel;

    public static NewsViewModel getNewsViewModel() {
        return newsViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this, R.id.newsNavHostFragment);
        newsViewModel = new ViewModelProvider(this, new NewsViewModelFactory(getApplication())).get(NewsViewModel.class);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
    }

}