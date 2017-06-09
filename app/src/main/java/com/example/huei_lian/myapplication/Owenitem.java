package com.example.huei_lian.myapplication;

/**
 * Created by Huei-Lian on 2017/6/9.
 */

public class Owenitem {
    int host_img_id;
    int guest_img_id;
    String host_name;
    String guest_name;
    String host_score;
    String guest_score;


    public Owenitem(int host_img_id, int guest_img_id, String host_name, String guest_name, String host_score, String guest_score) {
        this.host_img_id = host_img_id;
        this.guest_img_id = guest_img_id;
        this.host_name = host_name;
        this.guest_name = guest_name;
        this.host_score = host_score;
        this.guest_score = guest_score;
    }

    public int getHost_img_id() {
        return host_img_id;
    }

    public void setHost_img_id(int host_img_id) {
        this.host_img_id = host_img_id;
    }

    public int getGuest_img_id() {
        return guest_img_id;
    }

    public void setGuest_img_id(int guest_img_id) {
        this.guest_img_id = guest_img_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public String getHost_score() {
        return host_score;
    }

    public void setHost_score(String host_score) {
        this.host_score = host_score;
    }

    public String getGuest_score() {
        return guest_score;
    }

    public void setGuest_score(String guest_score) {
        this.guest_score = guest_score;
    }
}
