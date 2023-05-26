package com.wordhunt.whsolverjl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

/**
 * Serves as the controller for this Spring Boot app.
 * Handles incoming HTTP requests and defines endpoints for API.
 * Endpoint is "/api/submit".
 * Responsible for receiving the data and passing it to Application.java.
 */
@RestController
@RequestMapping("/api")
public class WordhuntController {

  @PostMapping("/submit")
  public ResponseEntity<String> submitForm(@RequestBody FormData formData) {
    System.out.println("HIHIHIHIHIHHI" + formData.getBoardString());
    // Process the form submission logic here
    String boardString = formData.getBoardString();

    WordhuntSolverApplication application = new WordhuntSolverApplication();
    application.processBoard(boardString);

    // Return an appropriate response
    return ResponseEntity.ok("Form submitted successfully");
  }
}

// private class FormData {
//   private String boardString;

//   private String getBoardString() {
//     return boardString;
//   }

//   private void setBoardString(String boardString) {
//     this.boardString = boardString;
//   }
// }