
package com.shamsid.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Test {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("date_created")
    @Expose
    private String date_created;
    @SerializedName("date_modified")
    @Expose
    private String date_modified;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("first_name")
    @Expose
    private String first_name;
    @SerializedName("last_name")
    @Expose
    private String last_name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("last_order")
    @Expose
    private Last_order last_order;
    @SerializedName("orders_count")
    @Expose
    private Integer orders_count;
    @SerializedName("total_spent")
    @Expose
    private String total_spent;
    @SerializedName("avatar_url")
    @Expose
    private String avatar_url;
    @SerializedName("billing")
    @Expose
    private Billing billing;
    @SerializedName("shipping")
    @Expose
    private Shipping shipping;
    @SerializedName("_links")
    @Expose
    private com.shamsid._links _links;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public String getDate_modified() {
        return date_modified;
    }

    public void setDate_modified(String date_modified) {
        this.date_modified = date_modified;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Last_order getLast_order() {
        return last_order;
    }

    public void setLast_order(Last_order last_order) {
        this.last_order = last_order;
    }

    public Integer getOrders_count() {
        return orders_count;
    }

    public void setOrders_count(Integer orders_count) {
        this.orders_count = orders_count;
    }

    public String getTotal_spent() {
        return total_spent;
    }

    public void setTotal_spent(String total_spent) {
        this.total_spent = total_spent;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public com.shamsid._links get_links() {
        return _links;
    }

    public void set_links(com.shamsid._links _links) {
        this._links = _links;
    }

}
