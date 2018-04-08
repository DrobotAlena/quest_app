package nsu.fit.questapp.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nsu.fit.questapp.R;

public class QuestActivity extends AppCompatActivity {

    public static void start(Context context) {
        context.startActivity(new Intent(context, QuestActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest);
    }
}
