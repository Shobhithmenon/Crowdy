package com.example.crowdy;

import android.os.Build;

import java.text.SimpleDateFormat;
import java.util.Date;




class Branch {
    public int sol_id;
    public int total_managed;
    private String manager_password;
    public String today_date;
    public int gold[];
    public int cash[];
    public int general_query[];
    public int manager[];
    public int loan_officer[];
    public int total_in;
    public int total_out;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date date = new Date();



    public Branch(int sol_id, int total_managed, String manager_password, String today_date, int[] gold, int[] cash, int[] general_query, int[] manager, int[] loan_officer, int total_in, int total_out) {
        this.sol_id = sol_id;
        this.total_managed = total_managed;
        this.manager_password = manager_password;
        this.today_date = (formatter.format(date)).toString();
        this.gold = new int[]{1, 0, 0};
        this.cash = new int[]{1, 0, 0};
        this.general_query = new int[]{1, 0, 0};
        this.manager = new int[]{1, 0, 0};
        this.loan_officer = new int[]{1, 0, 0};
        this.total_in = 0;
        this.total_out = 0;
    }

}
