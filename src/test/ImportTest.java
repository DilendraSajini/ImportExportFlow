package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import app.common.labdata.LabData;

public class ImportTest {
	 private LabData data;

  @Test
  public void start() {
  }
  
  @Test
  public void end() {
  }
  
  @BeforeClass
  public void setUp() {
	  System.out.println("Before start the method");
  }
  
  @AfterClass
  public void finish() {
	  System.out.println("After end the method");
  }
}
