function fn() {
  // See https://github.com/intuit/karate#karate-configjs for information on
  // this file.

  karate.configure("connectTimeout", 5000);
  karate.configure("readTimeout", 5000);

  var protocol = "http";
  var host = "localhost";

  var microservicePort = karate.properties["microservice.port"];
  if (!microservicePort) {
    microservicePort = "8080";
  }

  config = {};
  config.microserviceUrl = protocol + "://" + host + ":" + microservicePort;
  return config;
}
