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
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Assert.assertEquals(testJob.getName(), "Product tester");
        Assert.assertEquals(testJob.getEmployer().getValue(), "ACME");
        Assert.assertEquals(testJob.getLocation().getValue(), "Desert");
        Assert.assertEquals(testJob.getPositionType().getValue(), "Quality control");
        Assert.assertEquals(testJob.getCoreCompetency().getValue(), "Persistence");
        Assert.assertTrue(testJob.getEmployer() instanceof Employer);
        Assert.assertTrue(testJob.getLocation() instanceof Location);
        Assert.assertTrue(testJob.getPositionType() instanceof PositionType);
        Assert.assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testJobsForEquality() {
        Job testJob = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Job testJob2 = new Job(
                "Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence")
        );
        Assert.assertFalse(testJob.equals(testJob2));
    }
}
