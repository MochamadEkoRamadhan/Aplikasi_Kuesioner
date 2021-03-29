package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioSoal3 extends AppCompatActivity implements View.OnClickListener{

    Repository repository;
    DaoSession daoSession;

    private Button buttonsp2;
    private Button buttonp2;
    private Button buttontp2;
    private Button buttonstp2;
    private Button buttonsave2;

    private String ID_PERTANYAAN2;
    private String JAWABAN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_soal3);

        daoSession = ((MyApp) getApplication()).getDaoSession();
        repository = new Repository();

        buttonsp2=(Button)findViewById(R.id.rbSP2);
        buttonp2=(Button)findViewById(R.id.rbP2);
        buttontp2=(Button)findViewById(R.id.rbTP2);
        buttonstp2=(Button)findViewById(R.id.rbSTP2);
        buttonsave2=(Button)findViewById(R.id.btnSimpan2);

        buttonsp2.setOnClickListener(this);
        buttonp2.setOnClickListener(this);
        buttontp2.setOnClickListener(this);
        buttonstp2.setOnClickListener(this);
        buttonsave2.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rbSP2:
                ID_PERTANYAAN2 = "3";
                JAWABAN2       = buttonsp2.getText().toString();
                Toast.makeText(this, JAWABAN2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbP2:
                ID_PERTANYAAN2 = "3";
                JAWABAN2       = buttonp2.getText().toString();
                Toast.makeText(this, JAWABAN2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbTP2:
                ID_PERTANYAAN2 = "3";
                JAWABAN2       = buttontp2.getText().toString();
                Toast.makeText(this, JAWABAN2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSTP2:
                ID_PERTANYAAN2 = "3";
                JAWABAN2       = buttonstp2.getText().toString();
                Toast.makeText(this, JAWABAN2, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSimpan2:
                UserDao userDao = daoSession.getUserDao();
                User  user = new User();
                user.setJawaban(JAWABAN2);
                user.setId_pertanyaan(ID_PERTANYAAN2);
                Log.d("DEBUG", "Jawaban " + JAWABAN2 );
                Log.d("DEBUG", "ID  " + ID_PERTANYAAN2 );
                userDao.insert(user);
                Toast.makeText(this,"Sukses", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RadioSoal3.this, Pilihan.class));
                break;
            //Toast.makeText(this,"Sukses", Toast.LENGTH_SHORT).show();
            //startActivity(new Intent(RadioSoal.this, RadioSoal2.class));
        }
    }
}