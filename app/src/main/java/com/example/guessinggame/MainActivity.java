package com.example.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkGuess(View view)
    {
        EditText userInput = findViewById(R.id.userInput);
        String text = userInput.getText().toString();
        int guess = Integer.parseInt(text);

        String toastText = game.Check(guess) ? "You won!" : "Incorrect... Try again!";

        Toast toast = Toast.makeText(this, toastText, Toast.LENGTH_LONG);

        toast.show();
    }
}