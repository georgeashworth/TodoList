package com.georgeashworth.todolist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    private final int SUCCESS_CODE = 200;
    private int itemPos;

    public void onSubmit(View v) {
        EditText etUpdateItem = (EditText) findViewById(R.id.etUpdateItem);
        Intent data = new Intent();

        data.putExtra("itemText", etUpdateItem.getText().toString());
        data.putExtra("itemPos", itemPos);

        setResult(SUCCESS_CODE, data);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        String itemText = getIntent().getStringExtra("itemText");
        itemPos = getIntent().getIntExtra("itemPos", 0);
    }
}
