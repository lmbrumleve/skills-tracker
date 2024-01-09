package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String skills() {
        return "<html>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<label>Name:</label>" +
                "<br>" +
                "<form action='form' method='post'>" + //submit a request to /form
                "<input type='text' name='name'>" +
                "<br>" +
                "<label for='firstFavorite'>My favorite language: </label>" +
                "<br>" +
                "<select name= 'firstFavorite' id= 'firstFavorite'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='secondFavorite'>My second favorite language: </label>" +
                "<br>" +
                "<select name= 'secondFavorite' id= 'secondFavorite'>" +
                "<option value = 'Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for= 'thirdFavorite'>My third favorite language: </label>" +
                "<br>" +
                "<select name= 'thirdFavorite' id='thirdFavorite'>" +
                "<option value= 'Java'>Java</option>" +
                "<option value= 'JavaScript'>JavaScript</option>" +
                "<option value= 'Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value= "form", method= RequestMethod.POST)
    public String skillsPost(@RequestParam String name, @RequestParam String firstFavorite,
                             @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return "<html>" +
                "<h1>Name: " +
                name +
                "</h1>"+
                "<ol>" +
                "<li>" + firstFavorite + "</li>" +
                "<li>" + secondFavorite + "</li>" +
                "<li>" + thirdFavorite + "</li>" +
                "</ol>" +
                "</html>";
    }
}
