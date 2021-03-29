package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class Pilihan extends AppCompatActivity{

    private String[] Pendidikan = {"Pilih Pertanyaan", "Pertanyaan 1", "Pertanyaan 2", "Pertanyaan 3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihan);
        View a = findViewById(R.id.piechart);
        View b = findViewById(R.id.piechart2);
        View c = findViewById(R.id.piechart3);
        PieChart pieChart = findViewById(R.id.piechart);
        PieChart pieChart2 = findViewById(R.id.piechart2);
        PieChart pieChart3 = findViewById(R.id.piechart3);
        final Spinner List = findViewById(R.id.spinner);

        //Inisialiasi Array Adapter dengan memasukkan String Array
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, Pendidikan);

        //Memasukan Adapter pada Spinner
        List.setAdapter(adapter);

        //Mengeset listener untuk mengetahui event/aksi saat item dipilih
        List.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView adapterView, View view, int i, long l) {
                String selectedItem = adapterView.getItemAtPosition(i).toString();
                if(selectedItem.equals("Pilih Pertanyaan")) {
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Saya Memilih "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }else if(selectedItem.equals("Pertanyaan 1")) {
                    a.setVisibility(View.VISIBLE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Saya Memilih "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }else if (selectedItem.equals("Pertanyaan 2")){
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.VISIBLE);
                    c.setVisibility(View.GONE);
                    Toast.makeText(getApplicationContext(),"Saya Memilih "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }else if (selectedItem.equals("Pertanyaan 3")){
                    a.setVisibility(View.GONE);
                    b.setVisibility(View.GONE);
                    c.setVisibility(View.VISIBLE);
                    Toast.makeText(getApplicationContext(),"Saya Memilih "+adapter.getItem(i), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView adapterView) {

            }
        });

        ArrayList<PieEntry> Konsumen = new ArrayList<>();
        Konsumen.add(new PieEntry(56, "Sangat Puas"));
        Konsumen.add(new PieEntry(12, "Puas"));
        Konsumen.add(new PieEntry(17, "Tidak Puas"));
        Konsumen.add(new PieEntry(19, "Sangat Tidak Puas"));

        PieDataSet pieDataSet = new PieDataSet(Konsumen, "| Pernyataan No 1");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(14f);

        PieData pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.setCenterText("Konsumen");
        pieChart.animate();

        ArrayList<PieEntry> Konsumen2 = new ArrayList<>();
        Konsumen2.add(new PieEntry(45, "Sangat Puas"));
        Konsumen2.add(new PieEntry(20, "Puas"));
        Konsumen2.add(new PieEntry(20, "Tidak Puas"));
        Konsumen2.add(new PieEntry(15, "Sangat Tidak Puas"));

        PieDataSet pieDataSet2 = new PieDataSet(Konsumen2, "| Pernyataan No 2");
        pieDataSet2.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet2.setValueTextColor(Color.WHITE);
        pieDataSet2.setValueTextSize(14f);

        PieData pieData2 = new PieData(pieDataSet2);
        pieChart2.setData(pieData2);
        pieChart2.getDescription().setEnabled(false);
        pieChart2.setCenterText("Konsumen");
        pieChart2.animate();

        ArrayList<PieEntry> Konsumen3 = new ArrayList<>();
        Konsumen3.add(new PieEntry(60, "Sangat Puas"));
        Konsumen3.add(new PieEntry(15, "Puas"));
        Konsumen3.add(new PieEntry(10, "Tidak Puas"));
        Konsumen3.add(new PieEntry(5, "Sangat Tidak Puas"));

        PieDataSet pieDataSet3 = new PieDataSet(Konsumen3, "| Pertanyaan No 3");
        pieDataSet3.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet3.setValueTextColor(Color.WHITE);
        pieDataSet3.setValueTextSize(14f);

        PieData pieData3 = new PieData(pieDataSet3);
        pieChart3.setData(pieData3);
        pieChart3.getDescription().setEnabled(false);
        pieChart3.setCenterText("Konsumen");
        pieChart3.animate();
    }
}
