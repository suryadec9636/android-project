package com.example.suryadev.cardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

import static android.media.CamcorderProfile.get;
import static java.util.Arrays.asList;

public class tutorial extends AppCompatActivity {
    ListView contents;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial);
        contents = findViewById(R.id.list_item);
        final ArrayList<String> content = new ArrayList<String>(asList("Basic Syntax","Variable Types","Basic Operators","Decision Making","Loops","Numbers","Strings","Lists","Tuples","Dictionary","Files I/O","Exceptions Handling"));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,content);
        contents.setAdapter(arrayAdapter);
        contents.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                 switch (i){
                     case 0:
                     {
                         intent = new Intent(tutorial.this,tutorial_basics.class);
                         startActivity(intent);
                         break;}
                     case 1:
                     {
                         Intent intent1 = new Intent(tutorial.this,tutorial_variables.class);
                         startActivity(intent1);
                         break;}

                     case 2:
                     {
                         intent = new Intent(tutorial.this,tutorial_operators.class);
                         startActivity(intent);

                         break;}
                     case 3:{
                         intent = new Intent(tutorial.this,decisionMaking.class);
                         startActivity(intent);
                         break;}
                     case 4 :
                     {intent =new Intent(tutorial.this,tutorial_loops.class);
                     startActivity(intent);
                     break;}
                     case 5:{
                         intent = new Intent(tutorial.this,tutorial_numbers.class);
                         startActivity(intent);
                         break;
                     }
                     case 6:{
                         intent = new Intent(tutorial.this,tutorial_strings.class);
                         startActivity(intent);
                         break;
                     }
                     case 7:{
                         intent = new Intent(tutorial.this,tutorial_list.class);
                         startActivity(intent);
                         break;
                     }
                     case 8:{
                         intent = new Intent(tutorial.this,tutorials_tuples.class);
                         startActivity(intent);
                         break;

                     }
                     case 9:{
                         intent = new Intent(tutorial.this,tutorial_dictionary.class);
                         startActivity(intent);
                         break;

                     }
                     case 10:{
                         intent = new Intent(tutorial.this,tutorial_files.class);
                         startActivity(intent);
                         break;
                     }
                     case 11:{
                         intent = new Intent(tutorial.this,tutorial_exceptions.class);
                         startActivity(intent);
                         break;
                     }


                 }


                }

        });

    }
}
