package com.lifeistech.android.textbook;

import android.support.annotation.ColorInt;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by sion on 2/21/2016.
 */

@Table(name = "memo_table")
public class MemoDB extends Model {

    @Column(name = "title")
    public String title;

    @Column(name = "memo")
    public String memo;

    @Column(name = "date")
    public String date;

    @Override
    public String toString(){
        return title;
    }


}
