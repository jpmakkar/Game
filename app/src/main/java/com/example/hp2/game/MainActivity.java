package com.example.hp2.game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eTxtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTxtName = (EditText) findViewById(R.id.editText);
        this.setTitle("ffff");
    }
public void clickhandler(View view)
{
    String txt = eTxtName.getText().toString().trim();

    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
    intent.putExtra("keyName",txt);
    startActivity(intent);


}
}
