package ru.synergy.asyncexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

public class AsyncTaskExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task_example);

        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute("I will destroy you!");
    }
}

class MyAsyncTask extends AsyncTask<String, Integer, Integer> {
    @Override
    protected void onPostExecute(Integer integer) {
        super.onPostExecute(integer);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Integer doInBackground(String... strings) {
//        TextView view = (TextView) getActivity().findById(R.id.textView);
        int myProgress = 0;
        publishProgress(myProgress);
        int result = myProgress++;
        cancel();
        return result;
    }
}