package com.example.aplikasikuisioner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieChart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_chart);

        com.github.mikephil.charting.charts.PieChart pieChart = findViewById(R.id.piechart);
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

    }
}