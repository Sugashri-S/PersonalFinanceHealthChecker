package com.finance;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/budget")
public class BudgetServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws IOException {

        double budget =
            Double.parseDouble(request.getParameter("budget"));

        double expense =
            Double.parseDouble(request.getParameter("expense"));

        double remaining = budget - expense;

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<h1>Budget Result</h1>");
        out.println("<h2>Budget: ₹" + budget + "</h2>");
        out.println("<h2>Expense: ₹" + expense + "</h2>");
        out.println("<h2>Remaining Amount: ₹" + remaining + "</h2>");

        if (remaining > 0) {
            out.println("<h2>Status: Within Budget ✅</h2>");
        } else {
            out.println("<h2>Status: Budget Exceeded ❌</h2>");
        }
    }
}