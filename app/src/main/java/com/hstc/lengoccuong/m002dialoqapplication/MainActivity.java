package com.hstc.lengoccuong.m002dialoqapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {

        btn_dialog = findViewById(R.id.btn_dialoq);
        btn_dialog.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_dialoq:
                alertDialog();
                break;
            default:
                break;
        }
    }

    private void alertDialog() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Confirm Delete");
        dialog.setMessage("Are you sure to quit?");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Alert click Ok",Toast.LENGTH_LONG).show();
            }
        });

        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Alert click No",Toast.LENGTH_LONG).show();
            }
        });

        dialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Alert click Cancel",Toast.LENGTH_LONG).show();

            }
        });
        dialog.show();


    }
}
