package module3.projectgame.controller;

import module3.projectgame.entity.User;
import module3.projectgame.service.UserService;
import module3.projectgame.utils.Jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static module3.projectgame.repository.UserRepository.getId;

@WebServlet("/decline")
public class DeclineServlet extends HttpServlet {
    private final UserService userService = UserService.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Jsp.forward(req, resp, "decline");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*long id = getId();
        User user = User.with()
                .name(req.getParameter("name")).get();
        userService.update(user);

        Integer newCounter = counter + 1;
        req.setAttribute("counter", newCounter);*/
        /*Integer counter = (Integer) req.getAttribute("counter");
        req.setAttribute("counter", counter + 1);*/
        Jsp.redirect(resp, "newgame");
    }
}
