
package com.shamsid.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Last_order {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date")
    @Expose
    private String date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
