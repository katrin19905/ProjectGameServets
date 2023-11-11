package module3.projectgame.utils;

import lombok.experimental.UtilityClass;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@UtilityClass
public class Jsp {
    public void forward(HttpServletRequest request, HttpServletResponse response, String uriString) throws ServletException, IOException {
        //String path = "WEB-INF/%s.jsp".formatted(uriString);
        String path = uriString.contains(".jsp")
                ? "WEB-INF/" + uriString
                : "WEB-INF/" + uriString + ".jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
        requestDispatcher.forward(request, response);
    }

    public void redirect(HttpServletResponse resp, String uri) throws IOException {
        resp.sendRedirect(uri);
    }
}
