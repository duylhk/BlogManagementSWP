//package assignment.controllers;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import assignment.user.UserDAO;
//import assignment.user.UserDTO;
//
//@WebServlet(name = "UpdateController", urlPatterns = {"/UpdateController"})
//public class UpdateController extends HttpServlet {
//
//    private static final String ERROR = "SearchController";
//    private static final String SUCCESS = "SearchController";
//    private static final String LOGOUT = "LogoutController";
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        String url = ERROR;
//        try {
//            String userID = request.getParameter("userID");
//            String fullName = request.getParameter("fullName");
//            String phone = request.getParameter("phone");
//            String address = request.getParameter("address");
//            String roleID = request.getParameter("roleID");
//            HttpSession session = request.getSession();
//            UserDTO loginUser = (UserDTO) session.getAttribute("LOGIN_USER");
//            String createDate = loginUser.getCreateDate();
//            UserDAO dao = new UserDAO();
//            UserDTO user = new UserDTO(userID, fullName, "", phone, address, createDate, roleID);
//            boolean check = dao.updateUser(user);
//            if (check) {
//                if (userID.equals(loginUser.getUserID()) && !roleID.equals("AD")) {
//                    url = LOGOUT;
//                } else {
//                    url = SUCCESS;
//                }
//            }
//        } catch (Exception e) {
//            log("Error at UpdateController: " + e.toString());
//        } finally {
//            request.getRequestDispatcher(url).forward(request, response);
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
