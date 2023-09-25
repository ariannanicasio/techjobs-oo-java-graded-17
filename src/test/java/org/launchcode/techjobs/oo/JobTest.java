package org.launchcode.techjobs.oo;

import org.junit.Assert;
import org.junit.Test;

public class JobTest {
    //TODO: Create your unit tests
    @Test
    public void testSettingJobId() {
      Job testJob1 = new Job();
      Job testJob2 = new Job();
    Assert.assertNotEquals(testJob1, testJob2);
    }
}
