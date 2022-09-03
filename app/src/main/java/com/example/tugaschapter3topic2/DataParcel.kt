package com.example.tugaschapter3topic2

import android.os.Parcel
import android.os.Parcelable

data class DataParcel(var umur: Int = 0, var tb: Double = 0.0, var bb: Double = 0.0, var hasil: Double = 0.0, var kondisi: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readDouble(),
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(umur)
        parcel.writeDouble(tb)
        parcel.writeDouble(bb)
        parcel.writeDouble(hasil)
        parcel.writeString(kondisi)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<DataParcel> {
        override fun createFromParcel(parcel: Parcel): DataParcel {
            return DataParcel(parcel)
        }

        override fun newArray(size: Int): Array<DataParcel?> {
            return arrayOfNulls(size)
        }
    }
}
