package com.asynktask.asynk_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.WeakReference;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    myclcass myclcass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void start(View view) {
        myclcass  = new myclcass();
        myclcass.execute(1);
    }


    private  class myclcass extends AsyncTask<Integer,Integer,Integer>{
         String string = "AsynkTask";
        int  count = 0; //predefine here
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.e(string,"On pre execute started ");
        }

        @Override
        protected Integer doInBackground(Integer... integers) {
            count = integers[0];
            Log.e(string,"On do in background started ");
            for(int i = 0;i< 10;i++){

                try {
                    Thread.sleep(1000);
                    count++;
                    publishProgress(count);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

            return null;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            Log.e(string,"On progress update started ");
            Log.e(string,"progress  "+ values[0]);

        }

        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
            count = integer;
            Log.e(string,"on post execution started ");
            Log.e(string,"On result "+ integer);

        }
    }


}