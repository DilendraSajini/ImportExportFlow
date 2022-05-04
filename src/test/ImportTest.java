package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import app.common.labdata.LabData;
import app.exportdata.labdata.ExportData;

public class ImportTest {
	 private LabData data;

  @Test
  public void start() {
	  data = new ExportData(1);
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
