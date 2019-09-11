package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	//  TODO: deklarasikan variabel di sini
	int number, tempNumber;
	EditText nameInput;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		nameInput = findViewById(R.id.number_input);
		initRandomNumber();
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random random = new Random();
		number = random.nextInt(100) + 1;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan
		//  pengecekan angka
		tempNumber = Integer.parseInt(nameInput.getText().toString());
		if (tempNumber>number) Toast.makeText(this, "tebakan terlalu besar", Toast.LENGTH_SHORT).show();
		else if (tempNumber<number) Toast.makeText(this, "tebakan terlalu kecil", Toast.LENGTH_SHORT).show();
		else Toast.makeText(this, "anda benar", Toast.LENGTH_SHORT).show();
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		initRandomNumber();
	}
}
