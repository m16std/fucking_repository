package ohh.Fuck2;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Fuck2Controller {

    @GetMapping("/")
    public String home() {
        return "Fuck";
    }

    @GetMapping("/time")
    public String timer(@RequestParam(name="time", required=false) String name, Model model) {
        LocalTime currentTime = new LocalTime();
        model.addAttribute("time", currentTime);
        return "TimePage";
    }

}
