package com.example.proj3_2;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        LayoutInflater inflater = getLayoutInflater();
        View customView = inflater.inflate(R.layout.dialog, null);
        EditText usernameInput = customView.findViewById(R.id.username);
        EditText passwordInput = customView.findViewById(R.id.password);

        AlertDialog dialog = new AlertDialog.Builder(this)
                .setView(customView)
                .setNegativeButton("Cancel", null)
                .setPositiveButton("Sign in", (dialogInterface, i) -> {
                    String username = usernameInput.getText().toString();
                    String password = passwordInput.getText().toString();
                    Toast.makeText(this, "Username: " + username + ", Password: " + password, Toast.LENGTH_SHORT).show();
                })
                .create();
//调 用 AlertDialog.Builder 对象上的 setView() 将 布 局 添 加 到
//AlertDialog
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.white);
        }


        dialog.show();
    }
}
