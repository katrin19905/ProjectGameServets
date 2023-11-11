package module3.projectgame.controller;

import module3.projectgame.entity.User;
import module3.projectgame.repository.UserRepository;
import module3.projectgame.service.UserService;
import module3.projectgame.utils.Jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Optional;

@WebServlet("/lose")
public class LoseMemoryServlet extends HttpServlet {
    private final UserService userService = UserService.INSTANCE;


    public void init() {


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

/*        Collection<User> users = userService.getAll();
        request.setAttribute("users", users);*/

        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter==null || counter<=0) {
            session.setAttribute("counter", 1);
        } else {
            session.setAttribute("counter", counter+1);
        }


        /*String name = request.getParameter("name");

        Long id = UserRepository.getId();
        User user = User.with()
                .name(name)
                .id(id).get();
        boolean present = userService.get(user.getId()).isPresent();
        userService.update(user);
        request.setAttribute("user", user);*/



        /*Integer counter = (Integer) request.getAttribute("counter");
        if (counter == null) {
            request.setAttribute("counter", 1);
        } else {
            request.setAttribute("counter", counter + 1);
        }*/

       /* long id = getId(request);
        Optional<User> opUser = userService.get(id);
        if (opUser.isPresent()) {
            request.setAttribute("user", opUser.get());
        }*/
        Jsp.forward(request, response, "lose");


        // Hello
        /*PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*String name = req.getParameter("name");

        Long id = UserRepository.getId();
        User user = User.with()
                .name(name)
                .id(id).get();
        boolean present = userService.get(user.getId()).isPresent();
        userService.update(user);
        req.setAttribute("user", user);*/
        /*if (present&& req.getParameter("update")!=null) {userService.update(user);
        } else if (!present && req.getParameter("create")!=null) userService.create(user);*/
        //Jsp.redirect(resp, "/decline");

    }

    private long getId(HttpServletRequest req) {
        return req.getParameter("id") != null
                ? Long.parseLong("0"+req.getParameter("id"))
                : 0L;
    }
}
