/*
 * Copyright (C) 2012 Mobs and Geeks
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

package com.mobsandgeeks.widget.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

import com.mobsandgeeks.widget.R;
import com.mobsandgeeks.widget.DeselectableRadioButton;

/**
* @author Ragunath Jawahar R <rj@mobsandgeeks.com>
* @version 0.1
*/
public class DemoActivity extends Activity implements OnCheckedChangeListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
        
        // UI References
        DeselectableRadioButton inkyRadioButton = (DeselectableRadioButton) findViewById(R.id.inky);
        DeselectableRadioButton pinkyRadioButton = (DeselectableRadioButton) findViewById(R.id.pinky);
        DeselectableRadioButton ponkyRadioButton = (DeselectableRadioButton) findViewById(R.id.ponky);
        
        // Event listeners
        inkyRadioButton.setOnCheckedChangeListener(this);
        pinkyRadioButton.setOnCheckedChangeListener(this);
        ponkyRadioButton.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(isChecked) {
            int messageResId = R.string.app_name;
            
            switch(buttonView.getId()) {
            case R.id.inky:
                messageResId = R.string.inky;
                break;
            case R.id.pinky:
                messageResId = R.string.pinky;
                break;
            case R.id.ponky:
                messageResId = R.string.ponky;
                break;
            }
            
            Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
        }
    }    
}
