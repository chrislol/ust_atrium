
package com.example.gpa_calculator.test;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.AlertDialog.Builder;
import android.app.Instrumentation.ActivityMonitor;
import android.content.Context;
import android.os.Bundle;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asquare.R;
// com.example.gpa_calculator.GPAactivity2;
import com.example.gpa_calculator.MainActivity;
import com.example.gpa_calculator.add_course_record;
import com.example.gpa_calculator.advice1;
import com.example.gpa_calculator.advice2;
import com.example.gpa_calculator.printTGA;
import com.example.gpa_calculator.print_course_record;

//1.Change the things inside <XXXX>
public class advice1Test extends ActivityInstrumentationTestCase2<advice1> {

	//2.Change MainActivity
	private advice1 mActivity;

	//3.Change MainActivity
	public advice1Test() {
		super(advice1.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mActivity = getActivity();  
		//Calculate
		buttonGPAadvice1_1 = (Button)mActivity.findViewById(R.id.buttonGPAadvice1_1);
		//Reset
		buttonGPAadvice1_2 = (Button)mActivity.findViewById(R.id.buttonGPAadvice1_2);
		//year1-5
		RadioGroupadvice1=(RadioGroup)mActivity.findViewById(R.id.RadioGroupGPAadvice1);
		radioButtonGPAadvice1_1 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_1);
		radioButtonGPAadvice1_2 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_2);
		radioButtonGPAadvice1_3 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_3);
		radioButtonGPAadvice1_4 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_4);
		radioButtonGPAadvice1_5 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_5);
     	//Fall - Summer
     	RadioGroupadvice2=(RadioGroup)mActivity.findViewById(R.id.RadioGroupGPAadvice2);
     	radioButtonGPAadvice1_6 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_6);
     	radioButtonGPAadvice1_7 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_7);
     	radioButtonGPAadvice1_8 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_8);
     	radioButtonGPAadvice1_9 = (RadioButton)mActivity.findViewById(R.id.radioButtonGPAadvice1_9);
     	//Your Target TGA
     	editTextGPAadvice1_1 = (EditText)mActivity.findViewById(R.id.editTextGPAadvice1_1);
     	editTextGPAadvice1_2 = (EditText)mActivity.findViewById(R.id.editTextGPAadvice1_2);

	}
	
	@Override 
	protected void tearDown() throws Exception { 
		 //this method is called every time after any test execution 
		 // we want to clean the texts 
		 super.tearDown(); 
	} 


	@SmallTest // SmallTest: this test doesn't interact with any file system or network. 
	public void testView() { // checks if the activity is created 
		assertNotNull(getActivity()); 
	} 

	@MediumTest
	public void testButtonGPAadvice1_1() { 
		  ActivityMonitor activityMonitor = getInstrumentation().addMonitor(advice2.class.getName(), null, false);

		 //INTERACTIONS 
		  mActivity.runOnUiThread(new Runnable() {
			    @Override
			    public void run() {
			      // click button and open next activity.
			    	
			    	RadioGroupadvice1.check(R.id.radioButtonGPAadvice1_2);
			    	RadioGroupadvice2.check(R.id.radioButtonGPAadvice1_7);
			    	editTextGPAadvice1_1.setText("4");
			    	editTextGPAadvice1_2.setText("18");
			    	
			    	buttonGPAadvice1_1.performClick();
			    }
			  });	
		  
		 //CHECK THE RESULT
		 advice2 nextActivity = (advice2) getInstrumentation().waitForMonitor(activityMonitor);
		 assertNotNull(nextActivity);
		 nextActivity.finish();
		 
		  
	

	}
	
	@UiThreadTest
	public void testButtonGPAadvice1_2() { 
		
		 //INTERACTIONS 
		  mActivity.runOnUiThread(new Runnable() {
			    @Override
			    public void run() {
			      // click button and open next activity
			    	
			    	RadioGroupadvice1.check(R.id.radioButtonGPAadvice1_2);
			    	RadioGroupadvice2.check(R.id.radioButtonGPAadvice1_7);
			    	editTextGPAadvice1_1.setText("4");
			    	editTextGPAadvice1_2.setText("18");

			    	
			    	buttonGPAadvice1_2.performClick();
			    }
			  });	
		  
		 //CHECK THE RESULT
	
		ActivityMonitor activityMonitor = getInstrumentation().addMonitor(advice1.class.getName(), null, false);
		getInstrumentation().waitForMonitorWithTimeout(activityMonitor,5000);
		 
		  
		 assertTrue((radioButtonGPAadvice1_1.isChecked()) && (radioButtonGPAadvice1_6.isChecked()));
	}
	
	
	Button buttonGPAadvice1_1; 
	Button buttonGPAadvice1_2; 
	RadioGroup RadioGroupadvice1;
	RadioButton radioButtonGPAadvice1_1;
	RadioButton radioButtonGPAadvice1_2;
	RadioButton radioButtonGPAadvice1_3;
	RadioButton radioButtonGPAadvice1_4;
	RadioButton radioButtonGPAadvice1_5;
	RadioGroup RadioGroupadvice2;
	RadioButton radioButtonGPAadvice1_6;
	RadioButton radioButtonGPAadvice1_7;
	RadioButton radioButtonGPAadvice1_8;
	RadioButton radioButtonGPAadvice1_9;
 	EditText editTextGPAadvice1_1;
 	EditText editTextGPAadvice1_2;
	
}
