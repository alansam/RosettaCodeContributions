
import com.google.gson.Gson;

public class RJSON_Gson {

  public static void main(String[] args) {
    Gson gson = new Gson();
    String json = "{ \"foo\": 1, \"bar\": [ \"10\", \"apples\"] }";

    RJSON_Gson_JsonObject obj = gson.fromJson(json, RJSON_Gson_JsonObject.class);

    System.out.println(obj.getFoo());

    for(String bar : obj.getBar()) {
      System.out.println(bar);
    }

    obj = new RJSON_Gson_JsonObject(2, new String[] { "20", "oranges" });
    json = gson.toJson(obj);

    System.out.println(json);
  }

}

class RJSON_Gson_JsonObject {

  private int foo;
  private String[] bar;

  public RJSON_Gson_JsonObject(int foo, String[] bar) {
    this.foo = foo;
    this.bar = bar;
  }

  public int getFoo() {
    return foo;
  }

  public String[] getBar() {
    return bar;
  }

}
