package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static org.hamcrest.Matchers.notNullValue;

/**
 * Created by Sudha on 02-Jun-18.
 */

public class NoEmptyStringAsyncTaskTest extends AndroidTestCase{
    public void testJokeDownload() {

        try {
          EndpointsAsyncTask task = new EndpointsAsyncTask(getContext(), null);
            task.execute();
            String jokes = task.get(30, TimeUnit.SECONDS);

            assertThat(jokes, notNullValue());
            assertTrue(jokes.length() > 0);

        } catch (Exception e) {
            fail("Operation timed out");
        }
    }
}
