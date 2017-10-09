package starter.gradle;

import org.jooby.Jooby;

/**
 * Hello world gradle project.
 */
public class App extends Jooby {

  {
    get("/", () -> "Hello Gradle!!");
  }

  public static void main(String[] args) {
    run(App::new, args);
  }
}
