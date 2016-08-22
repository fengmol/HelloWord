package com.example.xzf.helloword.comm.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by xzf on 2016/8/17.
 */
public class JBean implements Parcelable {
    private String b;
    private String a;

    public JBean(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.a);
        dest.writeString(this.b);
    }

    protected JBean(Parcel in) {
        this.a = in.readString();
        this.b = in.readString();
    }

    public static final Parcelable.Creator<JBean> CREATOR = new Parcelable.Creator<JBean>() {
        @Override
        public JBean createFromParcel(Parcel source) {
            return new JBean(source);
        }

        @Override
        public JBean[] newArray(int size) {
            return new JBean[size];
        }
    };
}
