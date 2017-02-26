# akka-http-marshaller
Common entities marshaller

**Usage:**

In your `build.sbt` add the marshaller as a project


```scala

lazy val marshaller =
  ProjectRef(uri("https://github.com/LocalInc/akka-http-marshaller.git#0.0.1"), "marshaller")
  
// add marshaller as a dependency to your project with .dependsOn(marshaller)

```



```scala

import com.localinc.akkahttp.marshalling.Marshaller

object SomeRoute extends Marshaller {

    //your code here

}


```


**Note:**  this project will be added to Maven soon

### Contribution:

please create an issue on `github` and create a branch with this issue then send a pull request
