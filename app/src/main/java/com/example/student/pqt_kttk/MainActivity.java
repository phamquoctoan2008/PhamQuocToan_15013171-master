package com.example.student.pqt_kttk;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_tk ,edt_mk;
    CheckBox check;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_tk = findViewById(R.id.edit_taikhoan);
        edt_mk = findViewById(R.id.edit_matkhau);
        check = findViewById(R.id.checkbox);
        btn_login = findViewById(R.id.button_dangnhap);
        final AlertDialog.Builder builder = new AlertDialog.Builder(getApplication());


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check.isChecked()){
                    Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong, thong tin cua ban da duoc luu",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this,"Chao mung ban dang nhap he thong, thong tin cua ban khong duoc luu",Toast.LENGTH_LONG).show();
                }
            }
        });

        
    }
}
