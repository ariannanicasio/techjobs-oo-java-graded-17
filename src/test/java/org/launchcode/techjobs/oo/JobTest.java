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
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String testToString = testJob.toString();
        String expectedToString = System.lineSeparator()+"ID:  " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() + "\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency()+System.lineSeparator();
         Assert.assertEquals(testToString, expectedToString);
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String testJobToString = testJob.toString();
        int expectedLength = testJobToString.length();
        char expectedCharacter = 'I';
        char expectedEndCharacter = 'e';
        Assert.assertEquals(testJobToString.charAt(1), expectedCharacter);
        Assert.assertEquals(testJobToString.charAt(expectedLength - 2), expectedEndCharacter);
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job("Product tester",
                new Employer(""),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        String expectedToString = System.lineSeparator()+"ID:  " + testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: Data not available\n" +
                "Location: " + testJob.getLocation() + "\n" +
                "Position Type: " + testJob.getPositionType() + "\n" +
                "Core Competency: " + testJob.getCoreCompetency()+System.lineSeparator();
        Assert.assertEquals(testJob.toString(), expectedToString);
    }
}
