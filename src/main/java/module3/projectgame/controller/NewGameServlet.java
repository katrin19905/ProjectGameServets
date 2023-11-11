package module3.projectgame.controller;

import module3.projectgame.utils.Jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Optional;

@WebServlet("/newgame")
public class NewGameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Integer counter1 = (Integer) req.getSession().getAttribute("counter");
        HttpSession session = req.getSession();
        Optional<Integer> optCounter = Optional.ofNullable((Integer) session.getAttribute("counter"));
        Integer counter = (Integer) session.getAttribute("counter");

        if (counter==null || counter<=0) {

            session.setAttribute("counter", 1);
        } else {

            session.setAttribute("counter", counter);
        }


        Jsp.forward(req, resp, "newgame");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Jsp.redirect(resp, "");
    }
}
