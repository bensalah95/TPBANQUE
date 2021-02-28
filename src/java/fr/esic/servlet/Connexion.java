package fr.esic.servlet;

import fr.esic.dao.UserDao;
import fr.esic.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Test", urlPatterns = {"/login"})
public class Connexion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request , response);      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String log = request.getParameter("login");
        String mdp = request.getParameter("mdp");

        try {
            
            User u = UserDao.getByLoginAndPassword(log, mdp);
            
            if (u != null) {
                request.getSession(true).setAttribute("user", u);
               // this.getServletContext().getRequestDispatcher("/WEB-INF/Menu.jsp").forward(request, response);
response.sendRedirect("memos");
            } else {
                request.setAttribute("msg", "identifiants incorrects!!");
                this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            }

        } catch (Exception e) {
            PrintWriter out = response.getWriter();
            out.println("err" + e.getMessage());

        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
