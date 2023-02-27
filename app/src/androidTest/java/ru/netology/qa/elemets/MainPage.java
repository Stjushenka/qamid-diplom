package ru.netology.qa.elemets;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.netology.qa.util.Util.withIndex;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;
import ru.netology.qa.steps.MainSteps;


public class MainPage extends MainSteps {

    public static Matcher<View> getMainElementsButtonAllNews() {
        return withId(R.id.all_news_text_view);
    }

    public static Matcher<View> getMainElementsButtonClaims() {
        return withId(R.id.all_claims_text_view);
    }

    public static Matcher<View> clickDropDownListNews() {
        return withIndex(withId(R.id.expand_material_button), 0);
    }

    public static Matcher<View> clickDropDownListNewInBlock() {
        return withIndex(withId(R.id.container_list_news_include_on_fragment_main), 0);
    }

    public static Matcher<View> clickDropDownListClaims() {
        return withIndex(withId(R.id.expand_material_button), 1);
    }
}