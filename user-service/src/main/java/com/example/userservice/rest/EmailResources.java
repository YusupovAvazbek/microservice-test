package com.example.userservice.rest;

import com.example.userservice.service.EmailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
@RequiredArgsConstructor
@SecurityRequirement(name = "Authorization")
public class EmailResources {
    private final EmailService emailService;
    @Operation(
            method = "Send Email",
            summary = "Send Email",
            description = "Need to send UsersDto to this end point to send email to user",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Users info",
                    content = @Content(mediaType = "application/json")
            )
    )
    @PostMapping
    public ResponseEntity<Boolean> sendMessage(@RequestParam String email, String message){
        return ResponseEntity.ok(emailService.sendEmail(email,message));
    }
}
