package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prepare SimpleDB();

        LinearLayout ll=(LinearLayout) findViewByld(R.id.itemList);

        for(int i =0; i< SimpleDB.gentIndexes().size();i++){
            Button button =new AppCompatButton(this);
            button.setText(SimpleDB.getIndexes().get(i));

            button.setOnClickListener(new View.OnClickListener(){
                @Override

            });

            ll.addView(button);
        }
    }
    private void prepareSimpleDB(){
        for(int i=1; i<100;i++){
            SimpleDB.addArticle(i+"번글",new ArticleVO(i, i+"번글 제목",i+"번글 내용","내가"));
        }
    }
}