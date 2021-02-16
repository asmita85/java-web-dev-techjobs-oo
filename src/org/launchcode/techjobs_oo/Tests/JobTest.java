package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.JobField;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job jobEmpty;
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;
    Job jobId;
    Job objOneFieldEmpty;
    Job objOneFieldEmpty2;
    Job objOneFieldEmpty3;
    Job objOneFieldEmpty4;
    Job objOneFieldEmpty5;


    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job();
        test_job4 = new Job();
        test_job5 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        objOneFieldEmpty = new Job();
        objOneFieldEmpty = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        objOneFieldEmpty2 = new Job("jj", new Employer("jj"), new Location("jj"), new PositionType("jj"), new CoreCompetency(""));
        objOneFieldEmpty3 = new Job("jj", new Employer("jj"), new Location("jj"), new PositionType(""), new CoreCompetency("jj"));
        objOneFieldEmpty4 = new Job("jj", new Employer("jj"), new Location(""), new PositionType("jj"), new CoreCompetency("jj"));
        objOneFieldEmpty5 = new Job("jj", new Employer(""), new Location("jj"), new PositionType("jj"), new CoreCompetency("jj"));
        jobEmpty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        jobId = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertEquals(false, test_job1.equals(test_job2));
    }

   @Test
    public void testJobConstructorSetsAllFields(){ assertTrue(test_job3.getEmployer() instanceof Employer);
       assertTrue(test_job3.getEmployer() instanceof Employer);
       assertTrue(test_job3.getLocation() instanceof Location);
       assertTrue(test_job3.getPositionType() instanceof PositionType);
       assertTrue(test_job3.getCoreCompetency() instanceof CoreCompetency);
       assertEquals("Product tester", test_job3.getName());
       assertEquals("ACME", test_job3.getEmployer().toString());
       assertEquals("Desert", test_job3.getLocation().getValue());
       assertEquals("Quality control", test_job3.getPositionType().getValue());
       assertEquals("Persistence", test_job3.getCoreCompetency().getValue());
   }
    @Test
    public void testJobsForEquality() {
        assertFalse(test_job4.equals(test_job5));
    }

    @Test
    public void testShouldReturnEachField() {
        String expected = "\n"+"ID:"+test_job3.getId()+"\n" +
                "Name:"+test_job3.getName()+"\n" +
                "Employer:"+test_job3.getEmployer().getValue()+"\n" +
                "Location:"+test_job3.getLocation().getValue()+"\n" +
                "Position Type:"+test_job3.getPositionType().getValue()+"\n" +
                "Core Competency:"+test_job3.getCoreCompetency().getValue()+"\n";
        String actual = test_job3.toString();
        System.out.println(actual);
        assertEquals(expected, actual);

    }
    @Test
    public void testShouldReturnStringDataNotAvailableIfNameFieldEmpty() {
        String expected = "ID:" + objOneFieldEmpty.getId() + "\n" +
                "Name:Data not available"+"\n"+
                "Employer:" + objOneFieldEmpty.getEmployer().getValue() + "\n" +
                "Location:" + objOneFieldEmpty.getLocation().getValue() + "\n" +
                "Position Type:" + objOneFieldEmpty.getPositionType().getValue() + "\n" +
                "Core Competency:" + objOneFieldEmpty.getCoreCompetency().getValue();
        String actual = objOneFieldEmpty.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testShouldReturnStringDataNotAvailableIfEmployerFieldEmpty() {
        String expected = "ID:" + objOneFieldEmpty5.getId() + "\n" +
                "Name:"+objOneFieldEmpty5.getName()+"\n" +
                "Employer:Data not available"+"\n"+
                "Location:" + objOneFieldEmpty5.getLocation().getValue() + "\n" +
                "Position Type:" + objOneFieldEmpty5.getPositionType().getValue() + "\n" +
                "Core Competency:" + objOneFieldEmpty5.getCoreCompetency().getValue();
        String actual = objOneFieldEmpty5.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testShouldReturnStringDataNotAvailableIfPositionTypeFieldEmpty() {
        String expected = "ID:" + objOneFieldEmpty4.getId() + "\n" +
                "Name:"+objOneFieldEmpty4.getName()+"\n" +
                "Employer:" + objOneFieldEmpty4.getEmployer().getValue() + "\n" +
                "Location:Data not available"+"\n"+
                "Position Type:" + objOneFieldEmpty4.getPositionType().getValue() + "\n" +
                "Core Competency:" + objOneFieldEmpty4.getCoreCompetency().getValue();
        String actual = objOneFieldEmpty4.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testShouldReturnStringDataNotAvailableIfCoreCompetencyFieldEmpty() {
        String expected = "ID:" + objOneFieldEmpty3.getId() + "\n" +
                "Name:"+objOneFieldEmpty3.getName()+"\n" +
                "Employer:" + objOneFieldEmpty3.getEmployer().getValue() + "\n" +
                "Location:" + objOneFieldEmpty3.getLocation().getValue() + "\n" +
                "Position Type:Data not available"+"\n"+
                "Core Competency:" + objOneFieldEmpty3.getCoreCompetency().getValue();
        String actual = objOneFieldEmpty3.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void testShouldReturnStringDataNotAvailableIfOneFieldEmpty() {
        String expected = "ID:" + objOneFieldEmpty2.getId() + "\n" +
                "Name:" + objOneFieldEmpty2.getName() + "\n" +
                "Employer:" + objOneFieldEmpty2.getEmployer().getValue() + "\n" +
                "Location:" + objOneFieldEmpty2.getLocation().getValue() + "\n" +
                "Position Type:" + objOneFieldEmpty2.getPositionType().getValue() + "\n" +
                "Core Competency:Data not available";
        String actual = objOneFieldEmpty2.toString();
        assertEquals(expected, actual);

    }
    @Test
    public void BlancLine() {
        String expected = "\n"+
                "ID:"+test_job3.getId()+"\n" +
                "Name:"+test_job3.getName()+"\n" +
                "Employer:"+test_job3.getEmployer().getValue()+"\n" +
                "Location:"+test_job3.getLocation().getValue()+"\n" +
                "Position Type:"+test_job3.getPositionType().getValue()+"\n" +
                "Core Competency:"+test_job3.getCoreCompetency().getValue()+"\n";
        String actual = test_job3.toString();
        assertEquals(expected, actual);

    }
//    @Test
//    public void nullOnlyID() {
//        String expected = "\n"+"OOPS! This job does not seem to exist"+"\n";
//        String actual = test_job1.toString();
//        assertEquals(expected, actual);
//    }

}
