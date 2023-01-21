package tiny.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import tiny.service.CreateUrlService;

@Controller("/url")
public class CreateUrlController {

    private final CreateUrlService createUrlService;

    @Inject
    public CreateUrlController(CreateUrlService createUrlService) {
        this.createUrlService = createUrlService;
    }

    @Get("/create/{url}")
    public String createUrl(String url) {
        return createUrlService.createUrl(url);
    }
}
