package com.banthi.androiddemos.contactRecyclerView;

public class Contact {
    private String name;
    private String phone;
    private String email;
    private String lmgUrl;

    public Contact(String name, String phone, String email, String imgUrl) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.lmgUrl = imgUrl;
    }

    public String getImgUrl() {
        return lmgUrl;
    }

    public void setImgUrl(String lmgUrl) {
        this.lmgUrl = lmgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
