package controller;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import model.User;

@WebServlet("/emailList")
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }

        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            
            // Nhận dữ liệu mới từ HTML
            String foudation = request.getParameter("foudation");
            String answer1 = request.getParameter("answer1");
            String answer2 = request.getParameter("answer2");
            String contact = request.getParameter("contact");

            // Kiểm tra checkbox, nếu người dùng không tích thì giá trị sẽ bị null, ta chuyển về chuỗi rỗng
            if (answer1 == null) answer1 = "";
            if (answer2 == null) answer2 = "";
            if (foudation == null) foudation = "";
            if (contact == null) contact = "";

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, foudation, answer1, answer2, contact);
//            UserDB.insert(user);

            // set User object in request object and set URL
            request.setAttribute("user", user);
            url = "/thanks.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}