package com.example.login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText) findViewById(R.id.editText);
        Password = (EditText) findViewById(R.id.editText1);
        Login = (Button) findViewById(R.id.button);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(Username.getText().toString(),Password.getText().toString());
            }

        });
    }
    private void Login(String Name ,String password){
        if ((Name.equals("Ali"))&&(password.equals("1234"))){

            Intent intent = new Intent(MainActivity.this,Welcome.class);
            intent.putExtra("Username",Name);
            startActivity(intent);

        }
        else{
            Toast.makeText(this, "UserName AND Password Invalid", Toast.LENGTH_SHORT).show();
        }
    }
}