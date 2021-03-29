package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioSoal2 extends AppCompatActivity implements View.OnClickListener{

    Repository repository;
    DaoSession daoSession;

    private Button buttonsp1;
    private Button buttonp1;
    private Button buttontp1;
    private Button buttonstp1;
    private Button buttonsave1;

    private String ID_PERTANYAAN1;
    private String JAWABAN1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_soal2);

        daoSession = ((MyApp) getApplication()).getDaoSession();
        repository = new Repository();

        buttonsp1=(Button)findViewById(R.id.rbSP1);
        buttonp1=(Button)findViewById(R.id.rbP1);
        buttontp1=(Button)findViewById(R.id.rbTP1);
        buttonstp1=(Button)findViewById(R.id.rbSTP1);
        buttonsave1=(Button)findViewById(R.id.btnSimpan1);

        buttonsp1.setOnClickListener(this);
        buttonp1.setOnClickListener(this);
        buttontp1.setOnClickListener(this);
        buttonstp1.setOnClickListener(this);
        buttonsave1.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rbSP1:
                ID_PERTANYAAN1 = "2";
                JAWABAN1       = buttonsp1.getText().toString();
                Toast.makeText(this, JAWABAN1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbP1:
                ID_PERTANYAAN1 = "2";
                JAWABAN1       = buttonp1.getText().toString();
                Toast.makeText(this, JAWABAN1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbTP1:
                ID_PERTANYAAN1 = "2";
                JAWABAN1       = buttontp1.getText().toString();
                Toast.makeText(this, JAWABAN1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSTP1:
                ID_PERTANYAAN1 = "2";
                JAWABAN1       = buttonstp1.getText().toString();
                Toast.makeText(this, JAWABAN1, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSimpan1:
                UserDao userDao = daoSession.getUserDao();
                User  user = new User();
                user.setJawaban(JAWABAN1);
                user.setId_pertanyaan(ID_PERTANYAAN1);
                Log.d("DEBUG", "Jawaban " + JAWABAN1 );
                Log.d("DEBUG", "ID  " + ID_PERTANYAAN1 );
                userDao.insert(user);
                Toast.makeText(this,"Sukses", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RadioSoal2.this, RadioSoal3.class));
                break;
            //Toast.makeText(this,"Sukses", Toast.LENGTH_SHORT).show();
            //startActivity(new Intent(RadioSoal.this, RadioSoal2.class));
        }
    }
}