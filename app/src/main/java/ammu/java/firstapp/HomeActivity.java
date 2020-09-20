package ammu.java.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void gotoMainActivity(View v){
        Intent intent = new Intent(HomeActivity.this, MainActivity.class);
        startActivity(intent);

    }
    public void gotoAboutActivity(View v){
        Intent intent = new Intent(HomeActivity.this, AboutActivity.class);
        startActivity(intent);

    }
    public void gotoServiceActivity(View v){
        Intent intent = new Intent(HomeActivity.this, ServiceActivity.class);
        startActivity(intent);

    }
    public void gotoContactActivity(View v){
        Intent intent = new Intent(HomeActivity.this, ContactActivity.class);
        startActivity(intent);

    }
}