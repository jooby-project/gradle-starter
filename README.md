[![Build Status](https://travis-ci.org/jooby-project/gradle-starter.svg?branch=master)](https://travis-ci.org/jooby-project/gradle-starter)
# gradle-starter

Starter project for [Gradle](https://gradle.org)

## quick preview

This project contains a simple `Hello World` application.

```java
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
```

## run

    ./gradlew joobyRun

## test
    ./gradlew test

## help

* Read the [module documentation](http://jooby.org/doc/devtools/#gradle)
* Join the [channel](https://gitter.im/jooby-project/jooby)
* Join the [group](https://groups.google.com/forum/#!forum/jooby-project)

