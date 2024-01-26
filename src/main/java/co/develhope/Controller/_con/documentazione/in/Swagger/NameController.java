package co.develhope.Controller._con.documentazione.in.Swagger;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class NameController {

    @Operation(summary = "This app will return your name with a GET request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Request completed"),
            @ApiResponse(responseCode = "400", description = "Invalid name supplied"),
            @ApiResponse(responseCode = "404", description = "Not found") })
    @GetMapping(path = "/name")
    public String returnName(@RequestParam String nome){
        return "Your name is " + nome;
    }

    @Operation(summary = "This app will return your name inversed with a POST request")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Request completed"),
            @ApiResponse(responseCode = "400", description = "Invalid name supplied"),
            @ApiResponse(responseCode = "404", description = "Not found")})
    @PostMapping(path = "/name")
    public String returnNameInversed(@RequestParam String nome){
        StringBuilder nomeInverso = new StringBuilder();
        nomeInverso.append(nome);
        nomeInverso.reverse();
        return "Your name inverted is " +nomeInverso;
    }

}
