package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;

public class ModelClass extends AppCompatActivity implements Parcelable {

    private String name;
    private String email;
    private  int phoneno;

    public ModelClass() {
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
    }


//    parcelable constructor

    protected ModelClass(Parcel in) {
        name = in.readString();
        email = in.readString();
        phoneno = in.readInt();
    }

    public static final Creator<ModelClass> CREATOR = new Creator<ModelClass>() {
        @Override
        public ModelClass createFromParcel(Parcel in) {
            return new ModelClass(in);
        }

        @Override
        public ModelClass[] newArray(int size) {
            return new ModelClass[size];
        }
    };

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

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(email);
        dest.writeInt(phoneno);
    }

}
