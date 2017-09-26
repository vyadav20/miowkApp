/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that shows the number category
        TextView number = (TextView) findViewById(R.id.numbers);

        //set a clickListener on the view
        number.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //create a new intent to open the {@link numberActivity}
                Intent numberIntent = new Intent(MainActivity.this, NumberActivity.class);
                //start the new Activity
                startActivity(numberIntent);
            }
        });


        TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(numberIntent);
            }
        });

        TextView color = (TextView) findViewById(R.id.colors);

        color.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(numberIntent);
            }
        });

        TextView phrase = (TextView) findViewById(R.id.phrases);

        phrase.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent numberIntent = new Intent(MainActivity.this, PhraseActivity.class);
                startActivity(numberIntent);
            }
        });
    }
}
