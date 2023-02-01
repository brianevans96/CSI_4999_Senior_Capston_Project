package com.example.investoframework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class OverviewActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview);


    }

    public void goToUserProfileActivity(View view) {
        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
    }

    public void goToCalendarActivity(View view) {
        startActivity(new Intent(getApplicationContext(), CalendarActivity.class));
    }

    public void goToBudgetActivity(View view) {
        startActivity(new Intent(getApplicationContext(), BudgetActivity.class));
    }

    public void goToRecentTransActivity(View view) {
        startActivity(new Intent(getApplicationContext(), RecentTransActivity.class));
    }

    public void goToMonthBillsActivity(View view) {
        startActivity(new Intent(getApplicationContext(), MonthBillsActivity.class));
    }

}