//package lab6;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/CookieExampleServlet")
//public class CookieExampleServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        // Creating a cookie
//        Cookie languageCookie = new Cookie("language", "English");
//        languageCookie.setMaxAge(24 * 60 * 60);
//        response.addCookie(languageCookie);
//
//        // Processing the cookie
//        Cookie[] cookies = request.getCookies();
//        String language = "Unknown";
//
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if ("language".equals(cookie.getName())) {
//                    language = cookie.getValue();
//                    break;
//                }
//            }
//        }
//
//        // Sending the response
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        out.println("<html><head><title>Cookie Example</title></head><body>");
//        out.println("<h3>Language cookie value: " + language + "</h3>");
//        out.println("</body></html>");
//    }
//}
