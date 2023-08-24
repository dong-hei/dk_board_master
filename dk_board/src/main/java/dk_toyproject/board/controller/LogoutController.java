package toyproject.board.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
@RequestMapping
public class LogoutController {

    @GetMapping("https://nid.naver.com/nidlogin.logout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();

        session.invalidate();
        return "redirect:/";
    }



}
