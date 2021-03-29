package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RadioSoal extends AppCompatActivity implements View.OnClickListener{

    Repository repository;
    DaoSession daoSession;

    private Button buttonsp;
    private Button buttonp;
    private Button buttontp;
    private Button buttonstp;
    private Button buttonsave;

    private String ID_PERTANYAAN;
    private String JAWABAN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_soal);

        daoSession = ((MyApp) getApplication()).getDaoSession();
        repository = new Repository();

        buttonsp=(Button)findViewById(R.id.rbSP);
        buttonp=(Button)findViewById(R.id.rbP);
        buttontp=(Button)findViewById(R.id.rbTP);
        buttonstp=(Button)findViewById(R.id.rbSTP);
        buttonsave=(Button)findViewById(R.id.btnSimpan);

        buttonsp.setOnClickListener(this);
        buttonp.setOnClickListener(this);
        buttontp.setOnClickListener(this);
        buttonstp.setOnClickListener(this);
        buttonsave.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.rbSP:
                ID_PERTANYAAN = "1";
                JAWABAN       = buttonsp.getText().toString();
                Toast.makeText(this, JAWABAN, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbP:
                ID_PERTANYAAN = "1";
                JAWABAN       = buttonp.getText().toString();
                Toast.makeText(this, JAWABAN, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbTP:
                ID_PERTANYAAN = "1";
                JAWABAN       = buttontp.getText().toString();
                Toast.makeText(this, JAWABAN, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbSTP:
                ID_PERTANYAAN = "1";
                JAWABAN       = buttonstp.getText().toString();
                Toast.makeText(this, JAWABAN, Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnSimpan:
                UserDao userDao = daoSession.getUserDao();
                User  user = new User();
                user.setJawaban(JAWABAN);
                user.setId_pertanyaan(ID_PERTANYAAN);
                Log.d("DEBUG", "Jawaban " + JAWABAN );
                Log.d("DEBUG", "ID  " + ID_PERTANYAAN );
                userDao.insert(user);
                Toast.makeText(this,"Sukses", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(RadioSoal.this, RadioSoal2.class));
                break;

        }
    }
}