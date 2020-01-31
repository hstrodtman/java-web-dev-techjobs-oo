package org.launchcode.techjobs_oo.Tests;


import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJob1;
    Job testJob2;

    @Before
    public void makeJobObjects(){
         testJob1 = new Job();
         testJob2 = new Job();
    }

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void testSettingId(){
        assertFalse(testJob1.getId() == testJob2.getId());
        assertTrue((testJob1.getId()  + 1) == testJob2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob3.getName()  == "Product tester");
        assertTrue(testJob3.getEmployer().getValue()  == "ACME");
        assertTrue(testJob3.getLocation().getValue()  == "Desert");
        assertTrue(testJob3.getPositionType().getValue()  == "Quality control");
        assertTrue(testJob3.getCoreCompetency().getValue()  == "Persistence");
        assertTrue(testJob3 instanceof Job);
        assertTrue(testJob3.getEmployer() instanceof Employer);
        assertTrue(testJob3.getLocation() instanceof Location);
        assertTrue(testJob3.getPositionType() instanceof PositionType);
        assertTrue(testJob3.getCoreCompetency() instanceof CoreCompetency);

    }
}
