package starter.gradle;

import org.jooby.Jooby;

/**
 * Hello world gradle project.
 */
public class App extends Jooby {

  {
    get(req -> {
      String name = req.param("name").value("Jooby");
      return "Hello " + name + "!";
    });
  }

  public static void main(String[] args) {
    run(App::new, args);
  }
}
