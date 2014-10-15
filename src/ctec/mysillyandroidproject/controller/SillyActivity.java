package ctec.mysillyandroidproject.controller;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SillyActivity extends Activity 
{
	private Button appBloodRedButton;
	private Button appBrightOrangeButton;
	private Button appLemonYellowButton;
	private Button appNeonGreenButton;
	private Button appForestGreenButton;
	private Button appSeaFoamGreenButton;
	private Button appCyanBlueButton;
	private Button appSkyBlueButton;
	private Button appTARDISBlueButton;
	private Button appDarkPurpleButton;
	private Button appPrettyPurpleButton;
	private RelativeLayout appLayout;
	private ArrayList<Integer> colorList;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_silly);
		
		//Gives you access to a button or any View object
		appBloodRedButton = (Button) findViewById(R.id.bloodRedButton);
		appBrightOrangeButton = (Button) findViewById(R.id.brightOrangeButton);
		appLemonYellowButton = (Button) findViewById(R.id.lemonYellowButton);
		appNeonGreenButton = (Button) findViewById(R.id.neonGreenButton);
		appForestGreenButton = (Button) findViewById(R.id.forestGreenButton);
		appSeaFoamGreenButton = (Button) findViewById(R.id.seaFoamGreenButton);
		appCyanBlueButton = (Button) findViewById(R.id.cyanBlueButton);
		appSkyBlueButton = (Button) findViewById(R.id.skyBlueButton);
		appTARDISBlueButton = (Button) findViewById(R.id.tARDISBlueButton);
		appDarkPurpleButton = (Button) findViewById(R.id.darkPurpleButton);
		appPrettyPurpleButton = (Button) findViewById(R.id.prettyPurpleButton);
		appText = (TextView) findViewById(R.id.sillyTextView);
		appLayout = (RelativeLayout) findViewById(R.id.appLayout);
		
		colorList = new ArrayList<Integer>();
		
		setupListeners();
	}
	
	private void filltheColorList()
	{
		colorList.add(R.color.bloodRed);
		colorList.add(R.color.brightOrange);
		colorList.add(R.color.lemonYellow);
		colorList.add(R.color.neonGreen);
		colorList.add(R.color.forestGreen);
		colorList.add(R.color.seaFoamGreen);
		colorList.add(R.color.cyanBlue);
		colorList.add(R.color.skyBlue);
		colorList.add(R.color.tARDISBlue);
		colorList.add(R.color.darkPurple);
		colorList.add(R.color.prettyPurple);
	}
	private void setupListeners()
	{
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.bloodRed);
				
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.brightOrange);
				
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.lemonYellow);
				
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.neonGreen);
			
			}
		});
	
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.forestGreen);
			
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
			@Override
			public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.seaFoamGreen);
	
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
		@Override
		public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.cyanBlue);
	
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{
		
		@Override
		public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.skyBlue);
	
			}
		});
		
		appButton.setOnClickListener(new View.OnClickListener() 
		{	

		@Override
		public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.tARDISBlue);
	
			}
		});
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
		@Override
		public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.darkPurple);
	
			}
		});
		appButton.setOnClickListener(new View.OnClickListener() 
		{
			
		@Override
		public void onClick(View v) 
			{
				appLayout.setBackgroundResource(R.color.prettyPurple);
	
			}
	});
	}
}
