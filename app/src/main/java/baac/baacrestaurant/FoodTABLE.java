package baac.baacrestaurant;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by BAAC on 19/10/2015.
 */
public class FoodTABLE {
    //Explicit
    private MyOpenHelper objMyOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase;
    private SQLiteDatabase readSqLiteDatabase;

    public static final String FOOD_TABLE = "foodTABLE";
    public static final String COLUMN_ID_FOOD = "_id";
    public static final String COLUMN_FOOD = "Food";
    public static final String COLUMN_SOURCE = "Source";
    public static final String COLUMN_PRICE = "Price";


    public FoodTABLE(Context context) {

        objMyOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqLiteDatabase = objMyOpenHelper.getReadableDatabase();

    }   //Constructor

    public long addNewFood(String strFood,String strSource,String strPrice) {

        ContentValues objContentValue = new ContentValues();
        objContentValue.put(COLUMN_FOOD,strFood);
        objContentValue.put(COLUMN_SOURCE,strSource);
        objContentValue.put(COLUMN_PRICE,strPrice);

        return writeSqLiteDatabase.insert(FOOD_TABLE,null,objContentValue);
    }

}   //Main Class
