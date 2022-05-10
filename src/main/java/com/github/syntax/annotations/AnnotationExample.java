package com.github.syntax.annotations;

import java.lang.annotation.Repeatable;

@ClassPreamble(
        author = "John Doe",
        date = "3/17/2002",
        currentRevision = 6,
        lastModified = "4/12/2004",
        lastModifiedBy = "Jane Doe",
        // Note array notation
        reviewers = {"Alice", "Bob", "Cindy"}
)
public class AnnotationExample {

    public @interface MealContainer {
        Meal[] value();
    }

    @Repeatable(MealContainer.class)
    public @interface Meal {
        String value();

        String mainDish();
    }

    @Meal(value = "breakfast", mainDish = "cereal")
    @Meal(value = "lunch", mainDish = "pizza")
    @Meal(value = "dinner", mainDish = "salad")
    public void evaluateDiet() {
    }
}
