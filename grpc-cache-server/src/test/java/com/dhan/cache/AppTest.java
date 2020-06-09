package com.dhan.cache;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AppTest {

    // End the server gracefully
    @Ignore
    @Test
    public void smokeTest(){
        String[] args = {};

        try {
            App.main(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail("Exception occurred");
        }
    }
}
