package espresso;


import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import com.example.parcial1.R;

import org.junit.Rule;
import org.junit.Test;


public class MainActivity {
    @Rule
    public ActivityTestRule<com.example.parcial1.MainActivity> mActivityRule = new ActivityTestRule<>(com.example.parcial1.MainActivity.class);



    @Test
    public void testMultiply()
    {
        // Type the numbers to multiply into the appropriate EditText fields.
        Espresso.onView(ViewMatchers.withId(R.id.et_num1)).perform(ViewActions.typeText("5"));
        Espresso.onView(ViewMatchers.withId(R.id.et_num2)).perform(ViewActions.typeText("7"));

        // Click the "Multiply" button.
        Espresso.onView(ViewMatchers.withId(R.id.btn_multiply)).perform(ViewActions.click());



    }

    @Test
    public void testFibonacci()
    {
        // Type the Fibonacci number into the appropriate EditText field.
        Espresso.onView(ViewMatchers.withId(R.id.et_num1)).perform(ViewActions.typeText("8"));
        Espresso.onView(ViewMatchers.withId(R.id.et_num2)).perform(ViewActions.typeText("13"));
        // Click the "Calculate" button.
        Espresso.onView(ViewMatchers.withId(R.id.btn_fibonacci)).perform(ViewActions.click());


    }


    @Test
    public void testPower()
    {
        // Type the base and exponent values into the appropriate EditText fields.
        Espresso.onView(ViewMatchers.withId(R.id.et_num1)).perform(ViewActions.typeText("3"));
        Espresso.onView(ViewMatchers.withId(R.id.et_num2)).perform(ViewActions.typeText("4"));

        // Click the "Calculate" button.
        Espresso.onView(ViewMatchers.withId(R.id.btn_power)).perform(ViewActions.click());

        // Verify that the result TextView displays the correct value

    }
}

