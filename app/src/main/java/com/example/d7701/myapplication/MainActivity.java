package com.example.d7701.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] imgName = {"그림1", "그림2", "그림3", "그림4", "그림5", "그림6", "그림7", "그림8", "그림9"};
        final int[] voteCount = new int[imgName.length];
        for (int i=0; i<imgName.length; i++){
            voteCount[i] = 0;
        }
        ImageView[] imge = new ImageView[imgName.length];

        Integer[] imgId = {R.id.pic1,R.id.pic2,R.id.pic3,R.id.pic4,R.id.pic5,R.id.pic6,R.id.pic7,R.id.pic8,R.id.pic9};

        for(int i=0; i<imgName.length; i++){
            final int index;
            index = i;
            imge[index] = findViewById(imgId[index]);
            imge[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    voteCount[index]++;
                    Toast.makeText(MainActivity.this, imgName[index] +"가 " + voteCount[index] + "좋아요", Toast.LENGTH_SHORT).show();
                }
            });
        }

        btResult = findViewById(R.id.btResult);
        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);

            }

        });

    }
}
