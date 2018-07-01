package comq.example.user.quizzapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //    this methods performs the call on the first button in the app
    public void firstButton(View view) {

        Toast.makeText(this, "Incorrect, Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


    //    this methods performs the call on the second button in the app
    public void secondButton(View view) {
        Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        getScore(1);
    }


    //    this methods performs the call on the third button in the app
    public void thirdButton(View view) {
        Toast.makeText(this, "Incorrect,Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


//    this methods performs the call on the fourth button in the app

    public void fourthButton(View view) {

        Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        getScore(1);
    }


    //    this methods performs the call on the fifth button in the app
    public void fifthButton(View view) {
        Toast.makeText(this, "Incorrect,Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


    //    this methods performs the call on the sixth button in the app
    public void sixButton(View view) {
        Toast.makeText(this, "Incorrect,Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


    // this methods clear the radioButtons after reset
    public void clearAllRadioBtns() {
        RadioGroup radioGroup1 = findViewById(R.id.radio_group_one);
        radioGroup1.clearCheck();
        RadioGroup radioGroup2 = findViewById(R.id.radio_group_two);
        radioGroup2.clearCheck();
        RadioGroup radioGroup3 = findViewById(R.id.radio_group_three);
        radioGroup3.clearCheck();
        RadioGroup radioGroup4 = findViewById(R.id.radio_group_four);
        radioGroup4.clearCheck();
        RadioGroup radioGroup5 = findViewById(R.id.radio_group_five);
        radioGroup5.clearCheck();
        RadioGroup radioGroup6 = findViewById(R.id.radio_group_six);
        radioGroup6.clearCheck();
        RadioGroup radioGroup7 = findViewById(R.id.radio_group_seven);
        radioGroup7.clearCheck();
    }


    // this method clears the EditText textField on reset
    public void clearEditTextField() {
        EditText clearText = findViewById(R.id.edit_name);
        clearText.setText(null);
    }

    //this method clears the checkboxes on reset
    public void clearCheckedBoxes() {
        CheckBox checkBoxClear1 = findViewById(R.id.nigeria);
        checkBoxClear1.setChecked(false);
        CheckBox checkBoxClear2 = findViewById(R.id.spain);
        checkBoxClear2.setChecked(false);
        CheckBox checkBoxClear3 = findViewById(R.id.somalia);
        checkBoxClear3.setChecked(false);
        CheckBox checkBoxClear4 = findViewById(R.id.benin);
        checkBoxClear4.setChecked(false);
    }


    //    this methods performs the call on the seventh button in the app
    public void seventhButton(View view) {
        Toast.makeText(this, "Incorrect,Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


    //    this methods performs the call on the eighth button in the app
    public void eighthButton(View view) {
        Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
        getScore(1);
    }


    //    this methods performs the call on the ninth button in the app
    public void ninthButton(View view) {
        Toast.makeText(this, "Incorrect,Try Again!", Toast.LENGTH_SHORT).show();
        getScore(0);
    }


// calculating the score for the first question precisely targeting the RadioGroup

    public void questionOne(View view) {
        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionOneRadioGroup = findViewById(R.id.radio_group_one);

        //get the id of RadioButtons
        int radioTwo = questionOneRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution1 = questionOneRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (solution1 == R.id.second_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);


        } else if (radioTwo == R.id.first_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);

        }

    }

    //calculating score for question seven

    public void questionSeven(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionSevenRadioGroup = findViewById(R.id.radio_group_two);

        //get the id of RadioButtons
        int radioThree = questionSevenRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution7 = questionSevenRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (solution7 == R.id.third_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);


        } else if (radioThree == R.id.fourth_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);

        }

    }


    public void questionEight(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionEightRadioGroup = findViewById(R.id.radio_group_three);

        //get the id of RadioButtons
        int radioFour = questionEightRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution8 = questionEightRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (solution8 == R.id.fifth_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);


        } else if (radioFour == R.id.sixth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);

        }
    }


    public void questionNine(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionNineRadioGroup = findViewById(R.id.radio_group_four);

        //get the id of RadioButtons
        int radioFive = questionNineRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution9 = questionNineRadioGroup.getCheckedRadioButtonId();


        int radioSix = questionNineRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (radioFive == R.id.seventh_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);


        } else if (solution9 == R.id.eighth_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);

        } else if (radioSix == R.id.ninth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);

        }
    }


    public void questionTen(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionTenRadioGroup = findViewById(R.id.radio_group_five);

        //get the id of RadioButtons
        int radioSeven = questionTenRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution10 = questionTenRadioGroup.getCheckedRadioButtonId();


        int radioEight = questionTenRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (radioSeven == R.id.tenth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);


        } else if (solution10 == R.id.eleventh_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);

        } else if (radioEight == R.id.twelfth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);

        }
    }


    public void questionEleven(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionElevenRadioGroup = findViewById(R.id.radio_group_six);

        //get the id of RadioButtons
        int radioNine = questionElevenRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution11 = questionElevenRadioGroup.getCheckedRadioButtonId();


        int radioTen = questionElevenRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (radioNine == R.id.thirteenth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);


        } else if (solution11 == R.id.fourteenth_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);

        } else if (radioTen == R.id.fifteenth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);

        }
    }

    public void questionTwelve(View view) {


        //finding the id of the RadioGroup and storing it in a variable
        RadioGroup questionTwelveRadioGroup = findViewById(R.id.radio_group_seven);

        //get the id of RadioButtons
        int radioEleven = questionTwelveRadioGroup.getCheckedRadioButtonId();

        //get the id of the RadioButton that is checked and store it as an integer variable

        int solution12 = questionTwelveRadioGroup.getCheckedRadioButtonId();


        int radioTwelve = questionTwelveRadioGroup.getCheckedRadioButtonId();

        //Perform an action based on the option chosen
        if (radioEleven == R.id.sixteenth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);


        } else if (solution12 == R.id.seventeenth_radio_button) {
            Toast.makeText(this, "Correct Answer!", Toast.LENGTH_SHORT).show();
            getScore(1);

        } else if (radioTwelve == R.id.eighteenth_radio_button) {
            Toast.makeText(this, "Wrong Answer you are fucked lol", Toast.LENGTH_SHORT).show();
            getScore(0);
        }
    }

// this methods activates the checkbox question.

    public void myCheckBoxClicked(View view) {

        //checking if the checkbox is now checked
        boolean checked = ((CheckBox) view).isChecked();

        //checking for the correct answer and calculating the score
        switch (view.getId()) {
            case R.id.nigeria:
                if (checked)
                    Toast.makeText(this, "Correct Choice!", Toast.LENGTH_SHORT).show();
                getScore(1);
                break;
            case R.id.spain:
                if (checked)
                    Toast.makeText(this, "Wrong Choice!", Toast.LENGTH_SHORT).show();
                getScore(0);
                break;
            case R.id.somalia:
                if (checked)
                    Toast.makeText(this, "Correct Choice!", Toast.LENGTH_SHORT).show();
                getScore(1);
                break;
            case R.id.benin:
                if (checked)
                    Toast.makeText(this, "Wrong Choice!", Toast.LENGTH_SHORT).show();
                getScore(0);
                break;
        }
    }

    //calculate score

    public void getScore(int myScore) {
        score += myScore;
    }

    //submitQuizzButton implementation to calculate scores
    public void submitQuizzButton(View view) {
        EditText nameField = findViewById(R.id.edit_name);
        String name = nameField.getText().toString();
        Button submitQuizzButton = (findViewById(R.id.submitbtn));
        //prevention of resubmission
        submitQuizzButton.setEnabled(false);

        Toast.makeText(this, name + "\n" + "Your Total score is: " + score + "!", Toast.LENGTH_SHORT).show();
    }

    public void resetQuizzButton(View view) {
        //reset quizz scores


//        clearing of the answers
        score = 0;
        clearAllRadioBtns();
        clearCheckedBoxes();
        clearEditTextField();


//        //this is to activate the submit and reset buttons after reset.
        Button submitQuizzButton = (findViewById(R.id.submitbtn));
        submitQuizzButton.setEnabled(true);


        Toast.makeText(this, "RESET QUIZZ", Toast.LENGTH_SHORT).show();


    }


}
