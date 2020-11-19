package cicd.demo.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/healthz")
public class HealthzController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() throws IOException {
        return "OK";
    }
}
