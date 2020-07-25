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
       String t_user = "CREATE TABLE "+TABLE1+"(id INTEGER PRIMARY KEY NOT NULL, username TEXT NOT NULL, password TEXT NOT NULL, " +
                "nama_lengkap TEXT NOT NULL, alamat TEXT NOT NULL, jenis_kel TEXT NOT NULL, tgl_lahir TEXT NOT NULL, " +
                "foto_profil BLOB)";
        db.execSQL(t_user);
        String t_soal = "CREATE TABLE "+TABLE2+"(id_soal INTEGER PRIMARY KEY AUTOINCREMENT,kata String)";
        db.execSQL(t_soal);
        t_soal = "INSERT INTO t_soal (id_soal,kata) VALUES (1,'a'),(2,'b'),(3,'c'),(4,'d'),(5,'e'),(6,'f'),(7,'g'),(8,'h')" +
                ",(9,'i'),(10,'j'),(11,'k'),(12,'l'),(13,'m'),(14,'n'),(15,'o'),(16,'p'),(17,'q'),(18,'r'),(19,'s'),(20,'t'),(21,'u'),(22,'v')" +
                ",(23,'w'),(24,'x'),(25,'y'),(26,'z'),(27,'ba'),(28,'bi'),(29,'bu'),(30,'be'),(31,'bo'),(32,'ca'),(33,'ci'),(34,'cu'),(35,'ce'),(36,'co')" +
                ",(37,'da'),(38,'di'),(39,'du'),(40,'de'),(41,'do'),(42,'fa'),(43,'fi'),(44,'fu'),(45,'fe'),(46,'fo'),(47,'ga'),(48,'gi'),(49,'gu'),(50,'ge'),(52,'go')," +
                "(53,'ha'),(54,'hi'),(55,'hu'),(56,'he'),(57,'ho'),(58,'ja'),(59,'ji'),(60,'ju'),(61,'je'),(62,'jo'),(63,'ka'),(64,'ki'),(65,'ku'),(66,'ke'),(67,'ko')," +
                "(68,'la'),(69,'li'),(70,'lu'),(71,'le'),(72,'lo'),(73,'ma'),(74,'mi'),(75,'mu'),(76,'me'),(77,'mo'),(78,'na'),(79,'ni'),(80,'nu'),(81,'ne'),(82,'no')," +
                "(83,'pa'),(84,'pi'),(85,'pu'),(86,'pe'),(87,'po'),(88,'ra'),(89,'ri'),(90,'ru'),(91,'re'),(92,'ro'),(93,'sa'),(94,'si'),(95,'su'),(96,'se'),(97,'so')," +
                "(98,'ta'),(99,'ti'),(100,'tu'),(101,'te'),(102,'to'),(103,'za'),(104,'zi'),(105,'zu'),(106,'ze'),(107,'zo'),(108,'paku'),(109,'piano'),(110,'poci'),(111,'pulpen'),"+
                "(112,'pensil'),(113,'ban'),(114,'biola'),(115,'buku'),(116,'bebek'),(117,'botol'),(118,'mata'),(119,'mistar'),(120,'mutiara'),(121,'meja'),(122,'mobil'),(123,'nasi'),"+
                "(124,'nenek'),(125,'tas'),(126,'tikus'),(127,'tupai'),(128,'tupai'),(129,'teko'),(130,'toko'),(131,'radio'),(132,'rumah'),(133,'roti'),(134,'laut'),(135,'lilin'),(136,'lebah'),"+
                "(137,'lonceng'),(138,'sabun'),(139,'siku'),(140,'susu'),(141,'sekolah'),(142,'gaun'),(143,'gitar'),(144,'gula'),(145,'gelas'),(146,'hidung'),(147,'hutan'),(148,'helm'),(149,'hotel'),"+
                "(150,'jam'),(151,'jilbab'),(152,'kaleng'),(153,'kue'),(154,'kertas'),(155,'cabai'),(156,'cincin'),(157,'cuka'),(158,'celana'),(159,'dadu'),(160,'dipan'),(161,'duri'),(162,'domba'),(163,'wayang')";
        db.execSQL(t_soal);
        //String t_nilai = "CREATE TABLE "+TABLE3+"(" +
                //"id_nilai INTEGER PRIMARY KEY AUTOINCREMENT," +
                //"id_soal Integer," +
                //"FOREIGN KEY (id_soal) REFERENCES t_soal(id_soal),"+
                //"id_user INTEGER," +
                //"FOREIGN KEY (id_user) REFERENCES t_user(id),"+
                //"tanggal DATE)";
        //db.execSQL(t_nilai);



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

    public void insertData(String kata){


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
