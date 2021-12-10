# Cheep

Cheep is a microblogging web application; a cheap Twitter. This is a port of the original Cheep application, developed by ScalaBridge London, to Play.


## Building and Running

Use the following sbt commands:

- `build` to compile and test everything
- `deploy` to deploy the frontend to the backend
- `backend / run` to run the backend. Connect to `localhost:9000` to view the site


## Overview

Cheep is a very simple Scala web application. It has a frontend written in [ScalaJS-React](https://github.com/japgolly/scalajs-react) and a backend written in [Play](https://playframework.com/). It is intended an example for people interested in learning Scala, primarily for the backend as that is where the majority of Scala developers work at this point in time.

The backend demonstrates many of the tasks a web developer will have to perform, including testing, but does not have data persistence.
