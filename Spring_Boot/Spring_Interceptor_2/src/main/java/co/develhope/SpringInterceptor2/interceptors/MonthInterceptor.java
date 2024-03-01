package co.develhope.SpringInterceptor2.interceptors;

import co.develhope.SpringInterceptor2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class MonthInterceptor implements HandlerInterceptor {

    public List<Month> months;

    public MonthInterceptor() {
        months = new ArrayList<>(Arrays.asList(
                new Month(1, "January" , "Gennaio", "Januar"),
                new Month(2, "February" , "Febbraio", "Februar"),
                new Month(3, "March" , "Marzo", "Marz"),
                new Month(4, "April" , "Aprile", "April"),
                new Month(5, "May" , "Maggio", "Mai"),
                new Month(6, "June" , "Giugno", "Juni")
        ));
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String monthNumberString = request.getHeader("monthNumber");
        if(monthNumberString == null || monthNumberString.isEmpty()){
            response.setStatus(400);
            throw new Exception("Bad request. Month number is required");

        }
        //return true;
        Long monthNumber = Long.parseLong(monthNumberString);
        Optional<Month> month = months.stream().filter(singleMonth->{
            return singleMonth.getMonthNumber() == monthNumber;
        }).findFirst();

        if(month.isPresent()){
            request.setAttribute("MonthInterceptor-month", month.get());
        }else {
            request.setAttribute("MonthInterceptor-month", new Month(666, "nope", "nope", "nope"));
        }
        return true;

    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
    }
}
