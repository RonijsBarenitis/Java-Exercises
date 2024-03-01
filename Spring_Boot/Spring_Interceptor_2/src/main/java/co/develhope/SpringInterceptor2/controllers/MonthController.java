package co.develhope.SpringInterceptor2.controllers;

import co.develhope.SpringInterceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("/{monthNumber}")
    public Month getMonth(HttpServletRequest request, @PathVariable long monthNumber){
        Month month = (Month) request.getAttribute("MonthInterceptor-month");
        return month;
    }
}
