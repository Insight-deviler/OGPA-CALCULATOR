package sar.id.ogpa.cal;

import android.app.Activity;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.graphics.Typeface;
import java.text.DecimalFormat;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.DialogFragment;


public class MainActivity extends  Activity { 
	
	
	private String totalCredit = "";
	private String totalValue = "";
	private String OGPA = "";
	private HashMap<String, Object> UpdatifyMap = new HashMap<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear8;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear31;
	private LinearLayout linear32;
	private LinearLayout linear33;
	private TextView textview1;
	private TextView total_credit;
	private LinearLayout linear3;
	private LinearLayout linear10;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private EditText edittext1;
	private EditText edittext2;
	private EditText edittext3;
	private EditText edittext4;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private EditText edittext5;
	private EditText edittext6;
	private EditText edittext7;
	private EditText edittext8;
	private TextView textview2;
	private TextView total_value;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private EditText edittext9;
	private EditText edittext10;
	private EditText edittext11;
	private EditText edittext12;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private EditText edittext13;
	private EditText edittext14;
	private EditText edittext15;
	private EditText edittext16;
	private TextView textview3;
	private TextView ogpa;
	private Button button1;
	private Button button2;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		textview1 = (TextView) findViewById(R.id.textview1);
		total_credit = (TextView) findViewById(R.id.total_credit);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		edittext2 = (EditText) findViewById(R.id.edittext2);
		edittext3 = (EditText) findViewById(R.id.edittext3);
		edittext4 = (EditText) findViewById(R.id.edittext4);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		edittext5 = (EditText) findViewById(R.id.edittext5);
		edittext6 = (EditText) findViewById(R.id.edittext6);
		edittext7 = (EditText) findViewById(R.id.edittext7);
		edittext8 = (EditText) findViewById(R.id.edittext8);
		textview2 = (TextView) findViewById(R.id.textview2);
		total_value = (TextView) findViewById(R.id.total_value);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		edittext9 = (EditText) findViewById(R.id.edittext9);
		edittext10 = (EditText) findViewById(R.id.edittext10);
		edittext11 = (EditText) findViewById(R.id.edittext11);
		edittext12 = (EditText) findViewById(R.id.edittext12);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		edittext13 = (EditText) findViewById(R.id.edittext13);
		edittext14 = (EditText) findViewById(R.id.edittext14);
		edittext15 = (EditText) findViewById(R.id.edittext15);
		edittext16 = (EditText) findViewById(R.id.edittext16);
		textview3 = (TextView) findViewById(R.id.textview3);
		ogpa = (TextView) findViewById(R.id.ogpa);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (edittext1.getText().toString().equals("")) {
					edittext1.setText("0");
				}
				else {
					
				}
				if (edittext2.getText().toString().equals("")) {
					edittext2.setText("0");
				}
				else {
					
				}
				if (edittext3.getText().toString().equals("")) {
					edittext3.setText("0");
				}
				else {
					
				}
				if (edittext4.getText().toString().equals("")) {
					edittext4.setText("0");
				}
				else {
					
				}
				if (edittext5.getText().toString().equals("")) {
					edittext5.setText("0");
				}
				else {
					
				}
				if (edittext6.getText().toString().equals("")) {
					edittext6.setText("0");
				}
				else {
					
				}
				if (edittext7.getText().toString().equals("")) {
					edittext7.setText("0");
				}
				else {
					
				}
				if (edittext8.getText().toString().equals("")) {
					edittext8.setText("0");
				}
				else {
					
				}
				if (edittext9.getText().toString().equals("")) {
					edittext9.setText("0");
				}
				else {
					
				}
				if (edittext10.getText().toString().equals("")) {
					edittext10.setText("0");
				}
				else {
					
				}
				if (edittext11.getText().toString().equals("")) {
					edittext11.setText("0");
				}
				else {
					
				}
				if (edittext12.getText().toString().equals("")) {
					edittext12.setText("0");
				}
				else {
					
				}
				if (edittext13.getText().toString().equals("")) {
					edittext13.setText("0");
				}
				else {
					
				}
				if (edittext14.getText().toString().equals("")) {
					edittext14.setText("0");
				}
				else {
					
				}
				if (edittext15.getText().toString().equals("")) {
					edittext15.setText("0");
				}
				else {
					
				}
				if (edittext16.getText().toString().equals("")) {
					edittext16.setText("0");
				}
				else {
					
				}
				totalCredit = new DecimalFormat("0.00").format(((Double.parseDouble(edittext1.getText().toString()) + Double.parseDouble(edittext2.getText().toString())) + (Double.parseDouble(edittext3.getText().toString()) + Double.parseDouble(edittext4.getText().toString()))) + ((Double.parseDouble(edittext5.getText().toString()) + Double.parseDouble(edittext6.getText().toString())) + (Double.parseDouble(edittext7.getText().toString()) + Double.parseDouble(edittext8.getText().toString()))));
				total_credit.setText(totalCredit);
				totalValue = new DecimalFormat("0.00").format(((Double.parseDouble(edittext9.getText().toString()) + Double.parseDouble(edittext10.getText().toString())) + (Double.parseDouble(edittext11.getText().toString()) + Double.parseDouble(edittext12.getText().toString()))) + ((Double.parseDouble(edittext13.getText().toString()) + Double.parseDouble(edittext14.getText().toString())) + (Double.parseDouble(edittext15.getText().toString()) + Double.parseDouble(edittext16.getText().toString()))));
				total_value.setText(totalValue);
				OGPA = new DecimalFormat("0.00").format(Double.parseDouble(totalValue) / Double.parseDouble(totalCredit));
				ogpa.setText(OGPA);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				edittext1.setText("");
				edittext3.setText("");
				edittext4.setText("");
				edittext5.setText("");
				edittext6.setText("");
				edittext7.setText("");
				edittext8.setText("");
				edittext9.setText("");
				edittext10.setText("");
				edittext11.setText("");
				edittext12.setText("");
				edittext13.setText("");
				edittext14.setText("");
				edittext15.setText("");
				edittext16.setText("");
				edittext2.setText("");
				total_value.setText("");
				total_credit.setText("");
				ogpa.setText("");
			}
		});
	}
	
	private void initializeLogic() {
		int[] colorsCRNFM = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNFM = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNFM);
		CRNFM.setCornerRadii(new float[]{(int)21,(int)21,(int)21,(int)21,(int)0,(int)0,(int)0,(int)0});
		CRNFM.setStroke((int) 0, Color.parseColor("#000000"));
		linear8.setElevation((float) 5);
		linear8.setBackground(CRNFM);
		//Paste this code in (add source directly block) asd block
		//Milz
		int[] colorsCRNZM = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNZM = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNZM);
		CRNZM.setCornerRadii(new float[]{(int)21,(int)21,(int)21,(int)21,(int)0,(int)0,(int)0,(int)0});
		CRNZM.setStroke((int) 0, Color.parseColor("#000000"));
		linear16.setElevation((float) 5);
		linear16.setBackground(CRNZM);
		//Paste this code in (add source directly block) asd block
		//Milz
		int[] colorsCRNAZ = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNAZ = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNAZ);
		CRNAZ.setCornerRadii(new float[]{(int)21,(int)21,(int)21,(int)21,(int)21,(int)21,(int)21,(int)21});
		CRNAZ.setStroke((int) 0, Color.parseColor("#000000"));
		linear31.setElevation((float) 5);
		linear31.setBackground(CRNAZ);
		//Paste this code in (add source directly block) asd block
		//Milz
		int[] colorsCRNJL = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNJL = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNJL);
		CRNJL.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)21,(int)21,(int)21,(int)21});
		CRNJL.setStroke((int) 0, Color.parseColor("#000000"));
		linear15.setElevation((float) 5);
		linear15.setBackground(CRNJL);
		//Paste this code in (add source directly block) asd block
		//Milz
		int[] colorsCRNJB = { Color.parseColor("#ffffff"), Color.parseColor("#ffffff") }; android.graphics.drawable.GradientDrawable CRNJB = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colorsCRNJB);
		CRNJB.setCornerRadii(new float[]{(int)0,(int)0,(int)0,(int)0,(int)21,(int)21,(int)21,(int)21});
		CRNJB.setStroke((int) 0, Color.parseColor("#000000"));
		linear17.setElevation((float) 5);
		linear17.setBackground(CRNJB);
		//Paste this code in (add source directly block) asd block
		//Milz
		edittext1.requestFocus();
		_typeface(textview1);
		_typeface(textview2);
		_typeface(textview3);
		_typeface_semibold(total_credit);
		_typeface_semibold(total_value);
		_typeface_semibold(ogpa);
		_typeface_semibold(button1);
		_typeface_semibold(button2);
		_type_face(edittext1);
		_type_face(edittext2);
		_type_face(edittext3);
		_type_face(edittext4);
		_type_face(edittext5);
		_type_face(edittext6);
		_type_face(edittext7);
		_type_face(edittext8);
		_type_face(edittext9);
		_type_face(edittext10);
		_type_face(edittext11);
		_type_face(edittext12);
		_type_face(edittext13);
		_type_face(edittext14);
		_type_face(edittext15);
		_type_face(edittext16);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _typeface (final TextView _textview) {
		_textview.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansbold.ttf"), 1);
	}
	
	
	public void _type_face (final TextView _view) {
		_view.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansregular.ttf"), 0);
	}
	
	
	public void _typeface_semibold (final TextView _tect) {
		_tect.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/sansmedium.ttf"), 0);
	}
	
	
	
}
