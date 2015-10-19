package baac.baacrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private UserTABLE objUserTABLE;
    private FoodTABLE objFoodTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create and Connect Database
        createAndConnect();

        //Tester Add New Value
        testerAdd();

    }   //Main method

    private void testerAdd() {
        objUserTABLE.addNewUser("testUser","testPassword","ทดสอบชื่อภาษาไทย");
        objFoodTABLE.addNewFood("ชื่ออาหาร","testSource","123");
    }

    private void createAndConnect() {

        objUserTABLE = new UserTABLE(this);
        objFoodTABLE = new FoodTABLE(this);
    }

}   //Main class
