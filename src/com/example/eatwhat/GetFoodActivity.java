package com.example.eatwhat;



import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class GetFoodActivity extends Activity {
	String [] food_array = {"∏…≥¥≈£∫”","≤§¬‹πæ‡‡»‚∑π","∏Ø÷Òº¶∑π","≤§¬‹πæ¬µº¶∑π","Ù˘Ω∑≈£∫”","”„œ„«—◊”≈£»‚∑π","ª¨µ∞≈£»‚∑π","ª¨µ∞œ∫» ∑π"};
	String [] button_array = {"”÷≥‘’‚∏ˆ£°£ø","ªª“ª∏ˆ!", "≥‘µΩ≈ª¡À∫√¬?", "∏“”–µ„–¬“‚√¥..", "‘Ÿπˆ∂Ø“ªœ¬~","ƒÂ≤ªƒÂ∞°"};
	int index;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		RelativeLayout rl = new RelativeLayout(this);
		 index = (int) Math.floor((Math.random()*food_array.length));
		
		//int index = 1;
		String food_name = food_array[index];
		TextView food_name_tv = new TextView(this);
		food_name_tv.setText(food_name);
		RelativeLayout.LayoutParams food_name_params = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		food_name_tv.setTextSize(30);
		food_name_tv.setGravity((Gravity.CENTER_VERTICAL) | (Gravity.CENTER_HORIZONTAL) );
		food_name_tv.setTextColor(Color.BLACK);
		food_name_tv.setId(R.id.food_name);
		rl.setBackgroundColor(Color.WHITE);
		rl.addView(food_name_tv,food_name_params);

		ImageView food_img_tv = new ImageView(this);
		RelativeLayout.LayoutParams food_img_params = new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
		food_img_tv.setId(R.id.food_img);
		
		switch (index){
			case 0:
			food_img_tv.setImageResource(R.drawable.one);
			break;
			case 1:
			food_img_tv.setImageResource(R.drawable.two);
			break;
			case 2:
			food_img_tv.setImageResource(R.drawable.three);
			break;
			case 3:
			food_img_tv.setImageResource(R.drawable.four);
			break;
			case 4:
			food_img_tv.setImageResource(R.drawable.five);
			break;
			case 5:
			food_img_tv.setImageResource(R.drawable.six);
			break;
			case 6:
			food_img_tv.setImageResource(R.drawable.seven);
			break;
			case 7:
			food_img_tv.setImageResource(R.drawable.eight);
			break;
	    }
		food_img_params.setMargins(125, 200, 0, 0);
		rl.addView(food_img_tv,food_img_params);		
		
		
		Button change_button = new Button(this);
		change_button.setText(button_array[(int) Math.floor((Math.random()*button_array.length))]);
	    RelativeLayout.LayoutParams paramsButton = new RelativeLayout.LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
	    paramsButton.setMargins(0, 750, 0, 0);
	    change_button.setGravity( (Gravity.CENTER_HORIZONTAL) );

	    change_button.setLayoutParams(paramsButton);

		rl.addView(change_button,paramsButton);

		change_button.setOnClickListener(new View.OnClickListener()   
		{
		    public void onClick(View view) 
		     {
				onCreate(null);
		       }
		});
		setContentView(rl);

		
	}

	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, StartActivity.class);
	    startActivity(intent);
	}
}
