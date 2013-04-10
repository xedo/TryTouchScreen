package com.echedeylima.trytouchscreen;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class PantallaTactiyActivity extends Activity implements OnTouchListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla_tactiy);
		TextView entrada = (TextView)findViewById(R.id.textViewEntrada);
		entrada.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla_tactiy, menu);
		return true;
	}

	@Override
	public boolean onTouch(View vista, MotionEvent evento) {
		TextView salida = (TextView)findViewById(R.id.textViewSalida);
		salida.append(evento.toString() + "\n");
		return true;
	}

}
