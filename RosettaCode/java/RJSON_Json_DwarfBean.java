/*
 * -----------------------------------------------------------------------------
 * JavaFragments:RJSON_Json_DwarfBean.java:Aug 6, 2012:9:53:59 AM
 *
 * (C) Copyright Alan Sampson <alansamps@gmail.com> 2012, All rights reserved.
 *
 * #(@) RJSON_Json_DwarfBean.java $Header: $
 *
 * -----------------------------------------------------------------------------
 *
 * Created: Aug 6, 2012
 *
 * -+----1----+----2----+----3----+----4----+----5----+----6----+----7----+----8
 */

//package net.podzone.as;

import java.util.List;

/**
 * Test bean object for RJSON_Json
 * 
 * @author alansampson : <a href="mailto:%22Alan%20Sampson%22%20%3Calansamps@gmail.com%3E">&quot;Alan Sampson&quot;
 *         &lt;alansamps@gmail.com&gt;</a>
 * @version 0.1
 * 
 */
public class RJSON_Json_DwarfBean {

  public static final String ID = "@(#) RJSON_Json_DwarfBean $Header: $"; //$NON-NLS-1$

  public static final String MAINT = "@(#) INIT"; //$NON-NLS-1$

  public static final String CLASSNAME = RJSON_Json_DwarfBean.class.getSimpleName();

  private String title;

  private Integer year;

  private String medium;

  private List<String> dwarves;

  /**
   * Default constructor
   */
  public RJSON_Json_DwarfBean() {

    @SuppressWarnings("unused")
    String METHOD = ".<init>()"; // $NON-NLS-1$

    // TODO Auto-generated constructor stub

    return;
  }

  
  /**
   * @return the title
   */
  public String getTitle() {
  
    return title;
  }

  
  /**
   * @param title_ the title to set
   */
  public void setTitle(String title_) {
  
    this.title = title_;
  
    return;
  }

  
  /**
   * @return the year
   */
  public Integer getYear() {
  
    return year;
  }

  
  /**
   * @param year_ the year to set
   */
  public void setYear(Integer year_) {
  
    this.year = year_;
  
    return;
  }

  
  /**
   * @return the medium
   */
  public String getMedium() {
  
    return medium;
  }

  
  /**
   * @param medium_ the medium to set
   */
  public void setMedium(String medium_) {
  
    this.medium = medium_;
  
    return;
  }

  /**
   * @return the dwarves
   */
  public List<String> getDwarves() {
  
    return dwarves;
  }

  
  /**
   * @param dwarves_ the dwarves to set
   */
  public void setDwarves(List<String> dwarves_) {
  
    this.dwarves = dwarves_;
  
    return;
  }

  /* (non-Javadoc)
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {

    String classId = String.format("%s@%08x ", this.getClass().getSimpleName(), hashCode());
    String ts = ""
      + classId
      + "[title=" + getTitle()
      + ", year=" + getYear()
      + ", medium=" + getMedium()
      + ", dwarves=" + getDwarves()
      + "]"
      ;
    return ts;
  }
}

