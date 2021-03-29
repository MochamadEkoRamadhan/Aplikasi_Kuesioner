package com.example.aplikasikuisioner;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class User {
    @Id(autoincrement = true)
    private Long id;
    private String id_pertanyaan;
    private String jawaban;
    @Generated(hash = 1161521506)
    public User(Long id, String id_pertanyaan, String jawaban) {
        this.id = id;
        this.id_pertanyaan = id_pertanyaan;
        this.jawaban = jawaban;
    }
    @Generated(hash = 586692638)
    public User() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getId_pertanyaan() {
        return this.id_pertanyaan;
    }
    public void setId_pertanyaan(String id_pertanyaan) {
        this.id_pertanyaan = id_pertanyaan;
    }
    public String getJawaban() {
        return this.jawaban;
    }
    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }
}