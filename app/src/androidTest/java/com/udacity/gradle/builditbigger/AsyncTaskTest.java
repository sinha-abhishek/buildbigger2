package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Pair;

import com.udacity.gradle.builditbigger.asyncTask.EndpointsAsyncTask;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncTaskTest extends AndroidTestCase {
    public void testGetJokeTask() {
        try {
            EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask();
            endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), null));
            String joke = endpointsAsyncTask.get(60, TimeUnit.SECONDS);
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
            fail("Timeout");
        } catch (ExecutionException e) {
            e.printStackTrace();
            fail("Timeout");
        } catch (TimeoutException e) {
            e.printStackTrace();
            fail("Timeout");
        }
    }
}
