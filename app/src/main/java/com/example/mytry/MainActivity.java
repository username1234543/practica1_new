package com.example.mytry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Log.d(TAG, "OnCreate");
        //Log.i(TAG, "Это мое сообщение для записи в журнале");
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";

        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Toast. Work.", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnStart");
        String a = "23k";
        //int number = Integer.parseInt(a);
        try{
            int number = Integer.parseInt(a);
        } catch (Throwable t) {
            Log.e(TAG, "Error!");
        }

    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Toast now is sleeping", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Bye bye, Toast", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Wait STOP!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Toast is waiting", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnResume");
    }
    public void b_exitClick(View view){
        //Type_object var_name = (Type_object)findViewById(R.id.b_exit);
        Toast.makeText(this, "Bye bye, Toast", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "OnDestroy");
        System.exit(0);
    }

    View.OnClickListener listener = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            //
        }
    };
}