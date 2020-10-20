package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Abonat {
    //Am creat class ,care contine cimpuri privat
    private String numele;
    public int telefon;
    private int minute;
    private Abonament status;

    //cu 1 parametri
    public Abonat(String numele) {
        this.numele = numele;
    }

    //cu 2 parametri
    public Abonat(String numele, int telefon) {
        this.numele = numele;
        this.telefon = telefon;
    }

    //fara parametri
    public Abonat() {
    }

    //Cu 4 parametri
    public Abonat(String numele, int telefon, int minute, Abonament status) {
        this.numele = numele;
        this.telefon = telefon;
        this.minute = minute;
        this.status = status;

    }

    @Override
    public String toString() {
        return "Abonat{" +
                "numele='" + numele + '\'' +
                ", telefon=" + telefon +
                ", minute=" + minute +
                ", status=" + status +
                '}';
    }

    public String getNumele() {
        return numele;
    }

    public void setNumele(String numele) {
        this.numele = numele;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Abonament getStatus() {
        return status;
    }

    public void setStatus(Abonament status) {
        this.status = status;
    }

    void addMinute() {
        minute = minute + 10;
    }

    void removeMinute() {
        minute = minute - 10;
    }

    }
