package id.ac.poliban.mi.va.erika.recipeassignmenterika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeMethodActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_method);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String item_name = null;
        if (extras != null) {
            item_name = extras.getString(RecipeListAdapter.EXTRA_NAME);
        }
        TextView heading = findViewById(R.id.food_name);
        TextView desc = findViewById(R.id.recipe_description);
        ImageView imageView = findViewById(R.id.food_image);
        heading.setText(item_name);
        if (item_name != null) {
            switch (item_name){
                case "Mini Pizza":
                    imageView.setImageResource(R.drawable.mini_pizza);
                    desc.setText(R.string.MiniPizza);
                    break;
                case "Pepperoni Pizza Crescent Rolls":
                    imageView.setImageResource(R.drawable.pizza_rolls);
                    desc.setText(R.string.PepperoniPizzaCrescentRolls);
                    break;
                case "Pepperoni Pizza Bread":
                    imageView.setImageResource(R.drawable.pizzabread);
                    desc.setText(R.string.PepperoniPizzaBread);
                    break;
                case "Pizza Crescent Ring":
                    imageView.setImageResource(R.drawable.pizzacrescentring);
                    desc.setText(R.string.PizzaCrescentRing);
                    break;
                case "Hummingbird Cake":
                    imageView.setImageResource(R.drawable.hummingbirdcake);
                    desc.setText(R.string.HummingbirdCake);
                    break;
                case "British Christmas Pudding":
                    imageView.setImageResource(R.drawable.britishchristmaspudding);
                    desc.setText(R.string.BritishChristmasPudding);
                    break;
                default: break;
            }
        }
    }
}