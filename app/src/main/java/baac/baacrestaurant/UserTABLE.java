package baac.baacrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by BAAC on 19/10/2015.
 */
public class UserTABLE {

    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String USER_TABLE = "userTABLE";
    public static final String COLUMN_ID_USER = "_id";
    public static final String COLUMN_USER = "User";
    public static final String COLUMN_PASSWORD = "Password";
    public static final String COLUMN_NAME = "Name";

    public UserTABLE(Context context) {
        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();
    }   //Constructor

    public long addNewUser(String strUser,String strPassword,String strName) {

        ContentValues objContentValue = new ContentValues();
        objContentValue.put(COLUMN_USER,strUser);
        objContentValue.put(COLUMN_PASSWORD,strPassword);
        objContentValue.put(COLUMN_NAME,strName);

        return writeSqLiteDatabase.insert(USER_TABLE,null,objContentValue);
    }

}   //Main class
