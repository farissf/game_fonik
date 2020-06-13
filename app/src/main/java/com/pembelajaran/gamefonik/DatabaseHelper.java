package com.pembelajaran.gamefonik;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "gamefonik.db";
    public static final String TABLE_NAME = "t_user";
    public static final String COL_ID = "ID";
    public static final String COL_USER = "username";
    public static final String COL_PASS = "password";
    public static final String COL_NAMA_LENGKAP = "nama_lengkap";
    public static final String COL_ALAMAT = "alamat";
    public static final String COL_JK = "jenis_kel";
    public static final String COL_TL = "tgl_lahir";
    public static final String COL_FOTO = "foto_profil";

    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+ TABLE_NAME + "(ID TEXT PRIMARY KEY, username TEXT, password TEXT, nama_lengkap TEXT, alamat TEXT, jenis_kel TEXT, tgl_lahir TEXT, foto_profil BLOB)");
        this.db = db;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS "+ TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }

    public long addUser(String user, String password,String nama_lengkap, String alamat, String jenis_kel,String tgl_lahir){
        db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //create a string query
//        String query = "select  * from t_user ";
//        Cursor cursor = db.rawQuery(query, null);

        contentValues.put("username",user);
        contentValues.put("password",password);
        contentValues.put("nama_lengkap",nama_lengkap);
        contentValues.put("alamat",alamat);
        contentValues.put("jenis_kel",jenis_kel);
        contentValues.put("tgl_lahir",tgl_lahir);
//        contentValues.put("foto_profil",foto_profil);
        long res = db.insert("t_user",null, contentValues);
        db.close();
        return res;
    }

    public boolean checkUser(String username, String password){
        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
        {
            return false;
        }
        else {
            String[] columns = {COL_ID};
            SQLiteDatabase db = getReadableDatabase();
            String selection = COL_USER + "=?" + " and " + COL_PASS + "=?";
            String[] selectionArgs = {username, password};
            Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null);
            int count = cursor.getCount();
            cursor.close();
            db.close();

            return count > 0;
        }
    }
}
