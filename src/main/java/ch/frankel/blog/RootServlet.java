package ch.frankel.blog;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RootServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Foo foo = new Foo(1L, "Foo");
        req.setAttribute("foo", foo);
        req.getRequestDispatcher("/WEB-INF/page/index.jsp").forward(req, resp);
    }
}
