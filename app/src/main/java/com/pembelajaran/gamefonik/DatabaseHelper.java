package com.pembelajaran.gamefonik;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final String DATABASE_NAME = "gamefonik.db";
    public static final String TABLE1 = "t_user";
    public static final String TABLE2 = "t_soal";
    public static final String TABLE3 = "t_nilai";


    SQLiteDatabase db;

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String t_user = "CREATE TABLE "+TABLE1+"(ID INTEGER PRIMARY KEY , username TEXT, password TEXT, " +
                "nama_lengkap TEXT, alamat TEXT, jenis_kel TEXT, tgl_lahir TEXT, " +
                "foto_profil BLOB)";

        db.execSQL(t_user);

    }

    public void queryData(String sql){
        SQLiteDatabase database = getWritableDatabase();
        database.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE1);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE2);
        db.execSQL("DROP TABLE IF EXISTS "+TABLE3);
        onCreate(db);
    }

    public Cursor LihatData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("Select * from " + TABLE1, null);
        return res;
    }

    public Cursor getData(String sql){
        SQLiteDatabase database = getReadableDatabase();
        return database.rawQuery(sql, null);
    }

    public  void deleteData(int ID) {
        SQLiteDatabase database = getWritableDatabase();

        String sql = "DELETE FROM t_user WHERE ID = ?";
        SQLiteStatement statement = database.compileStatement(sql);
        statement.clearBindings();
        statement.bindDouble(1, (double)ID);

        statement.execute();
        database.close();
    }
    public void updateData(String user, String password,String nama_lengkap, String alamat,
                           String jenis_kel,String tgl_lahir, byte[] foto_profil, int ID) {
        SQLiteDatabase database = getWritableDatabase();

        String sql = "UPDATE t_user SET user = ?, password = ?, nama_lengkap = ?,alamat= ? ," +
                "jenis_kel = ?, tgl_lahir = ?, foto_profil = ? WHERE ID = ?";
        SQLiteStatement statement = database.compileStatement(sql);

        statement.bindString(1, user);
        statement.bindString(2, password);
        statement.bindString(3,nama_lengkap);
        statement.bindString(4,alamat);
        statement.bindString(5,jenis_kel);
        statement.bindString(6,tgl_lahir);
        statement.bindBlob(7, foto_profil);
        statement.bindDouble(8, ID);

        statement.execute();
        database.close();
    }

    public long addUser(String user, String password,String nama_lengkap, String alamat,
                        String jenis_kel,String tgl_lahir, byte[] foto_profil) throws SQLException
    {
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
        contentValues.put("foto_profil",foto_profil);
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
            String[] columns = {TABLE1};
            SQLiteDatabase db = getReadableDatabase();
            String selection = username + "=?" + " and " + password + "=?";
            String[] selectionArgs = {username, password};
            Cursor cursor = db.query(TABLE1, columns, selection, selectionArgs, null, null, null);
            int count = cursor.getCount();
            cursor.close();
            db.close();

            return count > 0;
        }
    }

}
