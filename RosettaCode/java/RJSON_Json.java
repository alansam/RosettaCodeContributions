/*
 * -----------------------------------------------------------------------------
 * JavaFragments:RJSON_Json.java:Aug 6, 2012:9:52:51 AM
 *
 * (C) Copyright Alan Sampson <alansamps@gmail.com> 2012, All rights reserved.
 *
 * #(@) RJSON_Json.java $Header: $
 *
 * -----------------------------------------------------------------------------
 *
 * Created: Aug 6, 2012
 *
 * -+----1----+----2----+----3----+----4----+----5----+----6----+----7----+----8
 */

//package net.podzone.as;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


/**
 * Sample the <a href="http://www.JSON.org">JSON.org</a> Java interface
 * 
 * @author alansampson : <a href="mailto:%22Alan%20Sampson%22%20%3Calansamps@gmail.com%3E">&quot;Alan Sampson&quot; &lt;alansamps@gmail.com&gt;</a>
 * @version 0.1
 *
 */
public class RJSON_Json {

  public static final String ID = "@(#) RJSON_Json $Header: $"; //$NON-NLS-1$

  public static final String MAINT = "@(#) INIT"; //$NON-NLS-1$

  public static final String CLASSNAME = RJSON_Json.class.getSimpleName();

  @SuppressWarnings("unused")
  private static List<String> delims;

  private static final String jsonDwarfs;

  private static final String jsonDwarves;

  private JSONObject jsonObj;

  static {

    @SuppressWarnings("unused")
    String METHOD = ".<clinit>"; // $NON-NLS-1$

    jsonDwarfs = ""
        + "{\n"
        + "    \"P1912_1\" : {\n"
        + "        \"title\"  : \"Snow White and the Seven Dwarfs\",\n"
        + "        \"year\"   : 1912,\n"
        + "        \"medium\" : \"play\",\n"
        + "        \"dwarfs\" : [ \"Blick\", \"Flick\", \"Glick\", \"Snick\", \"Plick\", \"Whick\", \"Quee\" ]\n"
        + "    },\n"
        + "    \"F1937_1\" : {\n"
        + "        \"title\"  : \"Snow White and the Seven Dwarfs\",\n"
        + "        \"year\"   : 1937,\n"
        + "        \"medium\" : \"film\",\n"
        + "        \"dwarfs\" : [ \"Grumpy\", \"Happy\", \"Sleepy\", \"Bashful\", \"Sneezy\", \"Dopey\", \"Doc\" ]\n"
        + "    },\n"
        + "    \"F1987_1\" : {\n"
        + "        \"title\"  : \"Snow White\",\n"
        + "        \"year\"   : 1987,\n"
        + "        \"medium\" : \"film\",\n"
        + "        \"dwarfs\" : [ \"Iddy\", \"Biddy\", \"Kiddy\", \"Diddy\", \"Fiddy\", \"Giddy\", \"Liddy\" ]\n"
        + "    },\n"
        + "    \"F1993_1\" : {\n"
        + "        \"title\"  : \"Happily Ever After\",\n"
        + "        \"year\"   : 1993,\n"
        + "        \"medium\" : \"film\",\n"
        + "        \"dwarfs\" : [ \"Muddy\", \"Sunburn\", \"Blossom\", \"Marina\", \"Critterina\", \"Moonbeam\", \"Thunderella\" ]\n"
        + "    },\n"
        + "    \"F2012_1\" : {\n"
        + "        \"title\"  : \"Mirror, Mirror\",\n"
        + "        \"year\"   : 2012,\n"
        + "        \"medium\" : \"film\",\n"
        + "        \"dwarfs\" : [ \"Grimm\", \"Butcher\", \"Wolf\", \"Napoleon\", \"Half Pint\", \"Grub\", \"Chuckles\" ]\n"
        + "    },\n"
        + "    \"F2012_2\" : {\n"
        + "        \"title\"  : \"Snow White & the Huntsman\",\n"
        + "        \"year\"   : 2012,\n"
        + "        \"medium\" : \"film\",\n"
        + "        \"dwarfs\" : [ \"Beith\", \"Quert\", \"Muir\", \"Coll\", \"Duir\", \"Gus\", \"Gort\", \"Nion\" ]\n"
        + "    }\n"
        + "}\n"
        ;

    jsonDwarves = ""
        + "{\n"
        + "  \"production\": {\n"
        + "    \"medium\": \"book\",\n"
        + "    \"title\": {\n"
        + "      \"content\": \"The Hobbit\",\n"
        + "      \"subtitle\": \"There and Back Again\"\n"
        + "    },\n"
        + "    \"year\": {\n"
        + "      \"content\": 1937,\n"
        + "      \"calendar\": \"Gregorian\"\n"
        + "    },\n"
        + "    \"dwarves\": {\n"
        + "      \"dwarf\": [\n"
        + "        \"Fili\",\n"
        + "        \"Kili\",\n"
        + "        \"Oin\",\n"
        + "        \"Gloin\",\n"
        + "        \"Thorin Oakenshield\",\n"
        + "        \"Dwalin\",\n"
        + "        \"Balin\",\n"
        + "        \"Bifur\",\n"
        + "        \"Bofur\",\n"
        + "        \"Bombur\",\n"
        + "        \"Dori\",\n"
        + "        \"Nori\",\n"
        + "        \"Ori\"\n"
        + "      ]\n"
        + "    }\n"
        + "  }\n"
        + "}\n"
        ;  }

  /**
   * Default constructor
   */
  public RJSON_Json() {

    @SuppressWarnings("unused")
    String METHOD = ".<init>()"; // $NON-NLS-1$

    // TODO Auto-generated constructor stub

    return;
  }

  /**
   * 
   * @param jsonString
   */
  private void jsonString2json(String jsonString) {

    @SuppressWarnings("unused")
    String METHOD = ".jsonString2json()"; //$NON-NLS-1$

    try {
      jsonObj = new JSONObject(new JSONTokener(jsonString));
      System.out.println(jsonObj.toString(2));
    }
    catch (JSONException ex) {
      ex.printStackTrace();
    }

    return;
  }

  /**
   * Create a JSON object that looks like this:
   * <pre>
   * {
   *   "B1955_1" : {
   *       "title" : "The Lord of the Rings",
   *       "year"  : 1955,
   *       "medium" : "book",
   *       "dwarves" : [ "Balin", "Dalin", "Durin", "Gimli", "Thorin" ]
   *   }
   * }
   * </pre>
   */
  private void bean2json() {

    @SuppressWarnings("unused")
    String METHOD = ".bean2json()"; //$NON-NLS-1$

    RJSON_Json_DwarfBean db;
    JSONObject dObj;
    JSONObject bObj;

    try {
      db = new RJSON_Json_DwarfBean();
      db.setTitle("The Lord of the Rings");
      db.setYear(1955);
      db.setMedium("book");
      db.setDwarves(new ArrayList<String>(Arrays.asList("Balin", "Dalin", "Durin", "Gimli", "Thorin")));
      System.out.println(db.toString());

      System.out.println("Make JSONObject from bean");
      dObj = new JSONObject(db);
      System.out.println(dObj.toString(2));
      String[] names = JSONObject.getNames(dObj);
      if (names != null) {
        for (String name : names) {
          System.out.println(name);
        }
      }

      bObj = new JSONObject();
      bObj.put("B1955_1", dObj);
      System.out.println(bObj.toString(2));
    }
    catch (JSONException ex) {
      ex.printStackTrace();
    }

    return;
  }

  /**
   * Driver
   * 
   * @param args
   */
  public static void main(String[] args) {

    @SuppressWarnings("unused")
    String METHOD = ".main()"; //$NON-NLS-1$

    (new RJSON_Json()).jsonString2json(jsonDwarfs);
    (new RJSON_Json()).jsonString2json(jsonDwarves);

    (new RJSON_Json()).bean2json();

    return;
  }
}

