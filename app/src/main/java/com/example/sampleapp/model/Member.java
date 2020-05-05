package com.example.sampleapp.model;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import static com.example.sampleapp.util.Constant.TABLE_MEMBER;

@Entity(tableName = TABLE_MEMBER)
public class Member {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String name;
    private String email;
    private String number;

    @Ignore
    public Member(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public Member(int id, String name, String email, String number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}